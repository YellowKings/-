package com.retail.user.controller;

import java.util.List;


import cn.hutool.core.bean.BeanUtil;
import com.retail.common.domain.request.UserEntityRequest;
import com.retail.common.domain.vo.UserEntityVo;
import com.retail.common.result.Result;
import com.retail.user.domain.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.retail.user.service.UserService;


/**
 * 用户表
 *
 * @author fengge
 * @email 1287137373@qq.com
 * @date 2023-03-22 18:26:56
 */

@RestController
@RequestMapping("user/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 注册
     * @param userEntityRequest
     * @return
     */
    @PostMapping("/register")
    public Result register(@RequestBody UserEntityRequest userEntityRequest){
        return userService.register(userEntityRequest);
    }


    @PostMapping("/userInfo")
    public Result<UserEntityVo> userInfo(){
        UserEntity userEntity = userService.userInfo();
        UserEntityVo userEntityVo = new UserEntityVo();
        BeanUtil.copyProperties(userEntity,userEntityVo);
        return Result.success(userEntityVo);
    }
}
