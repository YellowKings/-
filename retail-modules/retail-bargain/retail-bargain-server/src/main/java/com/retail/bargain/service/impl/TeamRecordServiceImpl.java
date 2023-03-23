package com.retail.bargain.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.retail.bargain.mapper.TeamRecordMapper;
import com.retail.bargain.domain.TeamRecordEntity;
import com.retail.bargain.service.TeamRecordService;


@Service("teamRecordService")
public class TeamRecordServiceImpl extends ServiceImpl<TeamRecordMapper, TeamRecordEntity> implements TeamRecordService {



}
