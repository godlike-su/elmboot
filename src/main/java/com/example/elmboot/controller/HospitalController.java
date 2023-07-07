package com.example.elmboot.controller;

import com.example.elmboot.entity.Hospital;
import com.example.elmboot.result.ListResult;
import com.example.elmboot.result.MessageResult;
import com.example.elmboot.result.SingleResult;
import com.example.elmboot.service.HospitalService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("hospital")
@Api(value = "医院操作", tags = "医院操作")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    @ApiOperation(value = "显示所有医院信息")
    @PostMapping("/getHospital")
    public ListResult<Hospital> getHospital(@RequestBody Hospital hospital) {
        // 分页
//        PageMethod.startPage(5, 10);
        List<Hospital> result = hospitalService.getHospital(hospital);
        return new ListResult<>(result);
    }

    @ApiOperation(value = "根据医院hpld，获取医院信息")
    @PostMapping("getHospitalByHpld")
    public SingleResult<Hospital> getHospitalByHpld(@RequestBody Hospital hospital) {
        Hospital result = hospitalService.getHospitalByHpld(hospital);
        return new SingleResult<>(result);
    }

    @ApiOperation(value = "新增医院信息")
    @PostMapping("/addHospital")
    public MessageResult addHospital(@RequestBody Hospital hospital) {
        String s = hospitalService.addHospital(hospital);
        return new MessageResult(s);
    }

    @ApiOperation(value = "删除医院信息")
    @PostMapping("/deleteHospital")
    public MessageResult deleteHospital(@RequestBody Hospital hospital) {
        String s = hospitalService.deleteHospital(hospital);
        return new MessageResult(s);
    }



}
