package com.lazydsr.lazydsrwebtemplate.repository;

import com.lazydsr.lazydsrwebtemplate.entity.Menu;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * MenuRepository
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.repository
 * Created by Lazy on 2018/3/19 15:57
 * Version: 0.1
 * Info: @TODO:...
 */
public interface MenuRepository extends JpaRepository<Menu, String> {
    public List<Menu> findByStatus(int status);
    //public int
}
