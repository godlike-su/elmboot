package com.example.elmboot.service.impl;

import com.example.elmboot.entity.Doctor;
import com.example.elmboot.service.SessionDoctor;
import com.github.pagehelper.util.StringUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Service
public class SessionDoctorImpl implements SessionDoctor {

    private static final Doctor ANONYMOUS_DOCTOR = new Doctor(0, "anonymous", "1", 1);

    @Override
    public Doctor getSessionDoctor() {
        ServletRequestAttributes servletRequestAttributes
                = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        Doctor sessionUserDetail = null;
        if (servletRequestAttributes != null) {
            HttpServletRequest request = servletRequestAttributes.getRequest();
            sessionUserDetail = this.getUserbyLocation(request);
        }
        return sessionUserDetail == null ? ANONYMOUS_DOCTOR : sessionUserDetail;
    }

    private Doctor getUserbyLocation(HttpServletRequest request) {
        String doccode = (String) request.getAttribute("doccode");
        String realname = (String) request.getAttribute("realname");
        String deptno = (String) request.getAttribute("deptno");
        String docid = (String) request.getAttribute("docid");
        String session = (String) request.getAttribute("session");
        if(StringUtil.isNotEmpty(doccode)) {
            return new Doctor(Integer.valueOf(docid), doccode, realname, Integer.valueOf(deptno));
        }
        return null;
    }

}
