package com.lazydsr.lazydsrwebtemplate.mapper;

import com.lazydsr.lazydsrwebtemplate.entity.UserLoginRecord;
import org.apache.ibatis.jdbc.SQL;

public class UserLoginRecordSqlProvider {

    public String insertSelective(UserLoginRecord record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sys_user_login_record");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=VARCHAR}");
        }
        
        if (record.getUsername() != null) {
            sql.VALUES("username", "#{username,jdbcType=VARCHAR}");
        }
        
        if (record.getIp() != null) {
            sql.VALUES("ip", "#{ip,jdbcType=VARCHAR}");
        }
        
        if (record.getDate() != null) {
            sql.VALUES("date", "#{date,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("type", "#{type,jdbcType=INTEGER}");
        }
        
        if (record.getLoginStatus() != null) {
            sql.VALUES("login_status", "#{loginStatus,jdbcType=INTEGER}");
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

    public String updateByPrimaryKeySelective(UserLoginRecord record) {
        SQL sql = new SQL();
        sql.UPDATE("sys_user_login_record");
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=VARCHAR}");
        }
        
        if (record.getUsername() != null) {
            sql.SET("username = #{username,jdbcType=VARCHAR}");
        }
        
        if (record.getIp() != null) {
            sql.SET("ip = #{ip,jdbcType=VARCHAR}");
        }
        
        if (record.getDate() != null) {
            sql.SET("date = #{date,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{type,jdbcType=INTEGER}");
        }
        
        if (record.getLoginStatus() != null) {
            sql.SET("login_status = #{loginStatus,jdbcType=INTEGER}");
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