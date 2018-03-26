package com.lazydsr.lazydsrwebtemplate.service.impl;

import com.lazydsr.lazydsrwebtemplate.entity.SystemInfo;
import com.lazydsr.lazydsrwebtemplate.mapper.SystemInfoMapper;
import com.lazydsr.lazydsrwebtemplate.service.SystemInfoService;
import com.lazydsr.util.id.UtilUUId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * SystemInfoServiceImpl
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.service.impl
 * Created by Lazy on 2018/3/15 0:06
 * Version: 0.1
 * Info: @TODO:...
 */
@Service
public class SystemInfoServiceImpl implements SystemInfoService {
    @Autowired
    private SystemInfoMapper systemInfoMapper;

    @Override
    public SystemInfo add(SystemInfo systemInfo) {
        if (systemInfo.getId() == null || systemInfo.getId().equals(""))
            systemInfo.setId(UtilUUId.getId());
        int count = systemInfoMapper.insert(systemInfo);
        return systemInfoMapper.selectByPrimaryKey(systemInfo.getId());

    }

    @Override
    public SystemInfo findByMaxCreateDate() {
        //return systemInfoMapper.findTopByOrderByCreateDateDesc();
        return systemInfoMapper.selectByMaxCreateDate();
    }


}
