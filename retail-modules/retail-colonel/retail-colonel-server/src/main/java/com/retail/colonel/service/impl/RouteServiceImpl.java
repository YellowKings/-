package com.retail.colonel.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.retail.colonel.mapper.RouteMapper;
import com.retail.colonel.domain.RouteEntity;
import com.retail.colonel.service.RouteService;


@Service("routeService")
public class RouteServiceImpl extends ServiceImpl<RouteMapper, RouteEntity> implements RouteService {



}
