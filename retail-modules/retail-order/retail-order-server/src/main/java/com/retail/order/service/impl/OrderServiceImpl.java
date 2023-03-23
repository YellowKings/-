package com.retail.order.service.impl;

import com.retail.order.domain.OrderEntity;
import com.retail.order.mapper.OrderMapper;
import com.retail.order.service.OrderService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;





@Service("orderService")
public class OrderServiceImpl extends ServiceImpl<OrderMapper, OrderEntity> implements OrderService {



}
