package com.lazydsr.lazydsrwebtemplate.mapper;

import com.lazydsr.lazydsrwebtemplate.entity.ScheduleJob;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface ScheduleJobMapper {
    @Delete({
        "delete from sys_schedule_job",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into sys_schedule_job (id, name, ",
        "jobgroup, classpath, ",
        "method, concurrent, ",
        "cron, description, ",
        "jobstatus, creator, ",
        "create_date, modifier, ",
        "modify_date, status)",
        "values (#{id,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{jobgroup,jdbcType=VARCHAR}, #{classpath,jdbcType=VARCHAR}, ",
        "#{method,jdbcType=VARCHAR}, #{concurrent,jdbcType=VARCHAR}, ",
        "#{cron,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ",
        "#{jobstatus,jdbcType=VARCHAR}, #{creator,jdbcType=VARCHAR}, ",
        "#{createDate,jdbcType=VARCHAR}, #{modifier,jdbcType=VARCHAR}, ",
        "#{modifyDate,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER})"
    })
    int insert(ScheduleJob record);

    @InsertProvider(type=ScheduleJobSqlProvider.class, method="insertSelective")
    int insertSelective(ScheduleJob record);

    @Select({
        "select",
        "id, name, jobgroup, classpath, method, concurrent, cron, description, jobstatus, ",
        "creator, create_date, modifier, modify_date, status",
        "from sys_schedule_job",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="jobgroup", property="jobgroup", jdbcType=JdbcType.VARCHAR),
        @Result(column="classpath", property="classpath", jdbcType=JdbcType.VARCHAR),
        @Result(column="method", property="method", jdbcType=JdbcType.VARCHAR),
        @Result(column="concurrent", property="concurrent", jdbcType=JdbcType.VARCHAR),
        @Result(column="cron", property="cron", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="jobstatus", property="jobstatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="creator", property="creator", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="modifier", property="modifier", jdbcType=JdbcType.VARCHAR),
        @Result(column="modify_date", property="modifyDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER)
    })
    ScheduleJob selectByPrimaryKey(String id);

    @Select({
            "select",
            "id, name, jobgroup, classpath, method, concurrent, cron, description, jobstatus, ",
            "creator, create_date, modifier, modify_date, status",
            "from sys_schedule_job"
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
            @Result(column="jobgroup", property="jobgroup", jdbcType=JdbcType.VARCHAR),
            @Result(column="classpath", property="classpath", jdbcType=JdbcType.VARCHAR),
            @Result(column="method", property="method", jdbcType=JdbcType.VARCHAR),
            @Result(column="concurrent", property="concurrent", jdbcType=JdbcType.VARCHAR),
            @Result(column="cron", property="cron", jdbcType=JdbcType.VARCHAR),
            @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
            @Result(column="jobstatus", property="jobstatus", jdbcType=JdbcType.VARCHAR),
            @Result(column="creator", property="creator", jdbcType=JdbcType.VARCHAR),
            @Result(column="create_date", property="createDate", jdbcType=JdbcType.VARCHAR),
            @Result(column="modifier", property="modifier", jdbcType=JdbcType.VARCHAR),
            @Result(column="modify_date", property="modifyDate", jdbcType=JdbcType.VARCHAR),
            @Result(column="status", property="status", jdbcType=JdbcType.INTEGER)
    })
    List<ScheduleJob> selectAll();

    @UpdateProvider(type=ScheduleJobSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ScheduleJob record);

    @Update({
        "update sys_schedule_job",
        "set name = #{name,jdbcType=VARCHAR},",
          "jobgroup = #{jobgroup,jdbcType=VARCHAR},",
          "classpath = #{classpath,jdbcType=VARCHAR},",
          "method = #{method,jdbcType=VARCHAR},",
          "concurrent = #{concurrent,jdbcType=VARCHAR},",
          "cron = #{cron,jdbcType=VARCHAR},",
          "description = #{description,jdbcType=VARCHAR},",
          "jobstatus = #{jobstatus,jdbcType=VARCHAR},",
          "creator = #{creator,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=VARCHAR},",
          "modifier = #{modifier,jdbcType=VARCHAR},",
          "modify_date = #{modifyDate,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(ScheduleJob record);
}