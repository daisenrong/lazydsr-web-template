package com.lazydsr.lazydsrwebtemplate.mapper;

import com.lazydsr.lazydsrwebtemplate.entity.SystemInfo;
import org.apache.ibatis.jdbc.SQL;

public class SystemInfoSqlProvider {

    public String insertSelective(SystemInfo record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sys_systeminfo");

        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }

        if (record.getUsername() != null) {
            sql.VALUES("username", "#{username,jdbcType=VARCHAR}");
        }

        if (record.getServerName() != null) {
            sql.VALUES("server_name", "#{serverName,jdbcType=VARCHAR}");
        }

        if (record.getDomain() != null) {
            sql.VALUES("domain", "#{domain,jdbcType=VARCHAR}");
        }

        if (record.getNetName() != null) {
            sql.VALUES("net_name", "#{netName,jdbcType=VARCHAR}");
        }

        if (record.getIp() != null) {
            sql.VALUES("ip", "#{ip,jdbcType=VARCHAR}");
        }

        if (record.getMac() != null) {
            sql.VALUES("mac", "#{mac,jdbcType=VARCHAR}");
        }

        if (record.getHost() != null) {
            sql.VALUES("host", "#{host,jdbcType=VARCHAR}");
        }

        if (record.getOsArch() != null) {
            sql.VALUES("os_arch", "#{osArch,jdbcType=VARCHAR}");
        }

        if (record.getOsName() != null) {
            sql.VALUES("os_name", "#{osName,jdbcType=VARCHAR}");
        }

        if (record.getOsVersion() != null) {
            sql.VALUES("os_version", "#{osVersion,jdbcType=VARCHAR}");
        }

        if (record.getCpuMhz() != null) {
            sql.VALUES("cpu_mhz", "#{cpuMhz,jdbcType=VARCHAR}");
        }

        if (record.getCpuVendor() != null) {
            sql.VALUES("cpu_vendor", "#{cpuVendor,jdbcType=VARCHAR}");
        }

        if (record.getCpuModel() != null) {
            sql.VALUES("cpu_model", "#{cpuModel,jdbcType=VARCHAR}");
        }

        if (record.getCpuCacheSize() != null) {
            sql.VALUES("cpu_cachesize", "#{cpuCachesize,jdbcType=VARCHAR}");
        }

        if (record.getMemTotal() != null) {
            sql.VALUES("mem_total", "#{memTotal,jdbcType=DOUBLE}");
        }

        if (record.getJvmXmx() != null) {
            sql.VALUES("jvm_xmx", "#{jvmXmx,jdbcType=DOUBLE}");
        }

        if (record.getJvmXms() != null) {
            sql.VALUES("jvm_xms", "#{jvmXms,jdbcType=DOUBLE}");
        }

        if (record.getJvmXmn() != null) {
            sql.VALUES("jvm_xmn", "#{jvmXmn,jdbcType=DOUBLE}");
        }

        if (record.getJvmAvailableProcessors() != null) {
            sql.VALUES("jvm_availableprocessors", "#{jvmAvailableprocessors,jdbcType=INTEGER}");
        }

        if (record.getJvmVersion() != null) {
            sql.VALUES("jvm_version", "#{jvmVersion,jdbcType=VARCHAR}");
        }

        if (record.getJvmHome() != null) {
            sql.VALUES("jvm_home", "#{jvmHome,jdbcType=VARCHAR}");
        }

        if (record.getJvmAppHome() != null) {
            sql.VALUES("jvm_apphome", "#{jvmApphome,jdbcType=VARCHAR}");
        }

        if (record.getJvmClassVersion() != null) {
            sql.VALUES("jvm_classversion", "#{jvmClassversion,jdbcType=VARCHAR}");
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

    public String updateByPrimaryKeySelective(SystemInfo record) {
        SQL sql = new SQL();
        sql.UPDATE("sys_systeminfo");

        if (record.getUsername() != null) {
            sql.SET("username = #{username,jdbcType=VARCHAR}");
        }

        if (record.getServerName() != null) {
            sql.SET("server_name = #{serverName,jdbcType=VARCHAR}");
        }

        if (record.getDomain() != null) {
            sql.SET("domain = #{domain,jdbcType=VARCHAR}");
        }

        if (record.getNetName() != null) {
            sql.SET("net_name = #{netName,jdbcType=VARCHAR}");
        }

        if (record.getIp() != null) {
            sql.SET("ip = #{ip,jdbcType=VARCHAR}");
        }

        if (record.getMac() != null) {
            sql.SET("mac = #{mac,jdbcType=VARCHAR}");
        }

        if (record.getHost() != null) {
            sql.SET("host = #{host,jdbcType=VARCHAR}");
        }

        if (record.getOsArch() != null) {
            sql.SET("os_arch = #{osArch,jdbcType=VARCHAR}");
        }

        if (record.getOsName() != null) {
            sql.SET("os_name = #{osName,jdbcType=VARCHAR}");
        }

        if (record.getOsVersion() != null) {
            sql.SET("os_version = #{osVersion,jdbcType=VARCHAR}");
        }

        if (record.getCpuMhz() != null) {
            sql.SET("cpu_mhz = #{cpuMhz,jdbcType=VARCHAR}");
        }

        if (record.getCpuVendor() != null) {
            sql.SET("cpu_vendor = #{cpuVendor,jdbcType=VARCHAR}");
        }

        if (record.getCpuModel() != null) {
            sql.SET("cpu_model = #{cpuModel,jdbcType=VARCHAR}");
        }

        if (record.getCpuCacheSize() != null) {
            sql.SET("cpu_cachesize = #{cpuCachesize,jdbcType=VARCHAR}");
        }

        if (record.getMemTotal() != null) {
            sql.SET("mem_total = #{memTotal,jdbcType=DOUBLE}");
        }

        if (record.getJvmXmx() != null) {
            sql.SET("jvm_xmx = #{jvmXmx,jdbcType=DOUBLE}");
        }

        if (record.getJvmXms() != null) {
            sql.SET("jvm_xms = #{jvmXms,jdbcType=DOUBLE}");
        }

        if (record.getJvmXmn() != null) {
            sql.SET("jvm_xmn = #{jvmXmn,jdbcType=DOUBLE}");
        }

        if (record.getJvmAvailableProcessors() != null) {
            sql.SET("jvm_availableprocessors = #{jvmAvailableprocessors,jdbcType=INTEGER}");
        }

        if (record.getJvmVersion() != null) {
            sql.SET("jvm_version = #{jvmVersion,jdbcType=VARCHAR}");
        }

        if (record.getJvmHome() != null) {
            sql.SET("jvm_home = #{jvmHome,jdbcType=VARCHAR}");
        }

        if (record.getJvmAppHome() != null) {
            sql.SET("jvm_apphome = #{jvmApphome,jdbcType=VARCHAR}");
        }

        if (record.getJvmClassVersion() != null) {
            sql.SET("jvm_classversion = #{jvmClassversion,jdbcType=VARCHAR}");
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