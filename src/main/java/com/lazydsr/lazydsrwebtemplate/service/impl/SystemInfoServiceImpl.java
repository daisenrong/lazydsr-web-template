package com.lazydsr.lazydsrwebtemplate.service.impl;

import com.lazydsr.lazydsrwebtemplate.entity.SystemInfo;
import com.lazydsr.lazydsrwebtemplate.repository.SystemInfoRepository;
import com.lazydsr.lazydsrwebtemplate.service.SystemInfoService;
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
    private SystemInfoRepository systemInfoRepository;

    @Override
    public SystemInfo save(SystemInfo systemInfo) {
        return systemInfoRepository.save(systemInfo);

    }
}
