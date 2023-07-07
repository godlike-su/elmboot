package com.example.elmboot.config;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.example.elmboot.cache.DoctorCacheService;
import com.example.elmboot.cache.MyCacheService;
import com.example.elmboot.entity.Doctor;
import com.example.elmboot.entity.SessionUserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component("cookieFilter")
public class CookieFilter implements Filter {

    @Autowired
    private MyCacheService myCacheService;

    private static final String[] EXCLUDED_PATHS = {"/login", "/register", "/downloadFileByImage"
            , "/swagger-ui.html", "/swagger-resources", "/v2/api-docs", "/doctor", "/webjars", "/csrf", "/downloadFileByImage", "/uploadFile"};

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

        // 检查是否为排除路径
        boolean isExcluded = false;
        for (String path : EXCLUDED_PATHS) {
            if (requestPath.startsWith(path)) {
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
            SessionUserDetail cachedData = myCacheService.getCachedData(cookieValue);
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
            request.setAttribute("userId", cachedData.getUserId());
            request.setAttribute("userName", cachedData.getUserName());
            request.setAttribute("usertype", String.valueOf(cachedData.getUsertype()));
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
