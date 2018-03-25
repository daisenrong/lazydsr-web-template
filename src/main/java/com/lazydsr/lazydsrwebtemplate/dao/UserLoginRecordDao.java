package com.lazydsr.lazydsrwebtemplate.dao;

import com.lazydsr.lazydsrwebtemplate.entity.UserLoginRecord;

/**
 * UserLoginRecord
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.dao
 * Created by Lazy on 2018/3/24 23:57
 * Version: 0.1
 * Info: @TODO:...
 */
public interface UserLoginRecordDao {
    UserLoginRecord add(UserLoginRecord userLoginRecord);

    int delete(String id);

    UserLoginRecord update(UserLoginRecord userLoginRecord);

    UserLoginRecord findById(String id);
}
