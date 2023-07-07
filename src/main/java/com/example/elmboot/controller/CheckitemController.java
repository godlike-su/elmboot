package com.example.elmboot.controller;

import com.example.elmboot.entity.Checkitem;
import com.example.elmboot.entity.Setmealdetailed;
import com.example.elmboot.result.ListResult;
import com.example.elmboot.result.MessageResult;
import com.example.elmboot.service.CheckitemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("checkitem")
@Api(value = "检查项信息", tags = "检查项信息")
public class CheckitemController {

    @Autowired
    private CheckitemService checkitemService;

    @ApiOperation(value = "获取所有检查项信息表，根据体检套餐编号smid")
    @PostMapping("/getCheckitemBySmid")
    public ListResult<Checkitem> getCheckitemBySmid(@RequestBody Setmealdetailed setmealdetailed) {
        List<Checkitem> result = checkitemService.getCheckitemBySmid(setmealdetailed.getSmid());
        return new ListResult<>(result);
    }

    @ApiOperation(value = "新增检查项信息")
    @PostMapping("addCheckitem")
    public MessageResult addCheckitem(@RequestBody Checkitem checkitem) {
        int i = checkitemService.addCheckitem(checkitem);
        return new MessageResult(String.valueOf(i));
    }

    @ApiOperation(value = "删除检查项信息")
    @PostMapping("deleteCheckitem")
    public MessageResult deleteCheckitem(@RequestBody Checkitem checkitem) {
        int i = checkitemService.deleteCheckitem(checkitem);
        return new MessageResult(String.valueOf(i));

    }





}
