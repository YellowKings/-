package com.retail.common.domain.request;

import lombok.Data;

/**
 * @author UserEntityRequest
 * @BelongsProject: retail-cloud
 * @BelongsPackage: com.retail.common.domain.request
 * @date: 2023-03-23  19:02
 * @Created by:  12871
 * @Description:
 * @Version:
 */
@Data
public class UserEntityRequest {
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;

    private String passwordVerify;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 短信
     */
    private String code;
}
