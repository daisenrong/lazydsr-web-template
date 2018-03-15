package com.lazydsr.lazydsrwebtemplate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * home
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.controller
 * Created by Lazy on 2018/3/12 23:48
 * Version: 0.1
 * Info: @TODO:...
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping({"/","index"})
    public String index() {
        return "index/index";
    }

    @RequestMapping("home")
    public String home() {
        return "index/home";
    }

}
