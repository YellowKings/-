package com.retail.shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.retail.shop.domain.SpuEntity;
import com.retail.shop.mapper.SpuMapper;
import com.retail.shop.service.SpuService;
import org.springframework.stereotype.Service;



@Service("spuService")
public class SpuServiceImpl extends ServiceImpl<SpuMapper, SpuEntity> implements SpuService {



}
