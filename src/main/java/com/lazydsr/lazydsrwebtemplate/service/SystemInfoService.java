package com.lazydsr.lazydsrwebtemplate.service;

import com.lazydsr.lazydsrwebtemplate.entity.SystemInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * SystemInfoRepository
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.repository
 * Created by Lazy on 2018/3/15 0:04
 * Version: 0.1
 * Info: @TODO:...
 */
public interface SystemInfoService {
    public SystemInfo save(SystemInfo systemInfo);
}