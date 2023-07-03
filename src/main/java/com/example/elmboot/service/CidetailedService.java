package com.example.elmboot.service;


import com.example.elmboot.entity.Cidetailedreport;

import java.util.List;

public interface CidetailedService {

    int save(Cidetailedreport cidetailedreport);

    List<Cidetailedreport> list(Cidetailedreport cidetailedreport);


}
