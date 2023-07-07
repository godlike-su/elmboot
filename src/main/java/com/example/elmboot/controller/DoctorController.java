package com.example.elmboot.controller;

import com.example.elmboot.entity.*;
import com.example.elmboot.result.ListResult;
import com.example.elmboot.result.MessageResult;
import com.example.elmboot.result.SingleResult;
import com.example.elmboot.service.CidetailedService;
import com.example.elmboot.service.DoctorService;
import com.example.elmboot.service.OberallresultService;
import com.example.elmboot.service.OrdersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("doctor")
@Api(value = "医生界面接口", tags = "医生界面接口")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private CidetailedService cidetailedService;

    @Autowired
    private OberallresultService oberallresultService;

    @Autowired
    private OrdersService ordersService;


    @PostMapping("/login")
    @ApiOperation(value = "医生登录")
    public MessageResult login(@RequestBody Doctor doctor){
        String s = doctorService.doctorLogin(doctor);
        return new MessageResult(s);
    }

    @PostMapping("/getDoctorOrderList")
    @ApiOperation(value = "医生查询体检列表")
    public ListResult<Orders> getDoctorOrderList(@RequestBody Orders orders){
        List<Orders> orderList = doctorService.getOrderList(orders);
        return new ListResult<>(orderList);
    }


    @PostMapping("/getDoctorMe")
    @ApiOperation(value = "获取登录的医生信息")
    public SingleResult<Doctor> getDoctorMe(){
        Doctor doctorMe = doctorService.getDoctorMe();
        return new SingleResult<>(doctorMe);
    }

    @ApiOperation(value = "获取体检报告,根据orderid")
    @PostMapping("/listCideByOrderId")
    public ListResult<Checkitem>  listCideByOrderId(@RequestBody Cidetailedreport cidetailedreport) {
        List<Checkitem> list = cidetailedService.listCideByOrderId(cidetailedreport);
        return new ListResult(list);
    }



    @ApiOperation(value = "修改体检报告检查项")
    @PostMapping("/save")
    public MessageResult save(@RequestBody Cidetailedreport cidetailedreport) {
        int i = cidetailedService.save(cidetailedreport);
        return new MessageResult(String.valueOf(i));
    }



    @PostMapping("/add")
    @ApiOperation(value = "添加总检结论项")
    public MessageResult add(@RequestBody Oberallresult oberallresult){

        int add = oberallresultService.add(oberallresult);
        return new MessageResult(String.valueOf(add));
    }

    @PostMapping("/saveObera")
    @ApiOperation(value = "修改总检结论项")
    public MessageResult saveObera(@RequestBody Oberallresult oberallresult){

        int add = oberallresultService.save(oberallresult);
        return new MessageResult(String.valueOf(add));
    }

    @PostMapping("/delete")
    @ApiOperation(value = "删除总检结论项")
    public MessageResult delete(@RequestBody Oberallresult oberallresult){

        int add = oberallresultService.delete(oberallresult.getOrld());
        return new MessageResult(String.valueOf(add));
    }

    @PostMapping("/list")
    @ApiOperation(value = "查看总检结论项")
    public ListResult<Oberallresult> list(@RequestBody Oberallresult oberallresult){

        List<Oberallresult> oberallresults =
                oberallresultService.oberallList(oberallresult);

        return new ListResult<>(oberallresults);
    }

    @ApiOperation(value = "修改订单信息")
    @PostMapping("/updateOrder")
    public MessageResult updateOrder(@RequestBody Orders orders) {

        int result = ordersService.update(orders);
        return new MessageResult(String.valueOf(result));

    }



}
