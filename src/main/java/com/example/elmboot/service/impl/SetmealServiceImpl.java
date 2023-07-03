package com.example.elmboot.service.impl;


import com.example.elmboot.entity.Setmeal;
import com.example.elmboot.mapper.SetmealMapper;
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


    @Override
    public List<Setmeal> getSetmeal(Setmeal setmeal) {
        List<Setmeal> setmeals = setmealMapper.selectByExample(null);
        return setmeals;
    }
}
