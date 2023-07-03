package com.example.elmboot.controller;

import com.example.elmboot.entity.Orders;
import com.example.elmboot.entity.SessionUserDetail;
import com.example.elmboot.result.ListResult;
import com.example.elmboot.result.MessageResult;
import com.example.elmboot.result.SingleResult;
import com.example.elmboot.service.OrdersService;
import com.example.elmboot.service.SessionUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("orders")
@Api(value = "订单信息", tags = "订单信息")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @Autowired
    private SessionUser sessionUser;

    @ApiOperation(value = "显示所有订单信息")
    @PostMapping("/getOrdersList")
    public ListResult<Orders> getOrdersList(@RequestBody Orders orders) {
        List<Orders> ordersList = ordersService.getOrdersList(orders);
        return new ListResult<>(ordersList);

    }


    @ApiOperation(value = "获取自己已归档订单信息")
    @PostMapping("/getOrdersListByState2")
    public ListResult<Orders> getOrdersListByState2() {
        Orders orders = new Orders();
        orders.setUserid(sessionUser.getSessionUser().getUserId());
        orders.setState(2);
        List<Orders> ordersList = ordersService.getOrdersList(orders);
        return new ListResult<>(ordersList);

    }


    @ApiOperation(value = "医生端，根据各种条件查询列表")
    @PostMapping("/getList")
    public ListResult<Orders> getList(@RequestBody Orders orders) {
        List<Orders> ordersList = ordersService.getList(orders);
        return new ListResult<>(ordersList);

    }



    @ApiOperation(value = "根据id查找订单信息")
    @PostMapping("/getOrdersById")
    public SingleResult<Orders> getOrdersById(@RequestBody Orders orders) {

        Orders result = ordersService.getOrdersById(orders.getOrderid());
        return new SingleResult<>(result);

    }


    @ApiOperation(value = "新增订单信息")
    @PostMapping("/addOrder")
    public MessageResult addOrder(@RequestBody Orders orders) {

        String s = ordersService.addOrders(orders);
        return new MessageResult(s);

    }


    @ApiOperation(value = "新增自己的订单信息")
    @PostMapping("/addOrderMe")
    public MessageResult addOrderMe(@RequestBody Orders orders) {
        SessionUserDetail sessionUserDetail = sessionUser.getSessionUser();
        orders.setUserid(sessionUserDetail.getUserId());
        String s = ordersService.addOrders(orders);
        return new MessageResult(s);

    }


    @ApiOperation(value = "修改订单信息")
    @PostMapping("/updateOrder")
    public MessageResult updateOrder(@RequestBody Orders orders) {

        int result = ordersService.update(orders);
        return new MessageResult(String.valueOf(result));

    }


    @ApiOperation(value = "查看我的所有订单信息")
    @PostMapping("/getOrdersMe")
    public ListResult<Orders> getOrdersMe() {
        SessionUserDetail sessionUserDetail = sessionUser.getSessionUser();
        List<Orders> result = ordersService.getOrdersMe(sessionUserDetail.getUserId());
        return new ListResult<>(result);

    }



    @ApiOperation(value = "删除订单信息")
    @PostMapping("/deleteOrder")
    public MessageResult deleteOrder(@RequestBody Orders orders) {
        int i = ordersService.deleteOrder(orders);
        return new MessageResult(String.valueOf(i));

    }





}
