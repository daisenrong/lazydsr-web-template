package com.lazydsr.lazydsrwebtemplate.service;

import com.lazydsr.lazydsrwebtemplate.entity.User;

import java.util.List;

/**
 * UserService
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.service
 * Created by Lazy on 2018/3/7 23:28
 * Version: 0.1
 * Info: @TODO:...
 */
public interface UserService {
    User add(User user);

    int delete(String id);

    User update(User user);

    User findById(String id);

    User findByUsername(String Username);
}
