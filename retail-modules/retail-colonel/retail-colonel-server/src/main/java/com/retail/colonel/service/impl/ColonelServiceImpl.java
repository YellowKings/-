package com.retail.colonel.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.retail.colonel.mapper.ColonelMapper;
import com.retail.colonel.domain.ColonelEntity;
import com.retail.colonel.service.ColonelService;


@Service("colonelService")
public class ColonelServiceImpl extends ServiceImpl<ColonelMapper, ColonelEntity> implements ColonelService {



}
