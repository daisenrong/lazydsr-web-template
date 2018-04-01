package com.lazydsr.lazydsrwebtemplate.entity;

import com.lazydsr.util.id.UtilUUId;
import com.lazydsr.util.time.UtilDateTime;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "sys_monitorinfo")
@Data
public class MonitorInfo {
    @Id
    private String id = UtilUUId.getId();

    private String serverId;

    private Long totalMemory;

    private Long freeMemory;

    private Long maxMemory;

    private String osName;

    private Long totalMemorySize;

    private Long freePhysicalMemorySize;

    private Long usedMemory;

    private Integer totalThread = 0;

    private Double cpuRatio;

    private String creator;

    private String createDate = UtilDateTime.getCurrDateTime();

    private String modifier;

    private String modifyDate = UtilDateTime.getCurrDateTime();

    private Integer status = 0;


}