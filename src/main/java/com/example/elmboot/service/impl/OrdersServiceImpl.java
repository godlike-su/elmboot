package com.example.elmboot.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.example.elmboot.entity.*;
import com.example.elmboot.mapper.*;
import com.example.elmboot.service.OrdersService;
import com.github.pagehelper.util.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersMapper ordersMapper;

    @Autowired
    private SetmealMapper setmealMapper;

    @Autowired
    private HospitalMapper hospitalMapper;

    @Autowired
    private CheckitemMapper checkitemMapper;

    @Autowired
    private CidetailedreportMapper cidetailedreportMapper;


    @Override
    public String addOrders(Orders orders) {
        orders.setState(1);
        int i = ordersMapper.insertSelective(orders);

        if (i == 1) {
            // 还需添加 体检报告检查项明细表 的信息，将 检查项明细表 的内容复制过去，生成待填写的明细表
            List<Checkitem> checkitemBySmid = checkitemMapper.getCheckitemBySmid(orders.getSmid());
            for (Checkitem c : checkitemBySmid) {
                List<Checkitemdetailed> checkitemdetailedList = c.getCheckitemdetailedList();
                for (Checkitemdetailed cd : checkitemdetailedList) {
                    Cidetailedreport cdr = new Cidetailedreport();
                    cdr.setName(cd.getCiname());
                    cdr.setCild(cd.getCild());
                    cdr.setUnit(cd.getUnit());
                    cdr.setMaxrange(cd.getMaxrange());
                    cdr.setMinrange(cd.getMinrange());
                    cdr.setNormalvalue(cd.getNormalvalue());
                    cdr.setNormalvaluestring(cd.getNormalvaluestring());
                    cdr.setType(cd.getType());
                    cdr.setIserror(0);
                    cdr.setOrderld(orders.getOrderid());
                    cidetailedreportMapper.insertSelective(cdr);
                }
            }
        }

        return String.valueOf(orders.getOrderid());
    }

    @Override
    public int update(Orders orders) {
        return ordersMapper.updateByPrimaryKeySelective(orders);
    }

    @Override
    public List<Orders> getOrdersList(Orders orders) {
        OrdersExample ordersExample = new OrdersExample();
        OrdersExample.Criteria criteria = ordersExample.createCriteria();
        if (ObjectUtil.isNotNull(orders)) {
            if (StringUtil.isNotEmpty(orders.getUserid())) {
                criteria.andUseridEqualTo(orders.getUserid());
            }
            if (orders.getState() != null) {
                criteria.andStateEqualTo(orders.getState());
            }
            if (StringUtil.isNotEmpty(orders.getUserid())) {
                criteria.andUseridEqualTo(orders.getUserid());
            }
        }
        List<Orders> orders1 = ordersMapper.selectByExample(ordersExample);
        for (Orders o : orders1) {
            Hospital hospital = hospitalMapper.selectByPrimaryKey(o.getHpld());
            o.setHpName(hospital.getName());
        }
        return orders1;
    }

    @Override
    public List<Orders> getList(Orders orders) {
        return ordersMapper.getList(orders);
    }

    @Override
    public Orders getOrdersById(int orderid) {
        return ordersMapper.selectByPrimaryKey(orderid);
    }

    @Override
    public List<Orders> getOrdersMe(String userId) {
        OrdersExample ordersExample = new OrdersExample();
        OrdersExample.Criteria criteria = ordersExample.createCriteria();
        criteria.andUseridEqualTo(userId);
        List<Orders> orders1 = ordersMapper.selectByExample(ordersExample);
        for (Orders o : orders1) {
            Setmeal s = setmealMapper.selectByPrimaryKey(o.getSmid());
            o.setName(s.getName());
            o.setPrice(s.getPrice());
            o.setType(s.getType());
        }
        return orders1;
    }

    @Override
    public int deleteOrder(Orders orders) {
        return ordersMapper.deleteByPrimaryKey(orders.getOrderid());
    }
}
