package com.example.elmboot.service.impl;

import com.example.elmboot.entity.Users;
import com.example.elmboot.mapper.UsersMapper;
import com.example.elmboot.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;


    @Override
    public List<Users> getAllBy(Users users) {
        List<Users> users1 = usersMapper.selectByExample(null);
        // 移除密码
        for(Users u : users1) {
            u.setPassword("");
        }
        return users1;
    }

    @Override
    public Users getUserById(String userId) {
        return usersMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int saveUser(Users users) {
        return usersMapper.updateByPrimaryKeySelective(users);
    }
}
