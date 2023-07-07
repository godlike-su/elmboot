package com.example.elmboot.mapper;

import com.example.elmboot.entity.Checkitem;
import com.example.elmboot.entity.CheckitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckitemMapper {
    long countByExample(CheckitemExample example);

    int deleteByExample(CheckitemExample example);

    int deleteByPrimaryKey(Integer cild);

    int insert(Checkitem record);

    int insertSelective(Checkitem record);

    List<Checkitem> selectByExample(CheckitemExample example);

    Checkitem selectByPrimaryKey(Integer cild);

    int updateByExampleSelective(@Param("record") Checkitem record, @Param("example") CheckitemExample example);

    int updateByExample(@Param("record") Checkitem record, @Param("example") CheckitemExample example);

    int updateByPrimaryKeySelective(Checkitem record);

    int updateByPrimaryKey(Checkitem record);

    List<Checkitem> getCheckitemBySmid(int smid);


    List<Checkitem> listCideByOrderId(int orderId);
}