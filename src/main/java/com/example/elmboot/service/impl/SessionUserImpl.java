package com.example.elmboot.service.impl;

import com.example.elmboot.entity.SessionUserDetail;
import com.example.elmboot.service.SessionUser;
import com.github.pagehelper.util.StringUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Service
public class SessionUserImpl implements SessionUser {

    private static final SessionUserDetail ANONYMOUS_USER = new SessionUserDetail("-1", "anonymous", 1, "session");

    @Override
    public SessionUserDetail getSessionUser() {
        ServletRequestAttributes servletRequestAttributes
                = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        SessionUserDetail sessionUserDetail = null;
        if (servletRequestAttributes != null) {
            HttpServletRequest request = servletRequestAttributes.getRequest();
            sessionUserDetail = this.getUserbyLocation(request);
        }
        return sessionUserDetail == null ? ANONYMOUS_USER : sessionUserDetail;
    }

    private SessionUserDetail getUserbyLocation(HttpServletRequest request) {
        String userId = (String) request.getAttribute("userId");
        String userName = (String) request.getAttribute("userName");
        String usertype = Optional.ofNullable((String) request.getAttribute("usertype")).orElse("1");
        String session = (String) request.getAttribute("session");
        if(StringUtil.isNotEmpty(userId)) {
            return new SessionUserDetail(userId, userName, Integer.valueOf(usertype), session);
        }
        return null;
    }

}
