package com.lazydsr.lazydsrwebtemplate.service;

import com.lazydsr.lazydsrwebtemplate.entity.ScheduleTask;

import java.util.List;

/**
 * MenuService
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.service
 * Created by Lazy on 2018/3/19 15:58
 * Version: 0.1
 * Info: @TODO:...
 */
public interface ScheduleTaskService {

    ScheduleTask add(ScheduleTask scheduleTask);

    int delete(String id);

    ScheduleTask update(ScheduleTask scheduleTask);

    ScheduleTask findById(String id);

    //List<ScheduleTask> findByUserId(String userId);

    List<ScheduleTask> findAllNormal();

    List<ScheduleTask> findAll();

    int deleteMultipleById(List<String> ids);
}
