package com.example.elmboot.service;


import com.example.elmboot.entity.Users;

import javax.servlet.http.HttpServletResponse;

public interface LoginService {

    String login(String userId, String password);

    String regiest(Users users);

    void logout();


    void downloadFileByImage(String attachGroupId, HttpServletResponse response);


}
