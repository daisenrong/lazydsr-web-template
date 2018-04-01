package com.lazydsr.lazydsrwebtemplate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * IconController
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.controller
 * Created by Lazy on 2018/3/29 15:46
 * Version: 0.1
 * Info: @TODO:...
 */
@Controller
@RequestMapping("/icon")
public class IconController {
    @GetMapping
    public String find() {
        return "icon/icon";
    }
}
