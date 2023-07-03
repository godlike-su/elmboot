package com.example.elmboot.mapper;

import com.example.elmboot.entity.Cireport;
import com.example.elmboot.entity.CireportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CireportMapper {
    long countByExample(CireportExample example);

    int deleteByExample(CireportExample example);

    int deleteByPrimaryKey(Integer cirld);

    int insert(Cireport record);

    int insertSelective(Cireport record);

    List<Cireport> selectByExample(CireportExample example);

    Cireport selectByPrimaryKey(Integer cirld);

    int updateByExampleSelective(@Param("record") Cireport record, @Param("example") CireportExample example);

    int updateByExample(@Param("record") Cireport record, @Param("example") CireportExample example);

    int updateByPrimaryKeySelective(Cireport record);

    int updateByPrimaryKey(Cireport record);
}