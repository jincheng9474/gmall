package com.atguigu.gmall.order.interceptor;

import com.atguigu.gmall.common.utils.CookieUtils;
import com.atguigu.gmall.common.utils.JwtUtils;
import com.atguigu.gmall.order.config.JwtProperties;
import com.atguigu.gmall.order.pojo.UserInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.UUID;

/**
 * @author : ZJC
 * @date : 2021/2/23 17:58
 * className : LoginInterceptor
 * package: com.atguigu.gmall.cart.interceptor
 * version : 1.0
 * Description
 */
@Component
@EnableConfigurationProperties(JwtProperties.class)
public class LoginInterceptor implements HandlerInterceptor {

    private static final ThreadLocal<UserInfo> THREAD_LOCAL = new ThreadLocal<>();

    @Autowired
    private JwtProperties properties;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("这是拦截器的前置方法");

        UserInfo userInfo = new UserInfo();

        // 获取token
        String userId = request.getHeader("userId");
        userInfo.setUserId(Long.valueOf(userId));

        THREAD_LOCAL.set(userInfo);

        return true;
    }

    public static UserInfo getUserInfo(){
        return THREAD_LOCAL.get();
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // 这里必须清空threadLocal中的资源，因为使用的是tomcat线程池，线程无法结束
        THREAD_LOCAL.remove();
    }
}