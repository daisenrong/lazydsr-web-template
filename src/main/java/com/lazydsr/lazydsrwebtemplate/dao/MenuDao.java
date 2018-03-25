package com.lazydsr.lazydsrwebtemplate.dao;

import com.lazydsr.lazydsrwebtemplate.entity.Menu;
import com.lazydsr.lazydsrwebtemplate.entity.User;

import java.util.List;

/**
 * MenuDao
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.dao
 * Created by Lazy on 2018/3/25 0:06
 * Version: 0.1
 * Info: @TODO:...
 */
public interface MenuDao {
    Menu add(Menu menu);

    int delete(String id);

    Menu update(Menu menu);

    Menu findById(String id);

    List<Menu> findAll();

    List<Menu> findPage(int page, int limit);
}
