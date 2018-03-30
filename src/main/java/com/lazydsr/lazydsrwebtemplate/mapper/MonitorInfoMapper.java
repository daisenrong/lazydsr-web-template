package com.lazydsr.lazydsrwebtemplate.mapper;

import com.lazydsr.lazydsrwebtemplate.entity.MonitorInfo;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
@Mapper
public interface MonitorInfoMapper {
    @Delete({
        "delete from sys_monitorinfo",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into sys_monitorinfo (id, server_id, ",
        "total_memory, free_memory, ",
        "max_memory, os_name, ",
        "total_memory_size, free_physical_memory_size, ",
        "used_memory, total_thread, ",
        "cpu_ratio, creator, ",
        "create_date, modifier, ",
        "modify_date, status)",
        "values (#{id,jdbcType=VARCHAR}, #{serverId,jdbcType=VARCHAR}, ",
        "#{totalMemory,jdbcType=BIGINT}, #{freeMemory,jdbcType=BIGINT}, ",
        "#{maxMemory,jdbcType=BIGINT}, #{osName,jdbcType=VARCHAR}, ",
        "#{totalMemorySize,jdbcType=BIGINT}, #{freePhysicalMemorySize,jdbcType=BIGINT}, ",
        "#{usedMemory,jdbcType=BIGINT}, #{totalThread,jdbcType=INTEGER}, ",
        "#{cpuRatio,jdbcType=DOUBLE}, #{creator,jdbcType=VARCHAR}, ",
        "#{createDate,jdbcType=VARCHAR}, #{modifier,jdbcType=VARCHAR}, ",
        "#{modifyDate,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER})"
    })
    int insert(MonitorInfo record);

    @InsertProvider(type=MonitorInfoSqlProvider.class, method="insertSelective")
    int insertSelective(MonitorInfo record);

    @Select({
        "select",
        "id, server_id, total_memory, free_memory, max_memory, os_name, total_memory_size, ",
        "free_physical_memory_size, used_memory, total_thread, cpu_ratio, creator, create_date, ",
        "modifier, modify_date, status",
        "from sys_monitorinfo",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="server_id", property="serverId", jdbcType=JdbcType.VARCHAR),
        @Result(column="total_memory", property="totalMemory", jdbcType=JdbcType.BIGINT),
        @Result(column="free_memory", property="freeMemory", jdbcType=JdbcType.BIGINT),
        @Result(column="max_memory", property="maxMemory", jdbcType=JdbcType.BIGINT),
        @Result(column="os_name", property="osName", jdbcType=JdbcType.VARCHAR),
        @Result(column="total_memory_size", property="totalMemorySize", jdbcType=JdbcType.BIGINT),
        @Result(column="free_physical_memory_size", property="freePhysicalMemorySize", jdbcType=JdbcType.BIGINT),
        @Result(column="used_memory", property="usedMemory", jdbcType=JdbcType.BIGINT),
        @Result(column="total_thread", property="totalThread", jdbcType=JdbcType.INTEGER),
        @Result(column="cpu_ratio", property="cpuRatio", jdbcType=JdbcType.DOUBLE),
        @Result(column="creator", property="creator", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="modifier", property="modifier", jdbcType=JdbcType.VARCHAR),
        @Result(column="modify_date", property="modifyDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER)
    })
    MonitorInfo selectByPrimaryKey(String id);

    @UpdateProvider(type=MonitorInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MonitorInfo record);

    @Update({
        "update sys_monitorinfo",
        "set server_id = #{serverId,jdbcType=VARCHAR},",
          "total_memory = #{totalMemory,jdbcType=BIGINT},",
          "free_memory = #{freeMemory,jdbcType=BIGINT},",
          "max_memory = #{maxMemory,jdbcType=BIGINT},",
          "os_name = #{osName,jdbcType=VARCHAR},",
          "total_memory_size = #{totalMemorySize,jdbcType=BIGINT},",
          "free_physical_memory_size = #{freePhysicalMemorySize,jdbcType=BIGINT},",
          "used_memory = #{usedMemory,jdbcType=BIGINT},",
          "total_thread = #{totalThread,jdbcType=INTEGER},",
          "cpu_ratio = #{cpuRatio,jdbcType=DOUBLE},",
          "creator = #{creator,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=VARCHAR},",
          "modifier = #{modifier,jdbcType=VARCHAR},",
          "modify_date = #{modifyDate,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(MonitorInfo record);
}