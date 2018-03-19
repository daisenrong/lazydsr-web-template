package com.lazydsr.lazydsrwebtemplate.config.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * WebSecurityConfiguration
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.config.security
 * Created by Lazy on 2018/3/18 15:44
 * Version: 0.1
 * Info: @TODO:...
 */
@Configuration
@EnableWebSecurity
@Slf4j
@EnableGlobalMethodSecurity(prePostEnabled = true)//允许进入页面方法前检验
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Autowired
    private CustomUserService customUserService;
    @Autowired
    private LogoutSuccessHandler logoutSuccessHandler;
    @Autowired
    private LoginSuccessHandler loginSuccessHandler;
    @Autowired
    private LoginFailureHandler loginFailureHandler;


    @Bean
    public PasswordEncoder passwordEncoder() {
        //return new BCryptPasswordEncoder();
        return new CustomPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        log.error("SecurityConfig start");
        http.headers().frameOptions().disable();
        http
                .authorizeRequests()
                //.antMatchers("/static/**").permitAll()
                //.antMatchers("/").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login").failureUrl("/login?error")
                //.usernameParameter("username").passwordParameter("password")
                .defaultSuccessUrl("/").successHandler(loginSuccessHandler)
                .failureHandler(loginFailureHandler)
                .permitAll()
                .and()
                .logout()
                .logoutUrl("/logout")
                .logoutSuccessHandler(logoutSuccessHandler)
                //.logoutSuccessUrl("/login")
                .permitAll();

        super.configure(http);
        http.csrf().disable();
        log.error("SecurityConfig start success");

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        super.configure(auth);
        //auth.inMemoryAuthentication().withUser("admin").password("admin").roles("USER");
        auth.userDetailsService(customUserService);

    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        //super.configure(web);
        web.ignoring().antMatchers("/static/**", "/druid/**");
    }

    /**
     * 用户注销后handler
     */
    //private LogoutSuccessHandler logoutSuccessHandler() {
    //    //return new LoginSuccessHandler();
    //    return new HttpStatusReturningLogoutSuccessHandler() {
    //        @Override
    //        public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws ServletException, IOException {
    //            User userDetails = (User) authentication.getPrincipal();
    //            log.error("用户退出：username=" + userDetails.getUsername() + ", uri=" + request.getContextPath());
    //            super.onLogoutSuccess(request, response, authentication);
    //        }
    //    };
    //}

    /**
     * 用户登录成功后handler
     */
    //private AuthenticationSuccessHandler loginSuccessHandler() {
    //    //return new LoginSuccessHandler();
    //    return new SavedRequestAwareAuthenticationSuccessHandler() {
    //        @Override
    //        public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws ServletException, IOException {
    //            User userDetails = (User) authentication.getPrincipal();
    //            log.error("登录用户：username=" + userDetails.getUsername() + ", uri=" + request.getContextPath());
    //            super.onAuthenticationSuccess(request, response, authentication);
    //        }
    //    };
    //}
}
