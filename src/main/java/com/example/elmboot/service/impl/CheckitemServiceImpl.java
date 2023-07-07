package com.example.elmboot.service.impl;


import com.example.elmboot.entity.Checkitem;
import com.example.elmboot.mapper.CheckitemMapper;
import com.example.elmboot.service.CheckitemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CheckitemServiceImpl implements CheckitemService {


    @Autowired
    private CheckitemMapper checkitemMapper;


    @Override
    public List<Checkitem> getCheckitemBySmid(int smid) {
        List<Checkitem> result = checkitemMapper.getCheckitemBySmid(smid);
        return result;
    }

    @Override
    public int addCheckitem(Checkitem checkitem) {
        checkitemMapper.insertSelective(checkitem);
        return checkitem.getCild();
    }

    @Override
    public int deleteCheckitem(Checkitem checkitem) {
        return checkitemMapper.deleteByPrimaryKey(checkitem.getCild());
    }
}
