package com.retail.auth.service.impl;

import com.retail.auth.service.AuthService;
import com.retail.common.domain.vo.UserEntityVo;
import com.retail.common.result.Result;
import com.retail.common.utils.StringUtils;
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

    @Override
    public Result register(UserEntityVo userEntityVo) {
        if (StringUtils.isEmpty(userEntityVo.getUsername())){

        }
        return null;
    }
}
