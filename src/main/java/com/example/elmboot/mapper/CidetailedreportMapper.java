package com.example.elmboot.mapper;

import com.example.elmboot.entity.Cidetailedreport;
import com.example.elmboot.entity.CidetailedreportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CidetailedreportMapper {
    long countByExample(CidetailedreportExample example);

    int deleteByExample(CidetailedreportExample example);

    int deleteByPrimaryKey(Integer cidrid);

    int insert(Cidetailedreport record);

    int insertSelective(Cidetailedreport record);

    List<Cidetailedreport> selectByExample(CidetailedreportExample example);

    Cidetailedreport selectByPrimaryKey(Integer cidrid);

    int updateByExampleSelective(@Param("record") Cidetailedreport record, @Param("example") CidetailedreportExample example);

    int updateByExample(@Param("record") Cidetailedreport record, @Param("example") CidetailedreportExample example);

    int updateByPrimaryKeySelective(Cidetailedreport record);

    int updateByPrimaryKey(Cidetailedreport record);
}