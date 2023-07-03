package com.example.elmboot.controller;

import com.example.elmboot.entity.Cidetailedreport;
import com.example.elmboot.result.ListResult;
import com.example.elmboot.result.MessageResult;
import com.example.elmboot.service.CidetailedService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cidetailedreport")
@Api(value = "体检报告检查项", tags = "体检报告检查项")
public class CidetailedreportController {

    @Autowired
    private CidetailedService cidetailedService;;

    @ApiOperation(value = "修改体检报告检查项")
    @PostMapping("/save")
    public MessageResult save(@RequestBody Cidetailedreport cidetailedreport) {
        int i = cidetailedService.save(cidetailedreport);
        return new MessageResult(String.valueOf(i));
    }

    @ApiOperation(value = "获取体检报告异常项iserror=1，by orderId")
    @PostMapping("/listIserror1ByOrderId")
    public ListResult<Cidetailedreport> listIserror1ByOrderId(@RequestBody Cidetailedreport cidetailedreport) {
        cidetailedreport.setIserror(1);
        List<Cidetailedreport> list = cidetailedService.list(cidetailedreport);
        return new ListResult(list);
    }





}
