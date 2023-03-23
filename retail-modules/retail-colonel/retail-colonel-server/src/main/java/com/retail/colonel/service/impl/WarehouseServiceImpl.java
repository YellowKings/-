package com.retail.colonel.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.retail.colonel.mapper.WarehouseMapper;
import com.retail.colonel.domain.WarehouseEntity;
import com.retail.colonel.service.WarehouseService;


@Service("warehouseService")
public class WarehouseServiceImpl extends ServiceImpl<WarehouseMapper, WarehouseEntity> implements WarehouseService {



}
