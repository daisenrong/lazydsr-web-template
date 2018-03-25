package com.lazydsr.lazydsrwebtemplate.config.security;

import com.lazydsr.lazydsrwebtemplate.base.STATICVALUE;
import com.lazydsr.lazydsrwebtemplate.entity.UserLoginRecord;
import com.lazydsr.lazydsrwebtemplate.service.UserLoginRecordService;
import com.lazydsr.lazydsrwebtemplate.service.UserService;
import com.lazydsr.util.time.UtilDateTime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * LoginFailureHandler
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.config.security
 * Created by Lazy on 2018/3/19 1:16
 * Version: 0.1
 * Info: @TODO:...
 */
@Slf4j
@Component
public class LoginFailureHandler extends SimpleUrlAuthenticationFailureHandler {
    @Autowired
    private UserService userService;
    @Autowired
    private UserLoginRecordService userLoginRecordService;

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        String currentDate = UtilDateTime.getCurrDateTime();
        String username = request.getParameter("username");
        //针对用户登录失败之后修改用户表中的一些信息
        com.lazydsr.lazydsrwebtemplate.entity.User user = userService.findByUsername(username);
        if (user != null) {
            user.setSumpasswordwrong(user.getSumpasswordwrong()+1);
            //user.setLastLoginDate(user.getCurrentLoginDate());
            //user.setCurrentLoginDate(currentDate);
            userService.update(user);

            UserLoginRecord userLoginRecord = new UserLoginRecord();
            userLoginRecord.setUserId(user.getId());
            userLoginRecord.setUsername(user.getUsername());
            userLoginRecord.setDate(currentDate);
            //TODO：后续优化
            userLoginRecord.setType(STATICVALUE.ENABLE);
            userLoginRecord.setLoginStatus(STATICVALUE.DISABLE);
            userLoginRecord.setIp(request.getRemoteAddr());
            userLoginRecordService.add(userLoginRecord);
        }


        super.onAuthenticationFailure(request, response, exception);
    }
}
