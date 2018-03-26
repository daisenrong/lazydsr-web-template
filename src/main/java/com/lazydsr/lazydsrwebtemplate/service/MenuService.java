package com.lazydsr.lazydsrwebtemplate.service;

import com.lazydsr.lazydsrwebtemplate.entity.Menu;

import java.util.List;

/**
 * MenuService
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.service
 * Created by Lazy on 2018/3/19 15:58
 * Version: 0.1
 * Info: @TODO:...
 */
public interface MenuService {
    public Menu add(Menu menu);
    public List<Menu> findByUserId(String userId);
    public List<Menu> findAll(int page,int size);
    public List<Menu> findAll();
 }
