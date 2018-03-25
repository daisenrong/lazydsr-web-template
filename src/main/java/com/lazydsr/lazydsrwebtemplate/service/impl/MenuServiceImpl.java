package com.lazydsr.lazydsrwebtemplate.service.impl;

import com.lazydsr.lazydsrwebtemplate.base.STATICVALUE;
import com.lazydsr.lazydsrwebtemplate.entity.Menu;
import com.lazydsr.lazydsrwebtemplate.repository.MenuRepository;
import com.lazydsr.lazydsrwebtemplate.service.MenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.querydsl.QPageRequest;
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


    @Override
    public Menu add(Menu menu) {
        return null;
    }

    @Override
    public int delete(String id) {
        return 0;
    }

    @Override
    public Menu update(Menu menu) {
        return null;
    }

    @Override
    public Menu findById(String id) {
        return null;
    }

    @Override
    public List<Menu> findAll() {
        return null;
    }

    @Override
    public List<Menu> findPage(int page, int limit) {
        return null;
    }
}
