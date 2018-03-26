package com.lazydsr.lazydsrwebtemplate.mapper;

import com.lazydsr.lazydsrwebtemplate.entity.MonitorInfo;
import org.apache.ibatis.jdbc.SQL;

public class MonitorInfoSqlProvider {

    public String insertSelective(MonitorInfo record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sys_monitorinfo");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getServerId() != null) {
            sql.VALUES("server_id", "#{serverId,jdbcType=VARCHAR}");
        }
        
        if (record.getTotalMemory() != null) {
            sql.VALUES("total_memory", "#{totalMemory,jdbcType=BIGINT}");
        }
        
        if (record.getFreeMemory() != null) {
            sql.VALUES("free_memory", "#{freeMemory,jdbcType=BIGINT}");
        }
        
        if (record.getMaxMemory() != null) {
            sql.VALUES("max_memory", "#{maxMemory,jdbcType=BIGINT}");
        }
        
        if (record.getOsName() != null) {
            sql.VALUES("os_name", "#{osName,jdbcType=VARCHAR}");
        }
        
        if (record.getTotalMemorySize() != null) {
            sql.VALUES("total_memory_size", "#{totalMemorySize,jdbcType=BIGINT}");
        }
        
        if (record.getFreePhysicalMemorySize() != null) {
            sql.VALUES("free_physical_memory_size", "#{freePhysicalMemorySize,jdbcType=BIGINT}");
        }
        
        if (record.getUsedMemory() != null) {
            sql.VALUES("used_memory", "#{usedMemory,jdbcType=BIGINT}");
        }
        
        if (record.getTotalThread() != null) {
            sql.VALUES("total_thread", "#{totalThread,jdbcType=INTEGER}");
        }
        
        if (record.getCpuRatio() != null) {
            sql.VALUES("cpu_ratio", "#{cpuRatio,jdbcType=DOUBLE}");
        }
        
        if (record.getCreator() != null) {
            sql.VALUES("creator", "#{creator,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateDate() != null) {
            sql.VALUES("create_date", "#{createDate,jdbcType=VARCHAR}");
        }
        
        if (record.getModifier() != null) {
            sql.VALUES("modifier", "#{modifier,jdbcType=VARCHAR}");
        }
        
        if (record.getModifyDate() != null) {
            sql.VALUES("modify_date", "#{modifyDate,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(MonitorInfo record) {
        SQL sql = new SQL();
        sql.UPDATE("sys_monitorinfo");
        
        if (record.getServerId() != null) {
            sql.SET("server_id = #{serverId,jdbcType=VARCHAR}");
        }
        
        if (record.getTotalMemory() != null) {
            sql.SET("total_memory = #{totalMemory,jdbcType=BIGINT}");
        }
        
        if (record.getFreeMemory() != null) {
            sql.SET("free_memory = #{freeMemory,jdbcType=BIGINT}");
        }
        
        if (record.getMaxMemory() != null) {
            sql.SET("max_memory = #{maxMemory,jdbcType=BIGINT}");
        }
        
        if (record.getOsName() != null) {
            sql.SET("os_name = #{osName,jdbcType=VARCHAR}");
        }
        
        if (record.getTotalMemorySize() != null) {
            sql.SET("total_memory_size = #{totalMemorySize,jdbcType=BIGINT}");
        }
        
        if (record.getFreePhysicalMemorySize() != null) {
            sql.SET("free_physical_memory_size = #{freePhysicalMemorySize,jdbcType=BIGINT}");
        }
        
        if (record.getUsedMemory() != null) {
            sql.SET("used_memory = #{usedMemory,jdbcType=BIGINT}");
        }
        
        if (record.getTotalThread() != null) {
            sql.SET("total_thread = #{totalThread,jdbcType=INTEGER}");
        }
        
        if (record.getCpuRatio() != null) {
            sql.SET("cpu_ratio = #{cpuRatio,jdbcType=DOUBLE}");
        }
        
        if (record.getCreator() != null) {
            sql.SET("creator = #{creator,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateDate() != null) {
            sql.SET("create_date = #{createDate,jdbcType=VARCHAR}");
        }
        
        if (record.getModifier() != null) {
            sql.SET("modifier = #{modifier,jdbcType=VARCHAR}");
        }
        
        if (record.getModifyDate() != null) {
            sql.SET("modify_date = #{modifyDate,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return sql.toString();
    }
}