package com.retail.shop.controller;


import com.retail.shop.service.SkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * 商品 sku 表
 *
 * @author fengge
 * @email 1287137373@qq.com
 * @date 2023-03-22 17:00:28
 */

@RestController
@RequestMapping("shop/sku")
public class SkuController {

    @Autowired
    private SkuService skuService;


}
