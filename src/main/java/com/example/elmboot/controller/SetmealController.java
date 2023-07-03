package com.example.elmboot.controller;

import com.example.elmboot.entity.Setmeal;
import com.example.elmboot.result.ListResult;
import com.example.elmboot.service.SetmealService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("setmeal")
@Api(value = "体检套餐信息", tags = "体检套餐信息")
public class SetmealController {

    @Autowired
    private SetmealService setmealService;

    @ApiOperation(value = "显示所有体检套餐信息")
    @PostMapping("getSetmeal")
    public ListResult<Setmeal> getSetmeal(@RequestBody Setmeal setmeal) {
        // 分页
//        PageMethod.startPage(5, 10);
        List<Setmeal> result = setmealService.getSetmeal(setmeal);
        return new ListResult<>(result);
    }

}
