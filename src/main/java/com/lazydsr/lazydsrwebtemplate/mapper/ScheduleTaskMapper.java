package com.lazydsr.lazydsrwebtemplate.mapper;

import com.lazydsr.lazydsrwebtemplate.entity.ScheduleTask;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface ScheduleTaskMapper {
    @Delete({
            "delete from sys_schedule_task",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
            "insert into sys_schedule_task (id, name, ",
            "classpath, cron, ",
            "description, creator, ",
            "create_date, modifier, ",
            "modify_date, status)",
            "values (#{id,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
            "#{classpath,jdbcType=VARCHAR}, #{cron,jdbcType=VARCHAR}, ",
            "#{description,jdbcType=VARCHAR}, #{creator,jdbcType=VARCHAR}, ",
            "#{createDate,jdbcType=VARCHAR}, #{modifier,jdbcType=VARCHAR}, ",
            "#{modifyDate,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER})"
    })
    int insert(ScheduleTask record);

    @InsertProvider(type = ScheduleTaskSqlProvider.class, method = "insertSelective")
    int insertSelective(ScheduleTask record);

    @Select({
            "select",
            "id, name, classpath, cron, description, creator, create_date, modifier, modify_date, ",
            "status",
            "from sys_schedule_task",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "classpath", property = "classpath", jdbcType = JdbcType.VARCHAR),
            @Result(column = "cron", property = "cron", jdbcType = JdbcType.VARCHAR),
            @Result(column = "description", property = "description", jdbcType = JdbcType.VARCHAR),
            @Result(column = "creator", property = "creator", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_date", property = "createDate", jdbcType = JdbcType.VARCHAR),
            @Result(column = "modifier", property = "modifier", jdbcType = JdbcType.VARCHAR),
            @Result(column = "modify_date", property = "modifyDate", jdbcType = JdbcType.VARCHAR),
            @Result(column = "status", property = "status", jdbcType = JdbcType.INTEGER)
    })
    ScheduleTask selectByPrimaryKey(String id);

    @UpdateProvider(type = ScheduleTaskSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ScheduleTask record);

    @Update({
            "update sys_schedule_task",
            "set name = #{name,jdbcType=VARCHAR},",
            "classpath = #{classpath,jdbcType=VARCHAR},",
            "cron = #{cron,jdbcType=VARCHAR},",
            "description = #{description,jdbcType=VARCHAR},",
            "creator = #{creator,jdbcType=VARCHAR},",
            "create_date = #{createDate,jdbcType=VARCHAR},",
            "modifier = #{modifier,jdbcType=VARCHAR},",
            "modify_date = #{modifyDate,jdbcType=VARCHAR},",
            "status = #{status,jdbcType=INTEGER}",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(ScheduleTask record);
}