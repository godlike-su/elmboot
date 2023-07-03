package com.example.elmboot.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SessionUserDetail {
    private String userId;
    private String userName;
    private String password;
    private Integer usertype;
    private String session;

    public SessionUserDetail() {

    }

    public SessionUserDetail(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public SessionUserDetail(String userId, String userName, Integer usertype, String session) {
        this.userId = userId;
        this.userName = userName;
        this.usertype = usertype;
        this.session = session;
    }
}