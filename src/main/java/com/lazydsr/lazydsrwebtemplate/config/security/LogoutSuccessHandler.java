package com.lazydsr.lazydsrwebtemplate.config.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * LogoutSuccessHandler
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.config.security
 * Created by Lazy on 2018/3/18 22:41
 * Version: 0.1
 * Info: @TODO:...
 */
@Slf4j
@Component
//public class LogoutSuccessHandler extends HttpStatusReturningLogoutSuccessHandler {
public class LogoutSuccessHandler extends SimpleUrlLogoutSuccessHandler {
    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        //super.onLogoutSuccess(request, response, authentication);

        //------------------------------------------------------------------------------------------------------------------//
        //                                                                                                                  //
        //--------------------------太牛逼了，我真是太牛逼了，这么明显的错误我竟然毫无察觉，太牛逼了--------------------------------//
        //                                                                                                                  //
        //------------------------------------------------------------------------------------------------------------------//
        //                                                                                                                  //
        //                                                                                                                  //
        //                                                                                                                  //
        //                                                                                                                  //
        //                                                                                                                  //
        //                                                                                                                  //
        //                                                                                                                  //
        //                                                                                                                  //
        //                                                                                                                  //
        //                                                                                                                  //
        //                                                                                                                  //
        //                                                                                                                  //
        //                                                                                                                  //
        //                                                                                                                  //
        //                                                                                                                  //
        //                                                                                                                  //
        //------------------------------------------------------------------------------------------------------------------//
        //---- //User userDetails = (User) authentication.getPrincipal();                                                   //
        //---- //log.error("用户退出：username=" + userDetails.getUsername() + ", uri=" + request.getContextPath());         //
        //------------------------------------------------------------------------------------------------------------------//
        setDefaultTargetUrl("/login");
        super.onLogoutSuccess(request, response, authentication);
    }
}
