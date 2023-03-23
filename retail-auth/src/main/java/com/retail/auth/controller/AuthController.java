package com.retail.auth.controller;

import com.retail.auth.service.AuthService;
import com.retail.common.domain.response.JwtResponse;
import com.retail.common.domain.vo.UserLoginPasswordVo;
import com.retail.common.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
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




    @PostMapping("/loginPassword")
    public Result<JwtResponse> loginPassword(@RequestBody UserLoginPasswordVo userLoginPasswordVo){


        return authService.loginPassword(userLoginPasswordVo);
    }

}
