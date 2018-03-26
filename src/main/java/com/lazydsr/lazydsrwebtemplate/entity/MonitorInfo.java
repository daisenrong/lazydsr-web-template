package com.lazydsr.lazydsrwebtemplate.entity;

import com.lazydsr.util.time.UtilDateTime;

public class MonitorInfo {
    private String id;

    private String serverId;

    private Long totalMemory=0L;

    private Long freeMemory=0L;

    private Long maxMemory=0L;

    private String osName;

    private Long totalMemorySize=0L;

    private Long freePhysicalMemorySize=0L;

    private Long usedMemory=0L;

    private Integer totalThread=0;

    private Double cpuRatio=0.0;

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

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId == null ? null : serverId.trim();
    }

    public Long getTotalMemory() {
        return totalMemory;
    }

    public void setTotalMemory(Long totalMemory) {
        this.totalMemory = totalMemory;
    }

    public Long getFreeMemory() {
        return freeMemory;
    }

    public void setFreeMemory(Long freeMemory) {
        this.freeMemory = freeMemory;
    }

    public Long getMaxMemory() {
        return maxMemory;
    }

    public void setMaxMemory(Long maxMemory) {
        this.maxMemory = maxMemory;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName == null ? null : osName.trim();
    }

    public Long getTotalMemorySize() {
        return totalMemorySize;
    }

    public void setTotalMemorySize(Long totalMemorySize) {
        this.totalMemorySize = totalMemorySize;
    }

    public Long getFreePhysicalMemorySize() {
        return freePhysicalMemorySize;
    }

    public void setFreePhysicalMemorySize(Long freePhysicalMemorySize) {
        this.freePhysicalMemorySize = freePhysicalMemorySize;
    }

    public Long getUsedMemory() {
        return usedMemory;
    }

    public void setUsedMemory(Long usedMemory) {
        this.usedMemory = usedMemory;
    }

    public Integer getTotalThread() {
        return totalThread;
    }

    public void setTotalThread(Integer totalThread) {
        this.totalThread = totalThread;
    }

    public Double getCpuRatio() {
        return cpuRatio;
    }

    public void setCpuRatio(Double cpuRatio) {
        this.cpuRatio = cpuRatio;
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