package com.example.elmboot.mapper;

import com.example.elmboot.entity.Oberallresult;
import com.example.elmboot.entity.OberallresultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OberallresultMapper {
    long countByExample(OberallresultExample example);

    int deleteByExample(OberallresultExample example);

    int deleteByPrimaryKey(Integer orld);

    int insert(Oberallresult record);

    int insertSelective(Oberallresult record);

    List<Oberallresult> selectByExample(OberallresultExample example);

    Oberallresult selectByPrimaryKey(Integer orld);

    int updateByExampleSelective(@Param("record") Oberallresult record, @Param("example") OberallresultExample example);

    int updateByExample(@Param("record") Oberallresult record, @Param("example") OberallresultExample example);

    int updateByPrimaryKeySelective(Oberallresult record);

    int updateByPrimaryKey(Oberallresult record);
}