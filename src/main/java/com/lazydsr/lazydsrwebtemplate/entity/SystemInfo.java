package com.lazydsr.lazydsrwebtemplate.entity;

import com.lazydsr.lazydsrwebtemplate.base.STATICVALUE;
import com.lazydsr.util.time.UtilDateTime;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Blob;
import java.sql.Clob;

/**
 * SystemInfo
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.entity
 * Created by Lazy on 2018/3/14 22:16
 * Version: 0.1
 * Info: @TODO:...
 */
@Entity
@Table(name = "sysSysteminfo")
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

    //net
    @Column(name = "netname")
    private String netName;
    private String ip;
    @Column(length = 1000)
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
    @Column(name = "cpumodel", length = 1000)
    private String cpuModel;
    @Column(name = "cpucachesize")
    private String cpuCacheSize;

    //mem
    @Column(name = "memtotal")
    private double memTotal;


    //jvm
    //-Xms:初始堆大小
    //-Xmx：最大堆大小
    //-Xmn：年轻代大小
    //-XX:NewSize=n:设置年轻代大小
    //-XX:NewRatio=n:设置年轻代和年老代的比值。如：为3表示年轻代和年老代比值为1：3，年轻代占整个年轻代年老代和的1/4
    //-XX:SurvivorRatio=n:年轻代中Eden区与两个Survivor区的比值。注意Survivor区有两个。如3表示Eden： 3 Survivor：2，一个Survivor区占整个年轻代的1/5
    //-XX:MaxPermSize=n:设置持久代大小


    //jvm最大堆内存
    @Column(name = "jvmxmx")
    private double jvmXmx;
    //jvm初始堆内存
    @Column(name = "jvmxms")
    private double jvmXms;
    //jvm年轻代大小
    @Column(name = "jvmxmn")
    private double jvmXmn;
    @Column(name = "jvmavailableprocessors")
    private int jvmAvailableProcessors;
    @Column(name = "jvmversion")
    private String jvmVersion;
    @Column(name = "jvmhome")
    private String jvmHome;
    @Column(name = "jvmapphome")
    private String jvmAppHome;
    @Column(name = "jvmclassversion")
    private String jvmClassVersion;


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
    @Column(length = 19)
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
    @Column(length = 19)
    private String modifyDate = UtilDateTime.getCurrDateTime();
    /**
     * 数据状态
     * 0 为正常
     * 1 为删除
     */
    @Column(name = "dataStatus")
    private int dataStatus = STATICVALUE.ENABLE;

}
