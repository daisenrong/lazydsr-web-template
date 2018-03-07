package com.lazydsr.lazydsrwebtemplate.jdbc;

import com.lazydsr.lazydsrwebtemplate.entity.User;

import java.util.List;

/**
 * UserJdbc
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.jdbc
 * Created by Lazy on 2018/3/7 16:26
 * Version: 0.1
 * Info: @TODO:...
 */
public interface UserJdbc {
    public List<User> findbyNameJdbc(String name);
}
