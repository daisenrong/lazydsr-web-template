package com.lazydsr.lazydsrwebtemplate.controller;

import com.lazydsr.lazydsrwebtemplate.entity.User;
import com.lazydsr.lazydsrwebtemplate.propdomian.MainDataSourceInfo;
import com.lazydsr.lazydsrwebtemplate.entity.SystemInfo;
import com.lazydsr.lazydsrwebtemplate.service.SystemInfoService;
import com.lazydsr.lazydsrwebtemplate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * home
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.controller
 * Created by Lazy on 2018/3/12 23:48
 * Version: 0.1
 * Info: @TODO:...
 */
@Controller
//@RequestMapping("/")
public class IndexController {
    @Autowired
    private SystemInfoService systemInfoService;
    @Autowired
    private MainDataSourceInfo mainDataSourceInfo;
    @Autowired
    private UserService userService;

    @RequestMapping({"/", "index"})
    //@RequestMapping()
    public String index(Map map) {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = userService.findByUsername(userDetails.getUsername());
        map.put("user", user);
        return "index/index";
    }

    @RequestMapping("/home")
    public String home(Map map) {
        SystemInfo systemInfo = systemInfoService.findByMaxCreateDate();
        map.put("systemInfo", systemInfo);
        map.put("mainDataSourceInfo", mainDataSourceInfo);
        return "index/home";
    }

}
