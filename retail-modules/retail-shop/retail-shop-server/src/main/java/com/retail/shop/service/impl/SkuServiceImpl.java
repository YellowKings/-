package com.retail.shop.service.impl;

import com.retail.shop.domain.SkuEntity;
import com.retail.shop.mapper.SkuMapper;
import com.retail.shop.service.SkuService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;



@Service("skuService")
public class SkuServiceImpl extends ServiceImpl<SkuMapper, SkuEntity> implements SkuService {



}
