package com.example.elmboot.service;


import com.example.elmboot.entity.Checkitem;

import java.util.List;

public interface CheckitemService {

    /**
     * 获取所有检查项信息表，根据体检套餐编号smid
     * @param smid
     * @return
     */
    List<Checkitem> getCheckitemBySmid(int smid);


    int addCheckitem(Checkitem checkitem);


}
