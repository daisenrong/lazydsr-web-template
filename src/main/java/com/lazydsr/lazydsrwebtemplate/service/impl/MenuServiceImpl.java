package com.lazydsr.lazydsrwebtemplate.service.impl;

import com.lazydsr.lazydsrwebtemplate.entity.Menu;
import com.lazydsr.lazydsrwebtemplate.mapper.MenuMapper;
import com.lazydsr.lazydsrwebtemplate.service.MenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * MenuServiceImpl
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.service.impl
 * Created by Lazy on 2018/3/19 16:02
 * Version: 0.1
 * Info: @TODO:...
 */
@Service
@Slf4j
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapper menuMapper;

    @Override
    public Menu add(Menu menu) {
        int count = menuMapper.insert(menu);
        return menuMapper.selectByPrimaryKey(menu.getId());

    }

    @Override
    public List<Menu> findByUserId(String userId) {
        return findAll();
    }

    @Override
    public List<Menu> findAll(int page, int size) {
        return null;
    }

    @Override
    public List<Menu> findAll() {
        return menuMapper.selectAllNormal();
    }
}
