package com.retail.shop.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.retail.shop.mapper.ShopMapper;
import com.retail.shop.domain.ShopEntity;
import com.retail.shop.service.ShopService;


@Service("shopService")
public class ShopServiceImpl extends ServiceImpl<ShopMapper, ShopEntity> implements ShopService {



}
