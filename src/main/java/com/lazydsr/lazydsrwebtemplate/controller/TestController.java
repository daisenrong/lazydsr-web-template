package com.lazydsr.lazydsrwebtemplate.controller;

import com.lazydsr.lazydsrwebtemplate.config.cache.redis.RedisService;
import com.lazydsr.lazydsrwebtemplate.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.controller
 * Created by Lazy on 2018/5/19 15:38
 * Version: 0.1
 * Info: @TODO:...
 */
@RestController
@RequestMapping("test")
@Slf4j
public class TestController {
    @Autowired
    private RedisService redisService;
    @RequestMapping("/{string}")
    public String test(@PathVariable String string){
        int a=3;
        User user = new User();
        //user.set;
        redisService.set(a+"",user);
        String s = (String)redisService.get(string);
        log.error(s+"-----"+s);
        return s;
    }
}
