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
 * Created by Lazy on 2018/3/14 22:16
 * Version: 0.1
 * Info: @TODO:...
 */
@Entity
@Table(name = "systeminfo")
@Data
public class SystemInfo {
    @Id
    @GenericGenerator(name = "Custom_UUID", strategy = "com.lazydsr.commons.util.CustomIdentifierGenerator")
    @GeneratedValue(generator = "Custom_UUID")
    @Column(length = 32)
    private String id;
    @Column(name = "username")
    private String userName;
    @Column(name = "servername")
    private String serverName;
    private String domain;
    private String ip;
    private String mac;
    private String host;

    //os
    @Column(name = "osarch")
    private String osArch;
    @Column(name = "osname")
    private String osName;
    @Column(name = "osversion")
    private String osVersion;

    //cpu
    @Column(name = "cpumhz")
    private String cpuMhz;
    @Column(name = "cpuvendor")
    private String cpuVendor;
    @Column(name = "cpumodel")
    private String cpuModel;

    //jvm
    @Column(name = "jvmtotalmemory")
    private double jvmTotalMemory;
    @Column(name = "jvmreememory")
    private double jvmFreeMemory;
    @Column(name = "jvmavailableprocessors")
    private int jvmAvailableProcessors;
    @Column(name = "jvmversion")
    private String jvmVersion;
    @Column(name = "jvmhome")
    private String jvmHome;
    @Column(name = "jvmclassversion")
    private String jvmClassVersion;



    private int status = STATICVALUE.ENABLE;


    private String creator;
    private String createDate = UtilDateTime.getCurrDateTime();
    private String modifier;
    private String modifyDate = UtilDateTime.getCurrDateTime();
    private int dataStatus = STATICVALUE.ENABLE;
}
