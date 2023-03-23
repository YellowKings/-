package com.retail.user.service.impl;


import com.retail.common.domain.vo.UserLoginPasswordVo;
import com.retail.common.exception.BizException;
import com.retail.common.result.Result;

import com.retail.user.domain.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.retail.user.mapper.UserMapper;
import com.retail.user.service.UserService;


@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {

    @Autowired
   private   RedisTemplate<String,String> redisTemplate;

    @Override
    public Result<UserEntity> loginPassword(UserLoginPasswordVo userLoginPasswordVo) {
        //判断用户是否存在

        UserEntity userEntity = baseMapper.selectOne(new QueryWrapper<UserEntity>().lambda()
                .eq(UserEntity::getPhone, userLoginPasswordVo.getPhone()));
        if (userEntity==null){
            throw  new BizException(502,"用户没有注册，请注册");
        }

        return Result.success(userEntity);
    }
}
