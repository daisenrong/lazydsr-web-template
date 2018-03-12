package com.lazydsr.lazydsrwebtemplate.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * MvcConfiguration
 * PROJECT_NAME: lazy-web
 * PACKAGE_NAME: com.lazy.lazyweb.config
 * Created by Lazy on 2017/10/9 10:57
 * Version: 0.1
 * Info: 给静态资源添加额外的路径
 */
@Configuration
@Slf4j
public class MvcConfiguration extends WebMvcConfigurerAdapter {
    //@Value("${user.status}")
    //private boolean userStatus;



    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        super.addResourceHandlers(registry);
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //log.error(userStatus.toString());
        //super.addInterceptors(registry);
        //if (userStatus.isStatus()) {
        //    //registry.addInterceptor(new UserInterceptor()).addPathPatterns("/**").excludePathPatterns("/error", "/login");
        //}
    }
}