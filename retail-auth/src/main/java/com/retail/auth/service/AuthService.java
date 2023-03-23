package com.retail.auth.service;

import com.retail.common.domain.response.JwtResponse;
import com.retail.common.domain.vo.UserLoginPasswordVo;
import com.retail.common.result.Result;

/**
 * @author AuthService
 * @BelongsProject: retail-cloud
 * @BelongsPackage: com.retail.auth.service
 * @date: 2023-03-23  17:20
 * @Created by:  12871
 * @Description:
 * @Version:
 */
public interface AuthService {


    Result<JwtResponse> loginPassword(UserLoginPasswordVo userLoginPasswordVo);


}
