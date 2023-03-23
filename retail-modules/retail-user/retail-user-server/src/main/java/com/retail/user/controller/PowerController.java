package com.retail.user.controller;

import com.retail.common.result.PageResult;
import com.retail.common.result.Result;
import com.retail.user.domain.PowerEntity;
import com.retail.user.domain.UserEntity;
import com.retail.user.domain.vo.RequestPower;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.retail.user.service.PowerService;
import com.retail.user.entity.Power;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 权限表 前端控制器
 * </p>
 *
 * @author retail
 * @since 2023-03-23
 */
@Controller
@RequestMapping("/power")
public class PowerController {


    @Autowired
    private PowerService powerService;

    @GetMapping(value = "/")
    public Result<PageResult<UserEntity>> list(@RequestBody RequestPower requestPower) {
        Result<PageResult<UserEntity>> pageResult = powerService.pageList(requestPower);
        return pageResult;
    }

    @PutMapping(value = "/update/{id}")
    public Result<Object> delete(@PathVariable("id") Long id) {
        powerService.updateStatus(id);
        return Result.success(null,"成功");
    }
}
