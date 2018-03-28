package com.lazydsr.lazydsrwebtemplate.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lazydsr.lazydsrwebtemplate.entity.Menu;
import com.lazydsr.lazydsrwebtemplate.service.MenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
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

    @GetMapping("json")
    @ResponseBody
    public List<Menu> findJson() {
        return menuService.findAllNormal();
    }

    @GetMapping("json/page")
    @ResponseBody
    public Map findAllJson(int page, int limit) {

        Map map = new HashMap();
        List<Menu> all = menuService.findAllNormal();
        PageHelper.startPage(page, limit);
        List<Menu> menus = menuService.findAllNormal();
        PageInfo<Menu> pageInfo = new PageInfo<>(menus);

        for (Menu menu : menus) {
            for (Menu t : all) {
                if ("0".equals(menu.getParentId())) {
                    menu.setParentId("根菜单");
                    continue;
                }
                if (t.getId().equals(menu.getParentId())) {
                    menu.setParentId(t.getName());
                    continue;
                }
            }
        }

        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getTotal());
        map.put("data", menus);
        //map.put("code", 0);
        //map.put("msg", "");
        //map.put("count", menus.getTotalElements());
        //map.put("data", menus.getContent());
        return map;
    }

    @GetMapping
    public String find() {
        return "menu/menu";
    }

    @GetMapping("/{type}/{id}")
    public String findById(@PathVariable("type") String type, @PathVariable("id") String id, Map map) {
        String url = "";
        if (type != null && type.equalsIgnoreCase("edit")) {
            url = "menu/menuEdit";
        } else {
            url = "menu/menuView";
        }
        Menu menu = menuService.findById(id);
        map.put("menu", menu);
        return url;
    }
    @PutMapping
    public String edit(Menu menu){
        System.out.println(menu);
        menuService.update(menu);
        return "redirect:/menu/view/"+menu.getId();
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public Map deleteById(@PathVariable("id") String id) {
        Map<String, String> map = new HashMap<>();
        int count = menuService.delete(id);
        if (count > 0) {
            map.put("status", "0");
        } else {
            map.put("status", "1");
        }
        return map;
    }
}
