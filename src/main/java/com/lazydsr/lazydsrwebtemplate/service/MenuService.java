package com.lazydsr.lazydsrwebtemplate.service;

import com.lazydsr.lazydsrwebtemplate.entity.Menu;
import org.springframework.data.domain.Page;

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
    public Menu save(Menu menu);
    public List<Menu> findByUserIdAndStatus();
    public Page<Menu> findAll(int page,int size);
 }
