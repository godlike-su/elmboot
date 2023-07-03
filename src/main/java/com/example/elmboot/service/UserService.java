package com.example.elmboot.service;


import com.example.elmboot.entity.Users;

import java.util.List;

public interface UserService {


    List<Users> getAllBy(Users users);

    Users getUserById(String userId);

    int saveUser(Users users);

}
