package com.example.elmboot.service;


import com.example.elmboot.entity.Hospital;

import java.util.List;

public interface HospitalService {

    List<Hospital> getHospital(Hospital hospital);

    Hospital getHospitalByHpld(Hospital hospital);

    String addHospital(Hospital hospital);

    String deleteHospital(Hospital hospital);

}
