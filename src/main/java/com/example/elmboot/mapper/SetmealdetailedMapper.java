package com.example.elmboot.mapper;

import com.example.elmboot.entity.Setmealdetailed;
import com.example.elmboot.entity.SetmealdetailedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SetmealdetailedMapper {
    long countByExample(SetmealdetailedExample example);

    int deleteByExample(SetmealdetailedExample example);

    int deleteByPrimaryKey(Integer sdid);

    int insert(Setmealdetailed record);

    int insertSelective(Setmealdetailed record);

    List<Setmealdetailed> selectByExample(SetmealdetailedExample example);

    Setmealdetailed selectByPrimaryKey(Integer sdid);

    int updateByExampleSelective(@Param("record") Setmealdetailed record, @Param("example") SetmealdetailedExample example);

    int updateByExample(@Param("record") Setmealdetailed record, @Param("example") SetmealdetailedExample example);

    int updateByPrimaryKeySelective(Setmealdetailed record);

    int updateByPrimaryKey(Setmealdetailed record);
}