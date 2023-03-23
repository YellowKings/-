package com.retail.colonel.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.retail.colonel.mapper.ColonelApplyMapper;
import com.retail.colonel.domain.ColonelApplyEntity;
import com.retail.colonel.service.ColonelApplyService;


@Service("colonelApplyService")
public class ColonelApplyServiceImpl extends ServiceImpl<ColonelApplyMapper, ColonelApplyEntity> implements ColonelApplyService {



}
