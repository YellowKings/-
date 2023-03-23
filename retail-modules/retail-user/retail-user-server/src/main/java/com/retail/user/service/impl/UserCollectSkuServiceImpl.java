package com.retail.user.service.impl;

import com.retail.user.domain.UserCollectSkuEntity;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.retail.user.mapper.UserCollectSkuMapper;

import com.retail.user.service.UserCollectSkuService;


@Service("userCollectSkuService")
public class UserCollectSkuServiceImpl extends ServiceImpl<UserCollectSkuMapper, UserCollectSkuEntity> implements UserCollectSkuService {



}
