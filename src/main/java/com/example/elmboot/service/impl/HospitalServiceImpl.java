package com.example.elmboot.service.impl;

import com.example.elmboot.entity.Hospital;
import com.example.elmboot.entity.HospitalExample;
import com.example.elmboot.exception.GenerallyeException;
import com.example.elmboot.mapper.HospitalMapper;
import com.example.elmboot.service.HospitalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class HospitalServiceImpl implements HospitalService {

    @Autowired
    private HospitalMapper hospitalMapper;


    @Override
    public List<Hospital> getHospital(Hospital hospital) {
        HospitalExample hospitalExample = new HospitalExample();
        HospitalExample.Criteria criteria = hospitalExample.createCriteria();
//        criteria.andHpldEqualTo(hospital.getHpld());
        List<Hospital> hospitals = hospitalMapper.selectByExample(hospitalExample);

        return hospitals;
    }

    @Override
    public Hospital getHospitalByHpld(Hospital hospital) {
        return hospitalMapper.selectByPrimaryKey(hospital.getHpld());
    }

    @Override
    public String addHospital(Hospital hospital) {
        int i = hospitalMapper.insertSelective(hospital);
        if (i == 1) {
            return "success";
        } else {
            throw new GenerallyeException("新增医院失败");
        }
    }

    @Override
    public String deleteHospital(Hospital hospital) {
        int i = hospitalMapper.deleteByPrimaryKey(hospital.getHpld());
        return String.valueOf(i);
    }
}
