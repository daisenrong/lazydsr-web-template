package com.lazydsr.lazydsrwebtemplate.service.impl;

import com.lazydsr.lazydsrwebtemplate.entity.ScheduleJob;
import com.lazydsr.lazydsrwebtemplate.mapper.ScheduleJobMapper;
import com.lazydsr.lazydsrwebtemplate.service.ScheduleJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ScheduleJobServiceImpl
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.service.impl
 * Created by Lazy on 2018/5/13 21:23
 * Version: 0.1
 * Info: 调度任务services impl
 */
@Service
public class ScheduleJobServiceImpl implements ScheduleJobService {
    @Autowired
    private ScheduleJobMapper scheduleJobMapper;

    @Override
    public ScheduleJob add(ScheduleJob scheduleJob) {
        int insert = scheduleJobMapper.insert(scheduleJob);
        return scheduleJobMapper.selectByPrimaryKey(scheduleJob.getId());
    }

    @Override
    public int delete(String id) {
        return 0;
    }

    @Override
    public ScheduleJob update(ScheduleJob scheduleJob) {
        return null;
    }

    @Override
    public ScheduleJob findById(String id) {
        return null;
    }

    @Override
    public List<ScheduleJob> findAllNormal() {
        return null;
    }

    @Override
    public List<ScheduleJob> findAll() {
        return scheduleJobMapper.selectAll();
    }

    @Override
    public int deleteMultipleById(List<String> ids) {
        return 0;
    }
}
