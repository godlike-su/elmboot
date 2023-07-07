package com.example.elmboot.controller;

import com.example.elmboot.entity.Users;
import com.example.elmboot.result.MessageResult;
import com.example.elmboot.result.SingleResult;
import com.example.elmboot.service.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

@RestController
@Api(value = "登录注册", tags = "登录注册")
public class LoginController {

    @Autowired
    private LoginService loginService;


    @PostMapping("/login")
    @ApiOperation(value = "用户登录")
    public MessageResult login(@RequestBody Users users) {
        String login = loginService.login(users.getUserid(), users.getPassword());
        return new MessageResult(login);
    }

    @PostMapping("/register")
    @ApiOperation(value = "用户注册")
    public MessageResult register(@RequestBody Users users) {
        users.setUsertype(1);
        String register = loginService.regiest(users);
        return new MessageResult(register);
    }


    @PostMapping("/logout")
    @ApiOperation(value = "用户注册")
    public MessageResult logout() {
        loginService.logout();
        return new MessageResult();
    }

    @GetMapping("/downloadFileByImage")
    @ApiOperation(value = "文件下载，以图片形式显示")
    public void downloadFileByImage(@RequestParam("attachGroupId") String attachGroupId
            , HttpServletResponse response) {
        loginService.downloadFileByImage(attachGroupId, response);
    }

    @PostMapping("/uploadFile")
    @ApiOperation("文件上传")
    public MessageResult uploadFile(@RequestParam("file") MultipartFile file) {
        String s = loginService.uploadPhotoFile(file);
        return new MessageResult(s);
    }


}
