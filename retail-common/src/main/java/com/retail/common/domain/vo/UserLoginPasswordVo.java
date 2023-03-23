package com.retail.common.domain.vo;

import lombok.Data;

/**
 * @BelongsProject: retail-cloud
 * @BelongsPackage: com.retail.common.domain.vo
 * @Classname: UserLoginPasswordVo
 * @CreateTime: 2023-03-23  18:50
 * @Created by: 喵喵
 * @Description: 用户密码登录
 * @Version:
 */
@Data
public class UserLoginPasswordVo {

    /**
     * 手机号
     */
    private String phone;

    /**
     * 密码
     */
    private String password;


}
