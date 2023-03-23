package com.retail.auth.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author UserFeignService
 * @BelongsProject: retail-cloud
 * @BelongsPackage: com.retail.auth.feign
 * @date: 2023-03-23  17:22
 * @Created by:  12871
 * @Description:
 * @Version:
 */
@FeignClient("retail-user")
public interface UserFeignService {
}
