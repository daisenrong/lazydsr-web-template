package com.lazydsr.lazydsrwebtemplate.entity;

import com.lazydsr.util.id.UtilUUId;
import com.lazydsr.util.time.UtilDateTime;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ScheduleJob
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.entity
 * Created by Lazy on 2018/5/13 20:21
 * Version: 0.1
 * Info: 定时任务类
 */
@Table(name = "sys_scheduleJob")
@Data
public class ScheduleJob {

    public static final String STATUS_RUNNING = "1";
    public static final String STATUS_NOT_RUNNING = "0";
    public static final String CONCURRENT_IS = "1";
    public static final String CONCURRENT_NOT = "0";

    @Id
    private String id = UtilUUId.getId();

    private String name;

    private String jobgroup;

    private String classpath;

    private String method;

    private String concurrent;

    private String cron;

    private String description;

    private String jobstatus;




    private String creator;

    private String createDate = UtilDateTime.getCurrDateTime();

    private String modifier;

    private String modifyDate = UtilDateTime.getCurrDateTime();

    private Integer status = 0;
}
