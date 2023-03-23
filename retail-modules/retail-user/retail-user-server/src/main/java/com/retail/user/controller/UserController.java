package com.retail.user.controller;


import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.Validator;
import com.retail.common.domain.vo.UserEntityVo;
import com.retail.common.domain.vo.UserLoginPasswordVo;
import com.retail.common.exception.BizException;
import com.retail.common.result.Result;
import com.retail.common.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.retail.user.service.UserService;
import com.retail.user.domain.UserEntity;

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


    @PostMapping("/loginPassword")
    public Result<UserEntityVo> loginPassword(@RequestBody UserLoginPasswordVo userLoginPasswordVo){
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

        Result<UserEntity> userEntityResult = userService.loginPassword(userLoginPasswordVo);
        UserEntity data = userEntityResult.getData();
        UserEntityVo userEntityVo = new UserEntityVo();
        BeanUtil.copyProperties(data,userEntityVo);
        return  Result.success(userEntityVo);
    }

}
