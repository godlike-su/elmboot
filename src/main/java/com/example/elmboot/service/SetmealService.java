package com.example.elmboot.service;


import com.example.elmboot.entity.Setmeal;
import com.example.elmboot.entity.Setmealdetailed;

import java.util.List;

public interface SetmealService {

    List<Setmeal> getSetmeal(Setmeal setmeal);

    String addSetmeal(Setmeal setmeal);

    String addSetmealdetailed(Setmealdetailed setmealdetailed);

    String deleteSetmeal(Setmeal setmeal);

}
