package com.retail.common.domain.response;

import lombok.Data;

/**
 * @BelongsProject: retail-cloud
 * @BelongsPackage: com.retail.common.domain.response
 * @Classname: JwtResponse
 * @CreateTime: 2023-03-23  22:09
 * @Created by: 喵喵
 * @Description:
 * @Version:
 */
@Data
public class JwtResponse {

    private String token;
    private String expireTime;
}
