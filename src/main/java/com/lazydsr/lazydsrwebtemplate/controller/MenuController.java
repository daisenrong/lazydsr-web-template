package com.lazydsr.lazydsrwebtemplate.controller;

import com.lazydsr.lazydsrwebtemplate.entity.Menu;
import com.lazydsr.lazydsrwebtemplate.service.MenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MenuController
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.controller
 * Created by Lazy on 2018/3/19 16:12
 * Version: 0.1
 * Info: @TODO:...
 */
@Controller
@Slf4j
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private MenuService menuService;

    //@GetMapping("json")
    //@ResponseBody
    //public List<Menu> findJson() {
    //    return menuService.findByUserIdAndStatus();
    //}

    @GetMapping("json/all")
    @ResponseBody
    public Map findAllJson(int page, int limit) {

        Map map=new HashMap();
        List<Menu> menus = menuService.findPage(page>0?page-1:0, limit);
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", menus.size());
        map.put("data", menus);
        return map;

    }

    @GetMapping
    public String find() {

        return "menu/menu";
    }

}
