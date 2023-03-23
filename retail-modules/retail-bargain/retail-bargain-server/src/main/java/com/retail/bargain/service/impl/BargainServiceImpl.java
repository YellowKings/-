package com.retail.bargain.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.retail.bargain.mapper.BargainMapper;
import com.retail.bargain.domain.BargainEntity;
import com.retail.bargain.service.BargainService;


@Service("bargainService")
public class BargainServiceImpl extends ServiceImpl<BargainMapper, BargainEntity> implements BargainService {



}
