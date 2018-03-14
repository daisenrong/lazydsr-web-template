package com.lazydsr.lazydsrwebtemplate.entity;

import com.lazydsr.lazydsrwebtemplate.base.STATICVALUE;
import com.lazydsr.util.time.UtilDateTime;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * SystemInfo
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.entity
 * Created by Lazy on 2018/3/14 22:07
 * Version: 0.1
 * Info: @TODO:...
 */
@Entity
@Data
@Table(name = "monitorinfo")
public class MonitorInfo {
    @Id
    @GenericGenerator(name = "Custom_UUID", strategy = "com.lazydsr.commons.util.CustomIdentifierGenerator")
    @GeneratedValue(generator = "Custom_UUID")
    @Column(length = 32)
    private String id;
    @Column(name = "serverid")
    private String serverId;
    /**
     * 可使用内存.
     */
    private long totalMemory;

    /**
     * 剩余内存.
     */
    private long freeMemory;

    /**
     * 最大可使用内存.
     */
    private long maxMemory;

    /**
     * 操作系统.
     */
    private String osName;

    /**
     * 总的物理内存.
     */
    private long totalMemorySize;

    /**
     * 剩余的物理内存.
     */
    private long freePhysicalMemorySize;

    /**
     * 已使用的物理内存.
     */
    private long usedMemory;

    /**
     * 线程总数.
     */
    private int totalThread;

    /**
     * cpu使用率.
     */
    private double cpuRatio;






    private int status = STATICVALUE.ENABLE;


    private String creator;
    private String createDate = UtilDateTime.getCurrDateTime();
    private String modifier;
    private String modifyDate = UtilDateTime.getCurrDateTime();
    private int dataStatus = STATICVALUE.ENABLE;
}
