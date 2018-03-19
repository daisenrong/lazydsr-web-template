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
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserDao userDao;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }


    //@Override
    //public List<User> findbyNameJdbc(String name) {
    //    return null;
    //}
    //
    //@Override
    //public List<User> findByNameLike(String name) {
    //    return null;
    //}
    //
    //@Override
    //public List<User> findByNameLikeCus(String username) {
    //    return null;
    //}
    //
    //@Override
    //public List<User> findByNameLikeCus1(String username) {
    //    return null;
    //}
    //
    //@Override
    //public List<User> findByNameLikeCus2(String username) {
    //    return null;
    //}
}
