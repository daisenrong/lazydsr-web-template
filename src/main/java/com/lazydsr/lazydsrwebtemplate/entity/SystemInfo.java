package com.lazydsr.lazydsrwebtemplate.entity;

import com.lazydsr.util.id.UtilUUId;
import com.lazydsr.util.time.UtilDateTime;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "sys_systeminfo")
@Data
public class SystemInfo implements Serializable {
    @Id
    private String id = UtilUUId.getId();

    private String username;

    private String serverName;

    private String domain;

    private String netName;

    private String ip;

    private String mac;

    private String host;

    private String osArch;

    private String osName;

    private String osVersion;

    private String cpuMhz;

    private String cpuVendor;

    private String cpuModel;

    private String cpuCacheSize;

    private Double memTotal;

    private Double jvmXmx;

    private Double jvmXms;

    private Double jvmXmn;

    private Integer jvmAvailableProcessors;

    private String jvmVersion;

    private String jvmHome;

    private String jvmAppHome;

    private String jvmClassVersion;

    private String creator;

    private String createDate = UtilDateTime.getCurrDateTime();

    private String modifier;

    private String modifyDate = UtilDateTime.getCurrDateTime();

    private Integer status = 0;


}