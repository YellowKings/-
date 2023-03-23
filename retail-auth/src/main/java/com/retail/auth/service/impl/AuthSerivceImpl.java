package com.retail.auth.service.impl;

import com.retail.auth.feign.UserFeignService;
import com.retail.auth.service.AuthService;
import com.retail.common.domain.request.UserEntityRequest;

import com.retail.common.domain.vo.UserEntityVo;
import com.retail.common.exception.BizException;
import com.retail.common.result.Result;
import com.retail.common.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public Result register(UserEntityRequest userEntityRequest) {
        if (StringUtils.isEmpty(userEntityRequest.getUsername())){
            throw new  BizException(501,"请输入账号");
        }
        if (StringUtils.isEmpty(userEntityRequest.getPassword())){
            throw new  BizException(501,"请输入密码");
        }
        if (StringUtils.isEmpty(userEntityRequest.getPasswordVerify())){
            throw new  BizException(501,"确认密码不能为空");
        }
        if (userEntityRequest.getUsername().equals(userEntityRequest.getPasswordVerify())){
            throw new  BizException(501,"密码与确认密码不同");
        }
        if (StringUtils.isEmpty(userEntityRequest.getPhone())){
            throw new  BizException(501,"手机号不能为空");
        }
        if (StringUtils.isEmpty(userEntityRequest.getCode())){
            throw new  BizException(501,"短信不能为空");
        }

        Result result=userFeignService.register(userEntityRequest);
        return result;
    }

    @Override
    public Result<UserEntityVo> userInfo() {
        Result<UserEntityVo> userEntityVoResult = userFeignService.userInfo();
        return userEntityVoResult;
    }
}
