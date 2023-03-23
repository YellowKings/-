package com.retail.shop.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.retail.shop.mapper.SpecificationMapper;
import com.retail.shop.domain.SpecificationEntity;
import com.retail.shop.service.SpecificationService;


@Service("specificationService")
public class SpecificationServiceImpl extends ServiceImpl<SpecificationMapper, SpecificationEntity> implements SpecificationService {



}
