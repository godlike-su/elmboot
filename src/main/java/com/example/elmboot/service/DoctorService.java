package com.example.elmboot.service;


import com.example.elmboot.entity.Doctor;
import com.example.elmboot.entity.Orders;

import java.util.List;

public interface DoctorService {

    String doctorLogin(Doctor doctor);

    List<Orders> getOrderList(Orders orders);

    Doctor getDoctorMe();


}
