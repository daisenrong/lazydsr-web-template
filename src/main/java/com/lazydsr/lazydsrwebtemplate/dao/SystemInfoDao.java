package com.lazydsr.lazydsrwebtemplate.dao;

import com.lazydsr.lazydsrwebtemplate.entity.SystemInfo;

/**
 * SystemInfo
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.dao
 * Created by Lazy on 2018/3/25 0:01
 * Version: 0.1
 * Info: @TODO:...
 */
public interface SystemInfoDao {
    SystemInfo add(SystemInfo systemInfo);

    int delete(String id);

    SystemInfo update(SystemInfo systemInfo);

    SystemInfo findById(String id);

    SystemInfo findLastRecord();
}
