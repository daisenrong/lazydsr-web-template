package com.lazydsr.lazydsrwebtemplate.mapper;

import com.lazydsr.lazydsrwebtemplate.entity.DataSourceInfo;
import org.apache.ibatis.jdbc.SQL;

public class DataSourceInfoSqlProvider {

    public String insertSelective(DataSourceInfo record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sys_datasourceinfo");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getDbtype() != null) {
            sql.VALUES("dbtype", "#{dbtype,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.VALUES("address", "#{address,jdbcType=VARCHAR}");
        }
        
        if (record.getProt() != null) {
            sql.VALUES("prot", "#{prot,jdbcType=VARCHAR}");
        }
        
        if (record.getDbname() != null) {
            sql.VALUES("dbname", "#{dbname,jdbcType=VARCHAR}");
        }
        
        if (record.getUsername() != null) {
            sql.VALUES("username", "#{username,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.VALUES("password", "#{password,jdbcType=VARCHAR}");
        }
        
        if (record.getMinActive() != null) {
            sql.VALUES("min_active", "#{minActive,jdbcType=INTEGER}");
        }
        
        if (record.getMaxActive() != null) {
            sql.VALUES("max_active", "#{maxActive,jdbcType=INTEGER}");
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

    public String updateByPrimaryKeySelective(DataSourceInfo record) {
        SQL sql = new SQL();
        sql.UPDATE("sys_datasourceinfo");
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getDbtype() != null) {
            sql.SET("dbtype = #{dbtype,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.SET("address = #{address,jdbcType=VARCHAR}");
        }
        
        if (record.getProt() != null) {
            sql.SET("prot = #{prot,jdbcType=VARCHAR}");
        }
        
        if (record.getDbname() != null) {
            sql.SET("dbname = #{dbname,jdbcType=VARCHAR}");
        }
        
        if (record.getUsername() != null) {
            sql.SET("username = #{username,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.SET("password = #{password,jdbcType=VARCHAR}");
        }
        
        if (record.getMinActive() != null) {
            sql.SET("min_active = #{minActive,jdbcType=INTEGER}");
        }
        
        if (record.getMaxActive() != null) {
            sql.SET("max_active = #{maxActive,jdbcType=INTEGER}");
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