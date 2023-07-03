package com.example.elmboot;

import com.example.elmboot.config.CookieFilter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan("com.example.elmboot.mapper")
public class ElmbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElmbootApplication.class, args);
    }

//    @Bean
    public FilterRegistrationBean<CookieFilter> cookieFilterRegistration() {
        FilterRegistrationBean<CookieFilter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new CookieFilter());
        registration.addUrlPatterns("/*"); // 拦截所有请求
        registration.setName("cookieFilter");
        registration.setOrder(1); // 设置过滤器的执行顺序，如果有多个过滤器的话

        return registration;
    }

}
