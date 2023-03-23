package com.retail.user.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.retail.user.mapper.PowerUserMapper;
import com.retail.user.domain.PowerUserEntity;
import com.retail.user.service.PowerUserService;


@Service("powerUserService")
public class PowerUserServiceImpl extends ServiceImpl<PowerUserMapper, PowerUserEntity> implements PowerUserService {



}
