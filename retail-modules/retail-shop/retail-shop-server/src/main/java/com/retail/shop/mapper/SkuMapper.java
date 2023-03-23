package com.retail.shop.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.retail.shop.domain.SkuEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品 sku 表
 *
 * @author fengge
 * @email 1287137373@qq.com
 * @date 2023-03-22 17:00:28
 */
@Mapper
public interface SkuMapper extends BaseMapper<SkuEntity> {

}
