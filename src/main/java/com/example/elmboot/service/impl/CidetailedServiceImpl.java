package com.example.elmboot.service.impl;


import cn.hutool.core.util.ObjectUtil;
import com.example.elmboot.entity.Cidetailedreport;
import com.example.elmboot.entity.CidetailedreportExample;
import com.example.elmboot.mapper.CidetailedreportMapper;
import com.example.elmboot.service.CidetailedService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
public class CidetailedServiceImpl implements CidetailedService {

    @Autowired
    private CidetailedreportMapper cidetailedreportMapper;


    @Override
    public int save(Cidetailedreport cidetailedreport) {
        int i = cidetailedreportMapper.updateByPrimaryKeySelective(cidetailedreport);
        return i;
    }

    @Override
    public List<Cidetailedreport> list(Cidetailedreport cidetailedreport) {
        CidetailedreportExample example = new CidetailedreportExample();
        CidetailedreportExample.Criteria criteria = example.createCriteria();
        if (ObjectUtil.isNotNull(cidetailedreport)) {
            if (cidetailedreport.getOrderld() != null) {
                criteria.andOrderldEqualTo(cidetailedreport.getOrderld());
            }
            if (cidetailedreport.getIserror() != null) {
                criteria.andIserrorEqualTo(cidetailedreport.getIserror());
            }
        }

        return cidetailedreportMapper.selectByExample(example);
    }
}
