package com.lazydsr.lazydsrwebtemplate.service.impl;

import com.lazydsr.lazydsrwebtemplate.entity.ScheduleTask;
import com.lazydsr.lazydsrwebtemplate.mapper.ScheduleTaskMapper;
import com.lazydsr.lazydsrwebtemplate.service.ScheduleTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ScheduleTaskServiceImpl
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.service.impl
 * Created by Lazy on 2018/5/13 21:23
 * Version: 0.1
 * Info: 调度任务services impl
 */
@Service
public class ScheduleTaskServiceImpl implements ScheduleTaskService {
    @Autowired
    private ScheduleTaskMapper scheduleTaskMapper;

    @Override
    public ScheduleTask add(ScheduleTask scheduleTask) {
        int insert = scheduleTaskMapper.insert(scheduleTask);
        return scheduleTaskMapper.selectByPrimaryKey(scheduleTask.getId());
    }

    @Override
    public int delete(String id) {
        return 0;
    }

    @Override
    public ScheduleTask update(ScheduleTask scheduleTask) {
        return null;
    }

    @Override
    public ScheduleTask findById(String id) {
        return null;
    }

    @Override
    public List<ScheduleTask> findAllNormal() {
        return null;
    }

    @Override
    public List<ScheduleTask> findAll() {
        return null;
    }

    @Override
    public int deleteMultipleById(List<String> ids) {
        return 0;
    }
}
