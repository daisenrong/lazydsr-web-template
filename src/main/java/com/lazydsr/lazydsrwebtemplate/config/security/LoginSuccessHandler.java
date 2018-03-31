package com.lazydsr.lazydsrwebtemplate.config.security;

import com.lazydsr.lazydsrwebtemplate.base.STATICVALUE;
import com.lazydsr.lazydsrwebtemplate.entity.UserLoginRecord;
import com.lazydsr.lazydsrwebtemplate.service.UserLoginRecordService;
import com.lazydsr.lazydsrwebtemplate.service.UserService;
import com.lazydsr.lazydsrwebtemplate.util.Util;
import com.lazydsr.util.time.UtilDateTime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * LoginSuccessHandler
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.config.security
 * Created by Lazy on 2018/3/19 0:02
 * Version: 0.1
 * Info: 用户登录成功后徐操作
 * ------设置用户的密码错误次数为0
 * ------设置用户上次登录时间和当前登录时间
 * ------对用户登录进行记录
 */
@Slf4j
@Component
public class LoginSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
    @Autowired
    private UserService userService;
    @Autowired
    private UserLoginRecordService userLoginRecordService;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws ServletException, IOException {
        //super.onAuthenticationSuccess(request, response, authentication);
        String currentDate = UtilDateTime.getCurrDateTime();
        User userDetails = (User) authentication.getPrincipal();
        //针对用户登录成功之后修改用户表中的一些信息
        com.lazydsr.lazydsrwebtemplate.entity.User user = userService.findByUsername(userDetails.getUsername());
        user.setSumPasswordWrong(0);
        user.setLastLoginDate(user.getCurrentLoginDate());
        user.setCurrentLoginDate(currentDate);
        userService.update(user);
        //将当前登录的用户放到session中
        request.getSession().setAttribute("currentLoginUser", user);

        //对用户登录行为进行记录
        UserLoginRecord userLoginRecord = new UserLoginRecord();
        userLoginRecord.setUserId(user.getId());
        userLoginRecord.setUsername(user.getUsername());
        userLoginRecord.setDate(currentDate);
        //TODO：后续优化
        userLoginRecord.setType(STATICVALUE.ENABLE);
        userLoginRecord.setLoginStatus(STATICVALUE.ENABLE);
        //userLoginRecord.setIp(request.getRemoteAddr());
        userLoginRecord.setIp(Util.getIpAddress(request));
        userLoginRecordService.add(userLoginRecord);


        log.info("用户登录成功：username=" + userDetails.getUsername() + ", uri=" + Util.getIpAddress(request));
        //request.getSession().removeAttribute(WebAttributes.WEB_INVOCATION_PRIVILEGE_EVALUATOR_ATTRIBUTE);
        super.onAuthenticationSuccess(request, response, authentication);
    }
}
