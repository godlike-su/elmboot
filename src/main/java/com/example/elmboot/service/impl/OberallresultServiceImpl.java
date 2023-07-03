package com.example.elmboot.service.impl;


import cn.hutool.core.util.ObjectUtil;
import com.example.elmboot.entity.Oberallresult;
import com.example.elmboot.entity.OberallresultExample;
import com.example.elmboot.mapper.OberallresultMapper;
import com.example.elmboot.service.OberallresultService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class OberallresultServiceImpl implements OberallresultService {

    @Autowired
    private OberallresultMapper oberallresultMapper;

    @Override
    public int add(Oberallresult oberallresult) {
        return oberallresultMapper.insertSelective(oberallresult);
    }

    @Override
    public int save(Oberallresult oberallresult) {
        return oberallresultMapper.updateByPrimaryKeySelective(oberallresult);
    }

    @Override
    public int delete(int orld) {
        return oberallresultMapper.deleteByPrimaryKey(orld);
    }

    @Override
    public List<Oberallresult> oberallList(Oberallresult oberallresult) {
        OberallresultExample oe = new OberallresultExample();
        OberallresultExample.Criteria criteria = oe.createCriteria();
        if (ObjectUtil.isNotNull(oberallresult)) {
            if (oberallresult.getOrderid() != null) {
                criteria.andOrderidEqualTo(oberallresult.getOrderid());
            }
        }
        List<Oberallresult> oberallresults = oberallresultMapper.selectByExample(oe);
        return oberallresults;
    }
}
