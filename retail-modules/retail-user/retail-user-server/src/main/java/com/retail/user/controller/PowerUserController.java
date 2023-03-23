package com.retail.user.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.retail.user.domain.PowerUserEntity;
import com.retail.user.service.PowerUserService;


/**
 * 权限  用户 中间表
 *
 * @author fengge
 * @email 1287137373@qq.com
 * @date 2023-03-23 19:31:59
 */
@RestController
@RequestMapping("user/poweruser")
public class PowerUserController {

    @Autowired
    private PowerUserService powerUserService;
}
