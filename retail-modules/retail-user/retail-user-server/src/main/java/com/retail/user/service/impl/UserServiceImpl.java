package com.retail.user.service.impl;

import cn.hutool.crypto.SecureUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.nacos.client.naming.utils.CollectionUtils;
import com.retail.common.constant.JwtConstants;
import com.retail.common.constant.TokenConstants;
import com.retail.common.domain.vo.UserLoginPasswordVo;
import com.retail.common.exception.BizException;
import com.retail.common.result.Result;
import com.retail.common.utils.JwtUtils;
import com.retail.user.domain.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.retail.user.mapper.UserMapper;
import com.retail.user.service.UserService;


@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {

    @Autowired
   private   RedisTemplate<String,String> redisTemplate;

    @Override
    public Result loginPassword(UserLoginPasswordVo userLoginPasswordVo) {
        //判断用户是否存在
        List<UserEntity> list = this.list(new QueryWrapper<UserEntity>().lambda()
                .eq(UserEntity::getPhone, userLoginPasswordVo.getPhone()));
        if (CollectionUtils.isEmpty(list)){
            throw  new BizException(502,"用户没有注册，请注册");
        }
        UserEntity userEntity = list.get(0);
        //MD5加密
        String passwordMd5 = SecureUtil.md5(userLoginPasswordVo.getPassword() + "|" + userEntity.getSalt());
        if (!userEntity.getPassword().equals(passwordMd5)){
            throw  new BizException(502,"密码错误，请重新输入");
        }
        String userKey = UUID.randomUUID().toString().replaceAll("_", "");
        Map<String, Object> map = new HashMap<>();
        map.put(JwtConstants.DETAILS_USER_ID,userEntity.getId());
        map.put(JwtConstants.USER_KEY,userKey);

        String token = JwtUtils.createToken(map);
        System.out.println(token);
        redisTemplate.opsForValue().set(TokenConstants.LOGIN_TOKEN_KEY+userKey,
                JSON.toJSONString(userEntity),1, TimeUnit.DAYS);
        return Result.success("成功");
    }
}
