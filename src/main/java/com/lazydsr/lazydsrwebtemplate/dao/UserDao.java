package com.lazydsr.lazydsrwebtemplate.dao;

import com.lazydsr.lazydsrwebtemplate.entity.User;
import com.lazydsr.lazydsrwebtemplate.repository.UserRepository;

import java.util.List;

/**
 * UserDao
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.dao
 * Created by Lazy on 2018/3/6 22:32
 * Version: 0.1
 * Info: @TODO:...
 */
public interface UserDao extends UserRepository {
    public List<User> find
}
