package com.lazydsr.lazydsrwebtemplate.dao.impl;

import com.lazydsr.lazydsrwebtemplate.entity.User;
import com.lazydsr.lazydsrwebtemplate.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * UserJdbcImpl
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.jdbc.impl
 * Created by Lazy on 2018/3/7 16:27
 * Version: 0.1
 * Info: @TODO:...
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

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
