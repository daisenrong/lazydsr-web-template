package com.lazydsr.lazydsrwebtemplate.entity;

import com.lazydsr.util.id.UtilUUId;
import com.lazydsr.util.time.UtilDateTime;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ScheduleTask
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.entity
 * Created by Lazy on 2018/5/13 20:21
 * Version: 0.1
 * Info: 定时任务类
 */
@Table(name = "sys_scheduleTask")
@Data
public class ScheduleTask {
    @Id
    private String id = UtilUUId.getId();

    private String name;

    private String classpath;

    private String cron;

    private String description;

    private String creator;

    private String createDate = UtilDateTime.getCurrDateTime();

    private String modifier;

    private String modifyDate = UtilDateTime.getCurrDateTime();

    private Integer status = 0;
}
