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
    public User save(User user);
    public User findByUsername(String username);

    //public List<User> findbyNameJdbc(String name);
    //
    //public List<User> findByNameLike(String name);
    //
    //public List<User> findByNameLikeCus(String username);
    //
    //public List<User> findByNameLikeCus1(String username);
    //
    //public List<User> findByNameLikeCus2(String username);
}
