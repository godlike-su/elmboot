package com.example.elmboot.config;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.example.elmboot.cache.DoctorCacheService;
import com.example.elmboot.cache.MyCacheService;
import com.example.elmboot.entity.Doctor;
import com.example.elmboot.entity.SessionUserDetail;
import com.example.elmboot.service.SessionUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component("doctorCookieFilter")
public class DoctorCookieFilter implements Filter {


    @Autowired
    private DoctorCacheService doctorCacheService;

    private static final String[] EXCLUDED_PATHS = {"/downloadFileByImage"
            , "/swagger-ui.html", "/swagger-resources/**", "/v2/api-docs", "/doctor/login"};

    private static final String[] CLUDED_PATHS = {"/doctor"};


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // 初始化操作，如果有需要可以在这里进行设置
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        // 获取请求路径
        String requestPath = request.getRequestURI().substring(request.getContextPath().length());

        // 检查是否为需要检查路径
        boolean isExcluded = true;
        for (String path : CLUDED_PATHS) {
            if (requestPath.startsWith(path) ) {
               // 需要检查
                isExcluded = false;
                break;
            }
        }
        // 是否为排除路径
        for (String path : EXCLUDED_PATHS) {
            if (requestPath.startsWith(path) ) {
                // 不需要检查
                isExcluded = true;
                break;
            }
        }

        // 如果为排除路径，直接继续处理请求
        if (isExcluded) {
            filterChain.doFilter(request, response);
            return;
        }

        // 检查请求中是否包含Cookie
        String cookieValue = request.getHeader("Authorization");
        if (cookieValue == null || cookieValue.isEmpty()) {
            // 没有Cookie，可以进行相应的处理，例如返回错误信息或者重定向到其他页面
            JSONObject json = new JSONObject(true);
            json.put("status", "401");
            json.put("message", "权限不足");

            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/plain");
            response.getWriter().print( JSON.toJSONString(json, SerializerFeature.PrettyFormat) );
            return;
        } else {
            // 查询缓存是否有数据
            Doctor cachedData = doctorCacheService.getCachedData(cookieValue);
            if (cachedData == null) {
                // 没有
                JSONObject json = new JSONObject(true);
                json.put("status", "401");
                json.put("message", "登录信息错误,请重新登录");

                response.setCharacterEncoding("UTF-8");
                response.setContentType("text/plain");
                response.getWriter().print( JSON.toJSONString(json, SerializerFeature.PrettyFormat) );
                return;
            }
            // 不为空，放入Session中
            request.setAttribute("doccode", cachedData.getDoccode());
            request.setAttribute("realname", cachedData.getRealname());
            request.setAttribute("deptno", String.valueOf(cachedData.getDeptno()));
            request.setAttribute("docid", String.valueOf(cachedData.getDocid()));
            request.setAttribute("session", cookieValue);
        }

        // Cookie存在且合法，继续处理请求
        filterChain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        // 销毁操作，如果有需要可以在这里进行清理
    }
}
