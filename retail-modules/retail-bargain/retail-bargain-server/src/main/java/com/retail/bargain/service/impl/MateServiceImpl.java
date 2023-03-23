package com.retail.bargain.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.retail.bargain.mapper.MateMapper;
import com.retail.bargain.domain.MateEntity;
import com.retail.bargain.service.MateService;


@Service("mateService")
public class MateServiceImpl extends ServiceImpl<MateMapper, MateEntity> implements MateService {



}
