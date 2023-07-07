package com.example.elmboot.service;


import com.example.elmboot.entity.Checkitemdetailed;

import java.util.List;

public interface CheckitemdetailedService {


    int add(Checkitemdetailed checkitemdetailed);
    int deleteCheck(Checkitemdetailed checkitemdetailed);

    List<Checkitemdetailed> getList(Checkitemdetailed checkitemdetailed);

}
