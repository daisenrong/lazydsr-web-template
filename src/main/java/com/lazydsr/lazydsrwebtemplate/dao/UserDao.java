package com.lazydsr.lazydsrwebtemplate.dao;

import com.lazydsr.lazydsrwebtemplate.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * UserJdbc
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.jdbc
 * Created by Lazy on 2018/3/7 16:26
 * Version: 0.1
 * Info: @TODO:...
 */

public interface UserDao {
    User add(User user);

    int delete(String id);

    User update(User user);

    User findById(String id);

    User findByUsername(String Username);


}
