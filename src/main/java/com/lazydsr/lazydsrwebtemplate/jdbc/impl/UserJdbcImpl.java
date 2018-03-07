package com.lazydsr.lazydsrwebtemplate.jdbc.impl;

import com.lazydsr.lazydsrwebtemplate.entity.User;
import com.lazydsr.lazydsrwebtemplate.jdbc.UserJdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * UserJdbcImpl
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.jdbc.impl
 * Created by Lazy on 2018/3/7 16:27
 * Version: 0.1
 * Info: @TODO:...
 */
public class UserJdbcImpl implements UserJdbc {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<User> findbyNameJdbc(String name) {
        List<User> list = jdbcTemplate.query("", new BeanPropertyRowMapper<User>());
        return list;
    }
}
