package com.example.elmboot.controller;

import com.example.elmboot.entity.Checkitemdetailed;
import com.example.elmboot.result.ListResult;
import com.example.elmboot.result.MessageResult;
import com.example.elmboot.service.CheckitemdetailedService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("checkitemdetailed")
@Api(value = "体检报告检查项", tags = "体检报告检查项")
public class CheckitemdetailedController {

    @Autowired
    private CheckitemdetailedService checkitemdetailedService;

    @ApiOperation(value = "新增体检报告检查项")
    @PostMapping("/addCheckitemD")
    public MessageResult addCheckitemD(@RequestBody Checkitemdetailed checkitemdetailed) {
        int i = checkitemdetailedService.add(checkitemdetailed);
        return new MessageResult(String.valueOf(i));
    }

    @ApiOperation(value = "删除体检报告检查项")
    @PostMapping("/deleteCheckitemD")
    public MessageResult deleteCheckitemD(@RequestBody Checkitemdetailed checkitemdetailed) {
        int i = checkitemdetailedService.deleteCheck(checkitemdetailed);
        return new MessageResult(String.valueOf(i));
    }



    @ApiOperation(value = "根据cild检查项编号，查询体检报告检查项")
    @PostMapping("/queryCdBycild")
    public ListResult<Checkitemdetailed> queryCdBycild(@RequestBody Checkitemdetailed checkitemdetailed) {
        List<Checkitemdetailed> list = checkitemdetailedService.getList(checkitemdetailed);
        return new ListResult(list);
    }




}
