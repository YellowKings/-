package com.retail.shop.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.retail.shop.mapper.InventoryMapper;
import com.retail.shop.domain.InventoryEntity;
import com.retail.shop.service.InventoryService;


@Service("inventoryService")
public class InventoryServiceImpl extends ServiceImpl<InventoryMapper, InventoryEntity> implements InventoryService {



}
