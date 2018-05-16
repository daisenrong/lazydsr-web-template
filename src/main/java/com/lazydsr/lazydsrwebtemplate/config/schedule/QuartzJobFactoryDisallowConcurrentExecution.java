package com.lazydsr.lazydsrwebtemplate.config.schedule;

import com.lazydsr.lazydsrwebtemplate.entity.ScheduleJob;
import lombok.extern.slf4j.Slf4j;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;


/**
 * QuartzJobFactoryDisallowConcurrentExecution
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.config.schedule
 * Created by Lazy on 2018/5/16 14:39
 * Version: 0.1
 * Info: @TODO:...
 */
@DisallowConcurrentExecution
@Slf4j
public class QuartzJobFactoryDisallowConcurrentExecution implements Job {


    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        ScheduleJob scheduleJob = (ScheduleJob) context.getMergedJobDataMap().get("scheduleJob");
        ScheduleJobUtils.invokMethod(scheduleJob);

    }
}
