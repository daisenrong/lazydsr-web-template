package com.lazydsr.lazydsrwebtemplate.service.impl;

import com.lazydsr.lazydsrwebtemplate.entity.UserLoginRecord;
import com.lazydsr.lazydsrwebtemplate.mapper.UserLoginRecordMapper;
import com.lazydsr.lazydsrwebtemplate.service.UserLoginRecordService;
import com.lazydsr.util.id.UtilUUId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    private UserLoginRecordMapper userLoginRecordMapper;

    @Override
    public UserLoginRecord add(UserLoginRecord userLoginRecord) {
        //if (userLoginRecord.getId() == null || userLoginRecord.getId().equals(""))
        userLoginRecord.setId(UtilUUId.getId());
        userLoginRecordMapper.insert(userLoginRecord);
        return null;

    }

    @Override
    public List<UserLoginRecord> findAll() {
        return userLoginRecordMapper.selectAll();
    }

    @Override
    public List<UserLoginRecord> findByUserId(String userId) {
        List<UserLoginRecord> userLoginRecords = userLoginRecordMapper.selectByUserId(userId);
        return userLoginRecords;
    }
}
