package com.lazydsr.lazydsrwebtemplate.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public int delete(String id) {
        return menuMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Menu update(Menu menu) {
        int count = menuMapper.updateByPrimaryKey(menu);
        return menuMapper.selectByPrimaryKey(menu.getId());
    }

    @Override
    public Menu findById(String id) {
        return menuMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Menu> findAll() {
        return menuMapper.selectAll();
    }

    @Override
    public List<Menu> findAllNormal() {
        return menuMapper.selectAllNormal();
    }

    //@Override
    //public PageInfo<Menu> findAllNormal(int page, int size) {
    //    PageHelper.startPage(page, size);
    //    List<Menu> menus = menuMapper.selectAllNormal();
    //    PageInfo<Menu> pageInfo = new PageInfo<>(menus);
    //
    //    return pageInfo;
    //}

    @Override
    public List<Menu> findByUserId(String userId) {
        return null;
    }

    //@Override
    //public PageInfo<Menu> findAll(int page, int size) {
    //    PageHelper.startPage(page, size);
    //    List<Menu> menus = menuMapper.selectAll();
    //    PageInfo<Menu> pageInfo = new PageInfo<>(menus);
    //
    //    return pageInfo;
    //}


}
