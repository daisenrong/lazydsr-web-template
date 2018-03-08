package com.lazydsr.lazydsrwebtemplate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * UserController
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.controller
 * Created by Lazy on 2018/3/8 11:10
 * Version: 0.1
 * Info: @TODO:...
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping
    public String findAll() {
        return "test";
    }

    @GetMapping("/{id}")
    public String findOne(@PathVariable String id, Model model) {
        model.addAttribute("id", id);
        System.out.println(id);
        return "test";
    }
}
