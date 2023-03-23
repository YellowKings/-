package com.retail.auth.service.impl;

import cn.hutool.core.lang.Validator;
import cn.hutool.crypto.SecureUtil;
import com.alibaba.fastjson.JSON;
import com.retail.auth.feign.UserFeignService;
import com.retail.auth.service.AuthService;
import com.retail.common.constant.JwtConstants;
import com.retail.common.constant.TokenConstants;
import com.retail.common.domain.response.JwtResponse;
import com.retail.common.domain.vo.UserEntityVo;
import com.retail.common.domain.vo.UserLoginPasswordVo;
import com.retail.common.exception.BizException;
import com.retail.common.result.Result;
import com.retail.common.utils.JwtUtils;
import com.retail.common.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @author AuthSerivceImpl
 * @BelongsProject: retail-cloud
 * @BelongsPackage: com.retail.auth.service.impl
 * @date: 2023-03-23  17:21
 * @Created by:  12871
 * @Description:
 * @Version:
 */
@Service
public class AuthSerivceImpl implements AuthService {

    @Autowired
    private UserFeignService userFeignService;

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Override
    public Result<JwtResponse>  loginPassword(UserLoginPasswordVo userLoginPasswordVo) {

        //判断不为空
        if (StringUtils.isBlank(userLoginPasswordVo.getPhone())){
            throw new BizException(502,"手机号不能为空");
        }
        //判断是否合法
        if (!Validator.isMobile(userLoginPasswordVo.getPhone())){
            throw new BizException(502,"手机号不合法");
        }

        if (StringUtils.isBlank(userLoginPasswordVo.getPassword())){
            throw new BizException(502,"密码不能为空");
        }
        Result<UserEntityVo> userEntityVoResult = userFeignService.loginPassword(userLoginPasswordVo);
        UserEntityVo entityVo = userEntityVoResult.getData();


        //MD5加密
        String passwordMd5 = SecureUtil.md5(userLoginPasswordVo.getPassword() + "|" + entityVo.getSalt());
        if (!entityVo.getPassword().equals(passwordMd5)){
            throw  new BizException(502,"密码错误，请重新输入");
        }
        String userKey = UUID.randomUUID().toString().replaceAll("_", "");
        Map<String, Object> map = new HashMap<>();
        map.put(JwtConstants.DETAILS_USER_ID,entityVo.getId());
        map.put(JwtConstants.USER_KEY,userKey);

        String token = JwtUtils.createToken(map);
        System.out.println(token);
        redisTemplate.opsForValue().set(TokenConstants.LOGIN_TOKEN_KEY+userKey,
                JSON.toJSONString(entityVo),1, TimeUnit.DAYS);
        JwtResponse jwtResponse = new JwtResponse();
        jwtResponse.setToken(token);
        jwtResponse.setExpireTime("1Days");
        return Result.success(jwtResponse);
    }
}
