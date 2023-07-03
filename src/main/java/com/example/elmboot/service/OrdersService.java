package com.example.elmboot.service;


import com.example.elmboot.entity.Orders;

import java.util.List;

public interface OrdersService {

    /**
     * 新增订单
     *
     * @param orders
     * @return
     */
    String addOrders(Orders orders);

    /**
     * 更新订单
     * @param orders
     * @return
     */
    int update(Orders orders);

    List<Orders> getOrdersList(Orders orders);

    List<Orders> getList(Orders orders);

    Orders getOrdersById(int orderid);

    List<Orders> getOrdersMe(String userId);

    int deleteOrder(Orders orders);


}
