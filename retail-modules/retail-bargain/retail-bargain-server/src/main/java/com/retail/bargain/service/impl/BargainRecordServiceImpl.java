package com.retail.bargain.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.retail.bargain.mapper.BargainRecordMapper;
import com.retail.bargain.domain.BargainRecordEntity;
import com.retail.bargain.service.BargainRecordService;


@Service("bargainRecordService")
public class BargainRecordServiceImpl extends ServiceImpl<BargainRecordMapper, BargainRecordEntity> implements BargainRecordService {



}
