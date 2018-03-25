package com.lazydsr.lazydsrwebtemplate.service.impl;

import com.lazydsr.lazydsrwebtemplate.dao.UserDao;
import com.lazydsr.lazydsrwebtemplate.entity.User;
import com.lazydsr.lazydsrwebtemplate.repository.UserRepository;
import com.lazydsr.lazydsrwebtemplate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public User add(User user) {
        return null;
    }

    @Override
    public int delete(String id) {
        return 0;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User findById(String id) {
        return null;
    }

    @Override
    public User findByUsername(String Username) {
        return null;
    }
}
