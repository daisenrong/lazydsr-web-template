package com.lazydsr.lazydsrwebtemplate.service.impl;

import com.lazydsr.lazydsrwebtemplate.dao.UserDao;
import com.lazydsr.lazydsrwebtemplate.entity.User;
import com.lazydsr.lazydsrwebtemplate.mapper.UserMapper;
import com.lazydsr.lazydsrwebtemplate.service.UserService;
import com.lazydsr.util.id.UtilUUId;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
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
@Slf4j
@CacheConfig(cacheNames = "user")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserDao userDao;

    @Override
    public User add(User user) {
        if (user.getId() == null)
            user.setId(UtilUUId.getId());
        //return userMapper.add(user);
        int count = userMapper.insert(user);
        if (count > 0)
            return userMapper.selectByPrimaryKey(user.getId());
        return null;
    }

    @Override
    @Cacheable(key="#result.id",unless = "#result eq null ")
    public User findByUsername(String username) {
        return userMapper.selectByUsername(username);
    }

    @Override
    public int delete(String id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public User update(User user) {
        int count = userMapper.updateByPrimaryKey(user);
        if (count > 0)
            return userMapper.selectByPrimaryKey(user.getId());
        return null;
    }

    @Override
    public User findById(String id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> findAllNormal() {
        return userMapper.selectAllNormal();
    }

    @Override
    public List<User> findAll() {
        return userMapper.selectAll();
    }


}
