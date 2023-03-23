package com.retail.colonel.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.retail.colonel.mapper.GradeMapper;
import com.retail.colonel.domain.GradeEntity;
import com.retail.colonel.service.GradeService;


@Service("gradeService")
public class GradeServiceImpl extends ServiceImpl<GradeMapper, GradeEntity> implements GradeService {



}
