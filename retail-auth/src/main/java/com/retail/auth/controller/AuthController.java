package com.retail.auth.controller;

import com.retail.auth.feign.UserFeignService;
import com.retail.auth.service.AuthService;
import com.retail.common.domain.request.UserEntityRequest;
import com.retail.common.domain.vo.UserEntityVo;
import com.retail.common.domain.vo.UserLoginPasswordVo;
import com.retail.common.result.Result;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author AuthController
 * @BelongsProject: retail-cloud
 * @BelongsPackage: com.retail.auth.controller
 * @date: 2023-03-23  17:20
 * @Created by:  12871
 * @Description:
 * @Version:
 */
@RequestMapping
@RestController
public class AuthController {

    @Autowired
    private AuthService authService;
    @Autowired
    private UserFeignService userFeignService;
    @PostMapping("/register")
    public Result register(@RequestBody UserEntityRequest userEntityRequest){
        return authService.register(userEntityRequest);
    }

    @GetMapping("/userInfo")
    public Result<UserEntityVo> userInfo() {
        return authService.userInfo();
    }

    @PostMapping("/loginPassword")
    public Result loginPassword(@RequestBody UserLoginPasswordVo userLoginPasswordVo){
        Result result= userFeignService.loginPassword(userLoginPasswordVo);
        return result;
    }

}
