package com.retail.gateway.config;

import com.alibaba.csp.sentinel.adapter.gateway.common.api.ApiDefinition;
import com.alibaba.csp.sentinel.adapter.gateway.common.api.ApiPathPredicateItem;
import com.alibaba.csp.sentinel.adapter.gateway.common.api.ApiPredicateItem;
import com.alibaba.csp.sentinel.adapter.gateway.common.api.GatewayApiDefinitionManager;
import com.alibaba.csp.sentinel.adapter.gateway.common.rule.GatewayFlowRule;
import com.alibaba.csp.sentinel.adapter.gateway.common.rule.GatewayRuleManager;
import com.alibaba.csp.sentinel.adapter.gateway.sc.SentinelGatewayFilter;
import com.alibaba.csp.sentinel.adapter.gateway.sc.callback.BlockRequestHandler;
import com.alibaba.csp.sentinel.adapter.gateway.sc.callback.GatewayCallbackManager;
import com.alibaba.csp.sentinel.adapter.gateway.sc.exception.SentinelGatewayBlockExceptionHandler;
import com.retail.common.result.Result;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.codec.ServerCodecConfigurer;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.web.reactive.result.view.ViewResolver;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * sentinel限流的配置
 */
@Configuration
public class GatewayConfiguration {

   private final List<ViewResolver> viewResolvers;

   private final ServerCodecConfigurer serverCodecConfigurer;

   public GatewayConfiguration(ObjectProvider<List<ViewResolver>> viewResolversProvider,
                               ServerCodecConfigurer serverCodecConfigurer) {
      this.viewResolvers = viewResolversProvider.getIfAvailable(Collections::emptyList);
      this.serverCodecConfigurer = serverCodecConfigurer;
   }
   /**
    * 配置限流的异常处理器:SentinelGatewayBlockExceptionHandler
    */
   @Bean
   @Order(Ordered.HIGHEST_PRECEDENCE)
   public SentinelGatewayBlockExceptionHandler sentinelGatewayBlockExceptionHandler() {
      return new SentinelGatewayBlockExceptionHandler(viewResolvers, serverCodecConfigurer);
   }
   /**
    * 配置限流过滤器
    */
   @Bean
   @Order(Ordered.HIGHEST_PRECEDENCE)
   public GlobalFilter sentinelGatewayFilter() {
      return new SentinelGatewayFilter();
   }

   /**
    * 配置初始化的限流参数
    *  用于指定资源的限流规则.
    *      1.资源名称 (路由id)
    *      2.配置统计时间
    *      3.配置限流阈值
    */
   @PostConstruct
   public void initGatewayRules() {
      Set<GatewayFlowRule> rules = new HashSet<>();
      // *** 基于服务限流 GatewayFlowRule("服务名")
      // setCount 访问次数
      // setIntervalSec 美妙
//       rules.add(new GatewayFlowRule("bawei-auth")
//             .setCount(2)
//             .setIntervalSec(1)
//       );
      rules.add(new GatewayFlowRule("login_api")
         .setCount(3).setIntervalSec(60)
      );
      GatewayRuleManager.loadRules(rules);
   }

   /**
    * 自定义API限流分组
    *      1.定义分组
    *      2.对小组配置限流规则
    */
   @PostConstruct
   private void initCustomizedApis() {
      Set<ApiDefinition> definitions = new HashSet<>();
//      ApiDefinition api1 = new ApiDefinition("a")
//            .setPredicateItems(new HashSet<ApiPredicateItem>() {{
//               add(new ApiPathPredicateItem().setPattern("/auth/**"). //以/product-service/product/开都的所有url
//                     setMatchStrategy(SentinelGatewayConstants.URL_MATCH_STRATEGY_PREFIX));
//            }});
      ApiDefinition api2 = new ApiDefinition("login_api")
            .setPredicateItems(new HashSet<ApiPredicateItem>() {{
               add(new ApiPathPredicateItem().setPattern("/auth/login")); //完全匹配/order-service/order 的url
            }});
//      definitions.add(api1);
      definitions.add(api2);
      GatewayApiDefinitionManager.loadApiDefinitions(definitions);
   }

   /**
    * 自定义限流处理器
    */
   @PostConstruct
   public void initBlockHandlers() {
      BlockRequestHandler blockHandler = new BlockRequestHandler() {
         public Mono<ServerResponse> handleRequest(ServerWebExchange serverWebExchange, Throwable throwable) {
            return ServerResponse.status(HttpStatus.OK)
                  .contentType(MediaType.APPLICATION_JSON_UTF8)
                  .body(BodyInserters.fromObject(Result.error("不好意思,限流啦")));
         }
      };
      GatewayCallbackManager.setBlockHandler(blockHandler);
   }
}
