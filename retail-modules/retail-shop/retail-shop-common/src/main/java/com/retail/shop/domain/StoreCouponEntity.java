package com.retail.shop.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 优惠券表
 *
 * @author fengge
 * @email 1287137373@qq.com
 * @date 2023-03-23 09:56:18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("retail_store_coupon")
public class StoreCouponEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 优惠券表ID
	 */
	@TableId
	private Integer id;
	/**
	 * 优惠券名称
	 */
	private String name;
	/**
	 * 兑换的优惠券面值
	 */
	private BigDecimal money;
	/**
	 * 是否限量, 默认0 不限量， 1限量
	 */
	private Integer isLimited;
	/**
	 * 发放总数
	 */
	private Integer total;
	/**
	 * 剩余数量
	 */
	private Integer lastTotal;
	/**
	 * 使用类型 1 全场通用, 2 商品券, 3 品类券
	 */
	private Integer useType;
	/**
	 * 最低消费，0代表不限制
	 */
	private BigDecimal minPrice;
	/**
	 * 可领取开始时间
	 */
	private Date receiveStartTime;
	/**
	 * 可领取结束时间
	 */
	private Date receiveEndTime;
	/**
	 * 是否固定使用时间, 默认0 否， 1是
	 */
	private Integer isFixedTime;
	/**
	 * 可使用时间范围 开始时间
	 */
	private Date useStartTime;
	/**
	 * 可使用时间范围 结束时间
	 */
	private Date useEndTime;
	/**
	 * 优惠券类型 1 手动领取, 2 新人券, 3 赠送券
	 */
	private Integer type;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 状态（0：关闭，1：开启）
	 */
	private Integer status;
	/**
	 * 是否删除 状态（0：否，1：是）
	 */
	private Integer isDel;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;

}
