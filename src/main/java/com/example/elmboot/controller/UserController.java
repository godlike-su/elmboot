package com.example.elmboot.controller;


import com.example.elmboot.cache.MyCacheService;
import com.example.elmboot.entity.SessionUserDetail;
import com.example.elmboot.entity.Users;
import com.example.elmboot.result.MessageResult;
import com.example.elmboot.result.SingleResult;
import com.example.elmboot.service.SessionUser;
import com.example.elmboot.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
@Api(value = "用户信息", tags = "用户信息")
public class UserController {


    @Autowired
    private UserService userService;

    @Autowired
    private SessionUser sessionUser;

    @Autowired
    private MyCacheService myCacheService;

    @PostMapping("/getUserBy")
    @ApiOperation(value = "根据id获取用户")
    public SingleResult<Users> getUserBy(@RequestBody Users users) {

        Users result = userService.getUserById(users.getUserid());
        result.setPassword("");

        return new SingleResult<>(result);
    }

    @PostMapping("/getMe")
    @ApiOperation(value = "获取自己的信息")
    public SingleResult<Users> getMe() {
        SessionUserDetail sessionUser1 = sessionUser.getSessionUser();
        Users result = userService.getUserById(sessionUser1.getUserId());
        result.setPassword("");

        return new SingleResult<>(result);
    }

    @PostMapping("/saveUser")
    @ApiOperation(value = "修改用户的信息")
    public MessageResult saveUser(@RequestBody Users users) {
        int result = userService.saveUser(users);

        return new MessageResult(String.valueOf(result));
    }


    @PostMapping("/saveUserMe")
    @ApiOperation(value = "修改自己的信息")
    public MessageResult saveUserMe(@RequestBody Users users) {
        SessionUserDetail sessionUser1 = sessionUser.getSessionUser();
        users.setUserid(sessionUser1.getUserId());
        int result = userService.saveUser(users);

        return new MessageResult(String.valueOf(result));
    }


    @PostMapping("/test")
    @ApiOperation(value = "测试，根据缓存cookie获取信息")
    public SingleResult<SessionUserDetail> test(String cookie) {
        SessionUserDetail cachedData = myCacheService.getCachedData(cookie);

        return new SingleResult<>(cachedData);
    }




}
