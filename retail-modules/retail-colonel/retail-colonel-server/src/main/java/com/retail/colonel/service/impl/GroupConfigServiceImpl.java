package com.retail.colonel.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.retail.colonel.mapper.GroupConfigMapper;
import com.retail.colonel.domain.GroupConfigEntity;
import com.retail.colonel.service.GroupConfigService;


@Service("groupConfigService")
public class GroupConfigServiceImpl extends ServiceImpl<GroupConfigMapper, GroupConfigEntity> implements GroupConfigService {



}
