package com.retail.bargain.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.retail.bargain.domain.TeamEntity;
import com.retail.bargain.service.TeamService;


/**
 * 拼团表
 *
 * @author fengge
 * @email 1287137373@qq.com
 * @date 2023-03-23 11:22:38
 */
@RestController
@RequestMapping("bargain/team")
public class TeamController {

    @Autowired
    private TeamService teamService;
}
