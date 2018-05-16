package com.lazydsr.lazydsrwebtemplate.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.lazydsr.lazydsrwebtemplate.entity.ScheduleJob;

public class ScheduleJobSqlProvider {

    public String insertSelective(ScheduleJob record) {
        BEGIN();
        INSERT_INTO("sys_schedule_job");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getJobgroup() != null) {
            VALUES("jobgroup", "#{jobgroup,jdbcType=VARCHAR}");
        }
        
        if (record.getClasspath() != null) {
            VALUES("classpath", "#{classpath,jdbcType=VARCHAR}");
        }
        
        if (record.getMethod() != null) {
            VALUES("method", "#{method,jdbcType=VARCHAR}");
        }
        
        if (record.getConcurrent() != null) {
            VALUES("concurrent", "#{concurrent,jdbcType=VARCHAR}");
        }
        
        if (record.getCron() != null) {
            VALUES("cron", "#{cron,jdbcType=VARCHAR}");
        }
        
        if (record.getDescription() != null) {
            VALUES("description", "#{description,jdbcType=VARCHAR}");
        }
        
        if (record.getJobstatus() != null) {
            VALUES("jobstatus", "#{jobstatus,jdbcType=VARCHAR}");
        }
        
        if (record.getCreator() != null) {
            VALUES("creator", "#{creator,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateDate() != null) {
            VALUES("create_date", "#{createDate,jdbcType=VARCHAR}");
        }
        
        if (record.getModifier() != null) {
            VALUES("modifier", "#{modifier,jdbcType=VARCHAR}");
        }
        
        if (record.getModifyDate() != null) {
            VALUES("modify_date", "#{modifyDate,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(ScheduleJob record) {
        BEGIN();
        UPDATE("sys_schedule_job");
        
        if (record.getName() != null) {
            SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getJobgroup() != null) {
            SET("jobgroup = #{jobgroup,jdbcType=VARCHAR}");
        }
        
        if (record.getClasspath() != null) {
            SET("classpath = #{classpath,jdbcType=VARCHAR}");
        }
        
        if (record.getMethod() != null) {
            SET("method = #{method,jdbcType=VARCHAR}");
        }
        
        if (record.getConcurrent() != null) {
            SET("concurrent = #{concurrent,jdbcType=VARCHAR}");
        }
        
        if (record.getCron() != null) {
            SET("cron = #{cron,jdbcType=VARCHAR}");
        }
        
        if (record.getDescription() != null) {
            SET("description = #{description,jdbcType=VARCHAR}");
        }
        
        if (record.getJobstatus() != null) {
            SET("jobstatus = #{jobstatus,jdbcType=VARCHAR}");
        }
        
        if (record.getCreator() != null) {
            SET("creator = #{creator,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateDate() != null) {
            SET("create_date = #{createDate,jdbcType=VARCHAR}");
        }
        
        if (record.getModifier() != null) {
            SET("modifier = #{modifier,jdbcType=VARCHAR}");
        }
        
        if (record.getModifyDate() != null) {
            SET("modify_date = #{modifyDate,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=INTEGER}");
        }
        
        WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return SQL();
    }
}