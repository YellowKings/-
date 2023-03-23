package com.retail.user.controller;

import java.util.List;


import com.retail.common.result.Result;
import com.retail.user.config.Annocation;
import com.retail.user.domain.UserRoleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.retail.user.service.RoleService;


/**
 * 角色表
 *
 * @author fengge
 * @email 1287137373@qq.com
 * @date 2023-03-22 18:26:56
 */

@RestController
@RequestMapping("user/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @Annocation("查询方法")
    @GetMapping(value = "/")
    public Result<List<UserRoleEntity>> list() {
        List<UserRoleEntity> list = roleService.selectUserRole();
        return Result.success(list);
    }

    @GetMapping(value = "/{id}")
    public Result<UserRoleEntity> getById(@PathVariable("id") Long id) {
        UserRoleEntity userRoleEntity = roleService.findById(id);
        return Result.success(userRoleEntity);
    }

    @PostMapping(value = "/create")
    public Result create(@RequestBody UserRoleEntity params) {
        roleService.insert(params);
        return Result.success(null,"成功");
    }

    @PostMapping(value = "/delete/{id}")
    public Result<Object> delete(@PathVariable("id") String id) {
        roleService.delete(id);
        return Result.success(null,"删除成功");
    }

    @PostMapping(value = "/update")
    public Result<Object> delete(@RequestBody UserRoleEntity params) {
        roleService.updateRole(params);
        return Result.success(null,"修改成功");
    }
}
