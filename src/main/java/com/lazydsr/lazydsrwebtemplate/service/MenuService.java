package com.lazydsr.lazydsrwebtemplate.service;

import com.lazydsr.lazydsrwebtemplate.entity.DataSourceInfo;
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

    int delete(String id);

    Menu update(Menu menu);

    Menu findById(String id);

    List<Menu> findAll();

    List<Menu> findAllNormal();

    List<Menu> findAllNormal(int page, int size);

    public List<Menu> findByUserId(String userId);

    public List<Menu> findAll(int page, int size);

}
