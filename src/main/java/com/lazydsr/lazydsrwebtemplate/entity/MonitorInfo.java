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

@Data
public class MonitorInfo {

    private String id;
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



    /**
     * 状态
     * 0  启用
     * 1  禁用
     */
    private int status = STATICVALUE.ENABLE;
    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    private String createDate = UtilDateTime.getCurrDateTime();
    /**
     * 最后修改人
     */
    private String modifier;
    /**
     * 最后修改时间
     */

    private String modifyDate = UtilDateTime.getCurrDateTime();

}
