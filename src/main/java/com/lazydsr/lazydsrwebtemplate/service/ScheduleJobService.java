package com.lazydsr.lazydsrwebtemplate.service;

import com.lazydsr.lazydsrwebtemplate.entity.ScheduleJob;

import java.util.List;

/**
 * MenuService
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.service
 * Created by Lazy on 2018/3/19 15:58
 * Version: 0.1
 * Info: @TODO:...
 */
public interface ScheduleJobService {

    ScheduleJob add(ScheduleJob scheduleJob);

    int delete(String id);

    ScheduleJob update(ScheduleJob scheduleJob);

    ScheduleJob findById(String id);

    //List<ScheduleJob> findByUserId(String userId);

    List<ScheduleJob> findAllNormal();

    List<ScheduleJob> findAll();

    int deleteMultipleById(List<String> ids);
}
