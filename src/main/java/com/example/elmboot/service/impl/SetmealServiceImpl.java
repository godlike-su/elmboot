package com.example.elmboot.service.impl;


import cn.hutool.core.util.ObjectUtil;
import com.example.elmboot.entity.Setmeal;
import com.example.elmboot.entity.SetmealExample;
import com.example.elmboot.entity.Setmealdetailed;
import com.example.elmboot.mapper.SetmealMapper;
import com.example.elmboot.mapper.SetmealdetailedMapper;
import com.example.elmboot.service.SetmealService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class SetmealServiceImpl implements SetmealService {

    @Autowired
    private SetmealMapper setmealMapper;

    @Autowired
    private SetmealdetailedMapper setmealdetailedMapper;


    @Override
    public List<Setmeal> getSetmeal(Setmeal setmeal) {
        SetmealExample setmealExample = new SetmealExample();
        SetmealExample.Criteria criteria = setmealExample.createCriteria();
        if (ObjectUtil.isNotNull(setmeal)) {
          if (setmeal.getSmid() != null) {
              criteria.andSmidEqualTo(setmeal.getSmid());
          }
        }
        List<Setmeal> setmeals = setmealMapper.selectByExample(setmealExample);
        return setmeals;
    }

    @Override
    public String addSetmeal(Setmeal setmeal) {
        int i = setmealMapper.insertSelective(setmeal);
        return String.valueOf(i);
    }

    @Override
    public String addSetmealdetailed(Setmealdetailed setmealdetailed) {
        int i = setmealdetailedMapper.insertSelective(setmealdetailed);
        return String.valueOf(i);
    }

    @Override
    public String deleteSetmeal(Setmeal setmeal) {
        int i = setmealMapper.deleteByPrimaryKey(setmeal.getSmid());
        return String.valueOf(i);
    }
}
