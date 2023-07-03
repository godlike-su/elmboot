package com.example.elmboot.mapper;

import com.example.elmboot.entity.Hospital;
import com.example.elmboot.entity.HospitalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HospitalMapper {
    long countByExample(HospitalExample example);

    int deleteByExample(HospitalExample example);

    int deleteByPrimaryKey(Integer hpld);

    int insert(Hospital record);

    int insertSelective(Hospital record);

    List<Hospital> selectByExampleWithBLOBs(HospitalExample example);

    List<Hospital> selectByExample(HospitalExample example);

    Hospital selectByPrimaryKey(Integer hpld);

    int updateByExampleSelective(@Param("record") Hospital record, @Param("example") HospitalExample example);

    int updateByExampleWithBLOBs(@Param("record") Hospital record, @Param("example") HospitalExample example);

    int updateByExample(@Param("record") Hospital record, @Param("example") HospitalExample example);

    int updateByPrimaryKeySelective(Hospital record);

    int updateByPrimaryKeyWithBLOBs(Hospital record);

    int updateByPrimaryKey(Hospital record);
}