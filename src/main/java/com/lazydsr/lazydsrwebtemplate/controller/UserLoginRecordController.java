package com.lazydsr.lazydsrwebtemplate.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lazydsr.lazydsrwebtemplate.entity.UserLoginRecord;
import com.lazydsr.lazydsrwebtemplate.service.UserLoginRecordService;
import com.lazydsr.lazydsrwebtemplate.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LoginRecordController
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.controller
 * Created by Lazy on 2018/3/30 22:15
 * Version: 0.1
 * Info: @TODO:...
 */
@Controller
@RequestMapping("/userLoginRecord")
public class UserLoginRecordController {
    @Autowired
    private UserLoginRecordService userLoginRecordService;

    @GetMapping
    public String find(Map map) {
        //List<UserLoginRecord> records = userLoginRecordService.findAll();
        //map.put("currentLoginUser", Util.getCurrentUser());
        return "userLoginRecord/userLoginRecord";
    }

    @GetMapping("/json/page/{userId}")
    @ResponseBody
    public Map findByUserId(@PathVariable String userId, int page, int limit) {
        //List<UserLoginRecord> records = userLoginRecordService.findAll();
        //map.put("currentLoginUser", Util.getCurrentUser());
        Map map = new HashMap();
        PageHelper.offsetPage();
        List<UserLoginRecord> userLoginRecords = userLoginRecordService.findByUserId(userId);
        PageInfo<UserLoginRecord> pageInfo = new PageInfo<>(userLoginRecords);
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getTotal());
        map.put("data", userLoginRecords);
        return map;
    }

}
