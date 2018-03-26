package com.lazydsr.lazydsrwebtemplate.mapper;

import com.lazydsr.lazydsrwebtemplate.entity.PermissionRole;
import org.apache.ibatis.jdbc.SQL;

public class PermissionRoleSqlProvider {

    public String insertSelective(PermissionRole record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sys_permission_role");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getpId() != null) {
            sql.VALUES("pid", "#{pid,jdbcType=VARCHAR}");
        }
        
        if (record.getrId() != null) {
            sql.VALUES("rid", "#{rid,jdbcType=VARCHAR}");
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

    public String updateByPrimaryKeySelective(PermissionRole record) {
        SQL sql = new SQL();
        sql.UPDATE("sys_permission_role");
        
        if (record.getpId() != null) {
            sql.SET("pid = #{pid,jdbcType=VARCHAR}");
        }
        
        if (record.getrId() != null) {
            sql.SET("rid = #{rid,jdbcType=VARCHAR}");
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