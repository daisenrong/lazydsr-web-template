package com.lazydsr.lazydsrwebtemplate.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lazydsr.commons.result.ResultBody;
import com.lazydsr.lazydsrwebtemplate.entity.Menu;
import com.lazydsr.lazydsrwebtemplate.service.MenuService;
import com.lazydsr.lazydsrwebtemplate.vo.MenuZtreeVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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

    @PostMapping
    @ResponseBody
    public Menu save(Menu menu) {
        Menu newMenu = menuService.add(menu);
        return newMenu;
    }

    @GetMapping("json")
    @ResponseBody
    public List<Menu> findJson() {
        return menuService.findAllNormal();
    }

    @GetMapping("json/ztree")
    @ResponseBody
    public ResultBody findJson2Ztree() {
        List<Menu> menus = menuService.findAllNormal();
        ArrayList<MenuZtreeVo> menuZtreeVos = new ArrayList<>();

        for (Menu menu : menus) {
            MenuZtreeVo menuZtreeVo = new MenuZtreeVo();
            menuZtreeVo.setId(menu.getId());
            if (menu.getParentId().equals("")) {
                menuZtreeVo.setpId("0");
            } else {
                menuZtreeVo.setpId(menu.getParentId());
            }
            menuZtreeVo.setName(menu.getName());
            //menuZtreeVo.setIcon(menu.getIcon());
            //menuZtreeVo.setIconSkin(menu.getIcon());
            menuZtreeVo.setTarget(menu.getTarget());
            menuZtreeVo.setUrl(menu.getUrl());
            menuZtreeVos.add(menuZtreeVo);
        }
        //添加根节点
        MenuZtreeVo menuZtreeVo = new MenuZtreeVo();
        menuZtreeVo.setName("根");
        menuZtreeVo.setId("0");
        menuZtreeVo.setOpen(true);
        menuZtreeVo.setShowRemoveBtn(false);
        menuZtreeVo.setShowRenameBtn(false);
        menuZtreeVos.add(menuZtreeVo);

        return ResultBody.success(menuZtreeVos);
    }


    @GetMapping("json/page")
    @ResponseBody
    public Map findAllJson(int page, int limit) {

        Map map = new HashMap();
        List<Menu> all = menuService.findAll();
        PageHelper.startPage(page, limit);
        List<Menu> menus = menuService.findAll();
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

    @GetMapping("/{id}")
    @ResponseBody
    public Menu findById(@PathVariable("id") String id) {

        Menu menu = menuService.findById(id);
        return menu;
    }

    @Deprecated
    @GetMapping("/{type}/{id}")
    public String findByTypeAndId(@PathVariable("type") String type, @PathVariable("id") String id, Map map) {
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
    @ResponseBody
    public Map<String, String> edit(Menu menu) {
        //System.out.println(menu);
        Map<String, String> map = new HashMap<>();
        if (menu.getId() == null || menu.getId().equalsIgnoreCase("")) {
            map.put("status", "1");
            return map;
        }
        //BeanUtils.copyProperties(menu, menuService.findByTypeAndId(menu.getId()));
        Menu byId = menuService.findById(menu.getId());
        byId.setParentId(menu.getParentId());
        byId.setEnName(menu.getEnName());
        byId.setIcon(menu.getIcon());
        byId.setName(menu.getName());
        byId.setUrl(menu.getUrl());
        byId.setOrdernum(menu.getOrdernum());
        byId.setStatus(menu.getStatus());

        //System.out.println(menuService.findByTypeAndId(menu.getId()));
        //System.out.println(menu);
        Menu count = menuService.update(menu);
        if (count != null) {
            map.put("status", "0");
        } else {
            map.put("status", "1");
        }
        return map;
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

    @DeleteMapping
    @ResponseBody
    public Map deleteMultipleById(@RequestBody List<String> ids) {
        ids.stream().forEach(id -> {
            System.out.println(id);
        });
        Map<String, String> map = new HashMap<>();
        if (ids.size() == 0) {
            map.put("status", "1");
            return map;
        }
        int count = menuService.deleteMultipleById(ids);

        if (count > 0) {
            map.put("status", "0");
        } else {
            map.put("status", "1");
        }
        return map;
    }
}
