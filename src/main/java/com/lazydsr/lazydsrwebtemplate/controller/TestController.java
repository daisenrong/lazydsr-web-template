package com.lazydsr.lazydsrwebtemplate.controller;

import com.lazydsr.lazydsrwebtemplate.config.datasource.MultiDatasourceConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private MultiDatasourceConfiguration multiDatasourceConfiguration;

    @GetMapping
    public boolean initData() {
        return multiDatasourceConfiguration.init();
    }
}
