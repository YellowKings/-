package com.retail.shop.service.impl;

import com.retail.shop.domain.ClassifiedEntity;
import com.retail.shop.mapper.ClassifiedMapper;
import com.retail.shop.service.ClassifiedService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;



@Service("classifiedService")
public class ClassifiedServiceImpl extends ServiceImpl<ClassifiedMapper, ClassifiedEntity> implements ClassifiedService {



}
