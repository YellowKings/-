package com.retail.bargain.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.retail.bargain.mapper.TeamMapper;
import com.retail.bargain.domain.TeamEntity;
import com.retail.bargain.service.TeamService;


@Service("teamService")
public class TeamServiceImpl extends ServiceImpl<TeamMapper, TeamEntity> implements TeamService {



}
