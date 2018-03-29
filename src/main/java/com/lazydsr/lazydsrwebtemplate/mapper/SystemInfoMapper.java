package com.lazydsr.lazydsrwebtemplate.mapper;

import com.lazydsr.lazydsrwebtemplate.entity.SystemInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface SystemInfoMapper {
    @Delete({
        "delete from sys_systeminfo",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into sys_systeminfo (id, username, ",
        "server_name, domain, ",
        "net_name, ip, mac, ",
        "host, os_arch, os_name, ",
        "os_version, cpu_mhz, ",
        "cpu_vendor, cpu_model, ",
        "cpu_cache_size, mem_total, ",
        "jvm_xmx, jvm_xms, jvm_xmn, ",
        "jvm_available_processors, jvm_version, ",
        "jvm_home, jvm_app_home, ",
        "jvm_class_version, creator, ",
        "create_date, modifier, ",
        "modify_date, status)",
        "values (#{id,jdbcType=VARCHAR}, #{username,jdbcType=VARCHAR}, ",
        "#{serverName,jdbcType=VARCHAR}, #{domain,jdbcType=VARCHAR}, ",
        "#{netName,jdbcType=VARCHAR}, #{ip,jdbcType=VARCHAR}, #{mac,jdbcType=VARCHAR}, ",
        "#{host,jdbcType=VARCHAR}, #{osArch,jdbcType=VARCHAR}, #{osName,jdbcType=VARCHAR}, ",
        "#{osVersion,jdbcType=VARCHAR}, #{cpuMhz,jdbcType=VARCHAR}, ",
        "#{cpuVendor,jdbcType=VARCHAR}, #{cpuModel,jdbcType=VARCHAR}, ",
        "#{cpuCacheSize,jdbcType=VARCHAR}, #{memTotal,jdbcType=DOUBLE}, ",
        "#{jvmXmx,jdbcType=DOUBLE}, #{jvmXms,jdbcType=DOUBLE}, #{jvmXmn,jdbcType=DOUBLE}, ",
        "#{jvmAvailableProcessors,jdbcType=INTEGER}, #{jvmVersion,jdbcType=VARCHAR}, ",
        "#{jvmHome,jdbcType=VARCHAR}, #{jvmAppHome,jdbcType=VARCHAR}, ",
        "#{jvmClassVersion,jdbcType=VARCHAR}, #{creator,jdbcType=VARCHAR}, ",
        "#{createDate,jdbcType=VARCHAR}, #{modifier,jdbcType=VARCHAR}, ",
        "#{modifyDate,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER})"
    })
    int insert(SystemInfo record);

    @InsertProvider(type=SystemInfoSqlProvider.class, method="insertSelective")
    int insertSelective(SystemInfo record);

    @Select({
        "select",
        "id, username, server_name, domain, net_name, ip, mac, host, os_arch, os_name, ",
        "os_version, cpu_mhz, cpu_vendor, cpu_model, cpu_cache_size, mem_total, jvm_xmx, ",
        "jvm_xms, jvm_xmn, jvm_available_processors, jvm_version, jvm_home, jvm_app_home, ",
        "jvm_class_version, creator, create_date, modifier, modify_date, status",
        "from sys_systeminfo",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="server_name", property="serverName", jdbcType=JdbcType.VARCHAR),
        @Result(column="domain", property="domain", jdbcType=JdbcType.VARCHAR),
        @Result(column="net_name", property="netName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="mac", property="mac", jdbcType=JdbcType.VARCHAR),
        @Result(column="host", property="host", jdbcType=JdbcType.VARCHAR),
        @Result(column="os_arch", property="osArch", jdbcType=JdbcType.VARCHAR),
        @Result(column="os_name", property="osName", jdbcType=JdbcType.VARCHAR),
        @Result(column="os_version", property="osVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="cpu_mhz", property="cpuMhz", jdbcType=JdbcType.VARCHAR),
        @Result(column="cpu_vendor", property="cpuVendor", jdbcType=JdbcType.VARCHAR),
        @Result(column="cpu_model", property="cpuModel", jdbcType=JdbcType.VARCHAR),
        @Result(column="cpu_cache_size", property="cpuCacheSize", jdbcType=JdbcType.VARCHAR),
        @Result(column="mem_total", property="memTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="jvm_xmx", property="jvmXmx", jdbcType=JdbcType.DOUBLE),
        @Result(column="jvm_xms", property="jvmXms", jdbcType=JdbcType.DOUBLE),
        @Result(column="jvm_xmn", property="jvmXmn", jdbcType=JdbcType.DOUBLE),
        @Result(column="jvm_available_processors", property="jvmAvailableProcessors", jdbcType=JdbcType.INTEGER),
        @Result(column="jvm_version", property="jvmVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="jvm_home", property="jvmHome", jdbcType=JdbcType.VARCHAR),
        @Result(column="jvm_app_home", property="jvmAppHome", jdbcType=JdbcType.VARCHAR),
        @Result(column="jvm_class_version", property="jvmClassVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="creator", property="creator", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="modifier", property="modifier", jdbcType=JdbcType.VARCHAR),
        @Result(column="modify_date", property="modifyDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER)
    })
    SystemInfo selectByPrimaryKey(String id);

    @UpdateProvider(type=SystemInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SystemInfo record);

    @Update({
        "update sys_systeminfo",
        "set username = #{username,jdbcType=VARCHAR},",
          "server_name = #{serverName,jdbcType=VARCHAR},",
          "domain = #{domain,jdbcType=VARCHAR},",
          "net_name = #{netName,jdbcType=VARCHAR},",
          "ip = #{ip,jdbcType=VARCHAR},",
          "mac = #{mac,jdbcType=VARCHAR},",
          "host = #{host,jdbcType=VARCHAR},",
          "os_arch = #{osArch,jdbcType=VARCHAR},",
          "os_name = #{osName,jdbcType=VARCHAR},",
          "os_version = #{osVersion,jdbcType=VARCHAR},",
          "cpu_mhz = #{cpuMhz,jdbcType=VARCHAR},",
          "cpu_vendor = #{cpuVendor,jdbcType=VARCHAR},",
          "cpu_model = #{cpuModel,jdbcType=VARCHAR},",
          "cpu_cache_size = #{cpuCacheSize,jdbcType=VARCHAR},",
          "mem_total = #{memTotal,jdbcType=DOUBLE},",
          "jvm_xmx = #{jvmXmx,jdbcType=DOUBLE},",
          "jvm_xms = #{jvmXms,jdbcType=DOUBLE},",
          "jvm_xmn = #{jvmXmn,jdbcType=DOUBLE},",
          "jvm_available_processors = #{jvmAvailableProcessors,jdbcType=INTEGER},",
          "jvm_version = #{jvmVersion,jdbcType=VARCHAR},",
          "jvm_home = #{jvmHome,jdbcType=VARCHAR},",
          "jvm_app_home = #{jvmAppHome,jdbcType=VARCHAR},",
          "jvm_class_version = #{jvmClassVersion,jdbcType=VARCHAR},",
          "creator = #{creator,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=VARCHAR},",
          "modifier = #{modifier,jdbcType=VARCHAR},",
          "modify_date = #{modifyDate,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(SystemInfo record);
}