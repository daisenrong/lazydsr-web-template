package com.lazydsr.lazydsrwebtemplate.service.impl;

import com.lazydsr.lazydsrwebtemplate.entity.UserLoginRecord;
import com.lazydsr.lazydsrwebtemplate.repository.UserLoginRecordRepository;
import com.lazydsr.lazydsrwebtemplate.service.UserLoginRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserLoginRecordServiceImpl
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.service.impl
 * Created by Lazy on 2018/3/19 0:52
 * Version: 0.1
 * Info: @TODO:...
 */
@Service
public class UserLoginRecordServiceImpl implements UserLoginRecordService {
    @Autowired
    private UserLoginRecordRepository userLoginRecordRepository;

    @Override
    public UserLoginRecord save(UserLoginRecord userLoginRecord) {
        return userLoginRecordRepository.save(userLoginRecord);
    }
}
