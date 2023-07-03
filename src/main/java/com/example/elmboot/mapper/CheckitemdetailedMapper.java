package com.example.elmboot.mapper;

import com.example.elmboot.entity.Checkitemdetailed;
import com.example.elmboot.entity.CheckitemdetailedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckitemdetailedMapper {
    long countByExample(CheckitemdetailedExample example);

    int deleteByExample(CheckitemdetailedExample example);

    int deleteByPrimaryKey(Integer cdid);

    int insert(Checkitemdetailed record);

    int insertSelective(Checkitemdetailed record);

    List<Checkitemdetailed> selectByExample(CheckitemdetailedExample example);

    Checkitemdetailed selectByPrimaryKey(Integer cdid);

    int updateByExampleSelective(@Param("record") Checkitemdetailed record, @Param("example") CheckitemdetailedExample example);

    int updateByExample(@Param("record") Checkitemdetailed record, @Param("example") CheckitemdetailedExample example);

    int updateByPrimaryKeySelective(Checkitemdetailed record);

    int updateByPrimaryKey(Checkitemdetailed record);
}