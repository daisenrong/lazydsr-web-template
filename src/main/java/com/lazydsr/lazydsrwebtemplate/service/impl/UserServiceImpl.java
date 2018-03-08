package com.lazydsr.lazydsrwebtemplate.service.impl;

import com.lazydsr.lazydsrwebtemplate.entity.User;
import com.lazydsr.lazydsrwebtemplate.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserServiceImpl
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.service.impl
 * Created by Lazy on 2018/3/7 23:30
 * Version: 0.1
 * Info: @TODO:...
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> findbyNameJdbc(String name) {
        return null;
    }

    @Override
    public List<User> findByNameLike(String name) {
        return null;
    }

    @Override
    public List<User> findByNameLikeCus(String username) {
        return null;
    }

    @Override
    public List<User> findByNameLikeCus1(String username) {
        return null;
    }

    @Override
    public List<User> findByNameLikeCus2(String username) {
        return null;
    }
}
