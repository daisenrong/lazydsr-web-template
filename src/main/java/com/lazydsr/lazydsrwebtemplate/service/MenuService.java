package com.lazydsr.lazydsrwebtemplate.service;

import com.github.pagehelper.PageInfo;
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

    Menu add(Menu menu);

    int delete(String id);

    Menu update(Menu menu);

    Menu findById(String id);

    List<Menu> findByUserId(String userId);

    List<Menu> findAllNormal();

    List<Menu> findAll();

    int deleteMultipleById(List<String> ids);
}
