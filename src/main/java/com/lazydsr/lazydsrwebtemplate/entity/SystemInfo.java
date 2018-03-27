package com.lazydsr.lazydsrwebtemplate.entity;

import com.lazydsr.util.time.UtilDateTime;

public class SystemInfo {
    private String id;

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

    private Double memTotal=0.0;

    private Double jvmXmx=0.0;

    private Double jvmXms=0.0;

    private Double jvmXmn=0.0;

    private Integer jvmAvailableProcessors =0;

    private String jvmVersion;

    private String jvmHome;

    private String jvmAppHome;

    private String jvmClassVersion;

    private String creator;

    private String createDate= UtilDateTime.getCurrDateTime();

    private String modifier;

    private String modifyDate=UtilDateTime.getCurrDateTime();

    private Integer status=0;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName == null ? null : serverName.trim();
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }

    public String getNetName() {
        return netName;
    }

    public void setNetName(String netName) {
        this.netName = netName == null ? null : netName.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac == null ? null : mac.trim();
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    public String getOsArch() {
        return osArch;
    }

    public void setOsArch(String osArch) {
        this.osArch = osArch == null ? null : osArch.trim();
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName == null ? null : osName.trim();
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion == null ? null : osVersion.trim();
    }

    public String getCpuMhz() {
        return cpuMhz;
    }

    public void setCpuMhz(String cpuMhz) {
        this.cpuMhz = cpuMhz == null ? null : cpuMhz.trim();
    }

    public String getCpuVendor() {
        return cpuVendor;
    }

    public void setCpuVendor(String cpuVendor) {
        this.cpuVendor = cpuVendor == null ? null : cpuVendor.trim();
    }

    public String getCpuModel() {
        return cpuModel;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel == null ? null : cpuModel.trim();
    }

    public String getCpuCacheSize() {
        return cpuCacheSize;
    }

    public void setCpuCacheSize(String cpuCacheSize) {
        this.cpuCacheSize = cpuCacheSize == null ? null : cpuCacheSize.trim();
    }

    public Double getMemTotal() {
        return memTotal;
    }

    public void setMemTotal(Double memTotal) {
        this.memTotal = memTotal;
    }

    public Double getJvmXmx() {
        return jvmXmx;
    }

    public void setJvmXmx(Double jvmXmx) {
        this.jvmXmx = jvmXmx;
    }

    public Double getJvmXms() {
        return jvmXms;
    }

    public void setJvmXms(Double jvmXms) {
        this.jvmXms = jvmXms;
    }

    public Double getJvmXmn() {
        return jvmXmn;
    }

    public void setJvmXmn(Double jvmXmn) {
        this.jvmXmn = jvmXmn;
    }

    public Integer getJvmAvailableProcessors() {
        return jvmAvailableProcessors;
    }

    public void setJvmAvailableProcessors(Integer jvmAvailableProcessors) {
        this.jvmAvailableProcessors = jvmAvailableProcessors;
    }

    public String getJvmVersion() {
        return jvmVersion;
    }

    public void setJvmVersion(String jvmVersion) {
        this.jvmVersion = jvmVersion == null ? null : jvmVersion.trim();
    }

    public String getJvmHome() {
        return jvmHome;
    }

    public void setJvmHome(String jvmHome) {
        this.jvmHome = jvmHome == null ? null : jvmHome.trim();
    }

    public String getJvmAppHome() {
        return jvmAppHome;
    }

    public void setJvmAppHome(String jvmAppHome) {
        this.jvmAppHome = jvmAppHome == null ? null : jvmAppHome.trim();
    }

    public String getJvmClassVersion() {
        return jvmClassVersion;
    }

    public void setJvmClassVersion(String jvmClassVersion) {
        this.jvmClassVersion = jvmClassVersion == null ? null : jvmClassVersion.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate == null ? null : modifyDate.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}