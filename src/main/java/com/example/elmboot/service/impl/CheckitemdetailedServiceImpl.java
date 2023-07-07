package com.example.elmboot.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.example.elmboot.entity.Checkitemdetailed;
import com.example.elmboot.entity.CheckitemdetailedExample;
import com.example.elmboot.mapper.CheckitemdetailedMapper;
import com.example.elmboot.service.CheckitemdetailedService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CheckitemdetailedServiceImpl implements CheckitemdetailedService {

    @Autowired
    private CheckitemdetailedMapper checkitemdetailedMapper;


    @Override
    public int add(Checkitemdetailed checkitemdetailed) {
        return checkitemdetailedMapper.insertSelective(checkitemdetailed);
    }

    @Override
    public int deleteCheck(Checkitemdetailed checkitemdetailed) {
        return checkitemdetailedMapper.deleteByPrimaryKey(checkitemdetailed.getCdid());
    }

    @Override
    public List<Checkitemdetailed> getList(Checkitemdetailed checkitemdetailed) {
        CheckitemdetailedExample checkitemdetailedExample = new CheckitemdetailedExample();
        CheckitemdetailedExample.Criteria criteria = checkitemdetailedExample.createCriteria();
        if (ObjectUtil.isNotNull(checkitemdetailed)) {
            if (checkitemdetailed.getCild() != null) {
                criteria.andCildEqualTo(checkitemdetailed.getCild());
            }

        }

        return checkitemdetailedMapper.selectByExample(checkitemdetailedExample);
    }
}
