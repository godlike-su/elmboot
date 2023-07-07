package com.example.elmboot.service.impl;

import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.ObjectUtil;
import com.example.elmboot.cache.DoctorCacheService;
import com.example.elmboot.entity.Doctor;
import com.example.elmboot.entity.DoctorExample;
import com.example.elmboot.entity.Orders;
import com.example.elmboot.exception.GenerallyeException;
import com.example.elmboot.mapper.DoctorMapper;
import com.example.elmboot.mapper.OrdersMapper;
import com.example.elmboot.service.DoctorService;
import com.example.elmboot.service.SessionDoctor;
import com.github.pagehelper.page.PageMethod;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorMapper doctorMapper;

    @Autowired
    private DoctorCacheService doctorCacheService;

    @Autowired
    private OrdersMapper ordersMapper;

    @Autowired
    private SessionDoctor sessionDoctor;

    @Override
    public String doctorLogin(Doctor doctor) {
        DoctorExample doctorExample = new DoctorExample();
        DoctorExample.Criteria criteria = doctorExample.createCriteria();
        if (ObjectUtil.isNotNull(doctor)) {
            criteria.andDoccodeEqualTo(doctor.getDoccode());
//            criteria.andPasswordEqualTo(doctor.getPassword());
            //doctorMapper.selectByExample(doctorExample)
        }
        List<Doctor> doctors = doctorMapper.selectByExample(doctorExample);
        if (doctors.size() > 0) {
            Doctor doctor1 = doctors.get(0);
            if (doctor.getPassword().equals(doctor1.getPassword())) {
                // 密码正确，生成唯一id作为cookie
                String simpleUUID = IdUtil.simpleUUID();
                // 存入缓存
                doctorCacheService.updateCachedData(simpleUUID, doctor1);
                return simpleUUID;
            } else {
                throw new GenerallyeException("密码错误");
            }
        } else {
            throw new GenerallyeException("没有该用户");
        }
    }

    @Override
    public List<Orders> getOrderList(Orders orders) {
        PageMethod.startPage(orders.getPage(), orders.getRows());
        List<Orders> doctorList = ordersMapper.getDoctorList(orders);
        return doctorList;
    }

    @Override
    public Doctor getDoctorMe() {
        Doctor sessionDoctor1 = sessionDoctor.getSessionDoctor();
        return sessionDoctor1;
    }


}
