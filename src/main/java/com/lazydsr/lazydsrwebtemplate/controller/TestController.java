package com.lazydsr.lazydsrwebtemplate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.controller
 * Created by Lazy on 2018/3/9 23:00
 * Version: 0.1
 * Info: @TODO:...
 */
@RestController
@RequestMapping("/test")
public class TestController {
    //@Autowired
    //private DynamicDataSourceConfiguration dynamicDataSourceConfiguration;

    @GetMapping
    public boolean initData() {
        return false;
    }

}
