package com.retail.auth.controller;

import com.retail.auth.service.AuthService;
import com.retail.common.domain.request.UserEntityRequest;
import com.retail.common.domain.vo.UserEntityVo;
import com.retail.common.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author AuthController
 * @BelongsProject: retail-cloud
 * @BelongsPackage: com.retail.auth.controller
 * @date: 2023-03-23  17:20
 * @Created by:  12871
 * @Description:
 * @Version:
 */
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public Result register(@RequestBody UserEntityRequest userEntityRequest){
        return authService.register(userEntityRequest);
    }

    @GetMapping("/userInfo")
    public Result<UserEntityVo> userInfo(){
        return authService.userInfo();
    }
}
