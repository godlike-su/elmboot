package com.example.elmboot.service;


import com.example.elmboot.entity.Checkitem;
import com.example.elmboot.entity.Cidetailedreport;

import java.util.List;

public interface CidetailedService {

    int save(Cidetailedreport cidetailedreport);

    List<Cidetailedreport> list(Cidetailedreport cidetailedreport);


    List<Checkitem> listCideByOrderId(Cidetailedreport cidetailedreport);


}
