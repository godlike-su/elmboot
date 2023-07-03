package com.example.elmboot.service.impl;

import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.ObjectUtil;
import com.example.elmboot.cache.MyCacheService;
import com.example.elmboot.entity.SessionUserDetail;
import com.example.elmboot.entity.Users;
import com.example.elmboot.exception.DataNullException;
import com.example.elmboot.exception.GenerallyeException;
import com.example.elmboot.exception.ParamerException;
import com.example.elmboot.mapper.UsersMapper;
import com.example.elmboot.service.LoginService;
import com.example.elmboot.service.SessionUser;
import com.example.elmboot.util.UrlParse;
import com.github.pagehelper.util.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

@Slf4j
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UsersMapper usersMapper;

    @Autowired
    private MyCacheService myCacheService;

    @Autowired
    private SessionUser sessionUser;

    @Value("${file.uploadFolder}")
    private String uploadFolder;


    @Override
    public String login(String userId, String password) {
        if (StringUtil.isEmpty(userId) || StringUtil.isEmpty(password)) {
            throw new ParamerException("参数为空!");
        }
        Users users = usersMapper.selectByPrimaryKey(userId);
        if (ObjectUtil.isEmpty(users)) {
            throw new GenerallyeException("不存在该用户");
        }
        if (password.equals(users.getPassword())) {
            // 密码正确，生成唯一id作为cookie
            String simpleUUID = IdUtil.simpleUUID();
            // 存入缓存
            SessionUserDetail sessionUserDetail = new SessionUserDetail();
            sessionUserDetail.setUserId(userId);
            sessionUserDetail.setUsertype(users.getUsertype());
            sessionUserDetail.setUserName(users.getRealname());
            sessionUserDetail.setSession(simpleUUID);

            myCacheService.updateCachedData(simpleUUID, sessionUserDetail);
            return simpleUUID;
        } else {
            throw new GenerallyeException("密码错误");
        }
    }

    @Override
    public String regiest(Users users) {
        try {
            int i = usersMapper.insertSelective(users);
            if (i==1) {
                return "注册成功";
            } else {
                return "注册失败";
            }
        } catch (Exception e) {
            log.error("", e);
            throw new GenerallyeException("注册失败");
        }
    }

    @Override
    public void logout() {
        SessionUserDetail sessionUserDetail = sessionUser.getSessionUser();
        myCacheService.evictCache(sessionUserDetail.getSession());
    }

    @Override
    public void downloadFileByImage(String attachGroupId, HttpServletResponse response) {
        File file = new File(uploadFolder + attachGroupId);
        log.info("文件位置: " + file.getAbsolutePath());
        if (!file.exists()) {
            throw new DataNullException("该文件不存在！");
        }

        String filename = filenameEncoding(attachGroupId);
        // 告知浏览器文件的大小
        response.addHeader("Content-Length", "" + file.length());
        // 设置对应文件的头文件
        UrlParse urlParse = new UrlParse();
        String suffix = urlParse.urlSuffix(filename);
        response.setContentType(urlParse.getContentType(suffix));
        response.addHeader("Content-Disposition", "attachment;fileName=" + filename);
        response.addHeader("Pargam", "no-cache");
        response.addHeader("Cache-Control", "no-cache");
        byte[] buffer = new byte[1024];
        try (FileInputStream fis = new FileInputStream(file);
             BufferedInputStream bis = new BufferedInputStream(fis)) {
            OutputStream os = response.getOutputStream();

            int i = bis.read(buffer);
            while (i != -1) {
                os.write(buffer, 0, i);
                i = bis.read(buffer);
            }
        } catch (Exception e) {
            log.error("下载文件出错:", e);
            throw new GenerallyeException("下载文件出错!");
        }
    }
    public String filenameEncoding(String fileName) {
        try {
            return URLEncoder.encode(fileName, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new GenerallyeException("解析文件名出错!");
        }

    }
    private void fileModelVertify(String mimeTyp) {
        boolean equals = mimeTyp.equals("image/jpeg") || mimeTyp.equals("image/png") || mimeTyp.equals("video/mp4")
                || mimeTyp.equals("image/gif");
        if (!equals) {
            throw new GenerallyeException("文件只允许jpg、jpeg、gif、mp4上传。 mineType错误: " + mimeTyp);
        }
    }
}
