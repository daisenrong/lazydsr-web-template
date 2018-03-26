package com.lazydsr.lazydsrwebtemplate.mapper;

import com.lazydsr.lazydsrwebtemplate.entity.UserRole;
import org.apache.ibatis.jdbc.SQL;

public class UserRoleSqlProvider {

    public String insertSelective(UserRole record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sys_user_role");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getuId() != null) {
            sql.VALUES("u_id", "#{uId,jdbcType=VARCHAR}");
        }
        
        if (record.getrId() != null) {
            sql.VALUES("r_id", "#{rId,jdbcType=VARCHAR}");
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

    public String updateByPrimaryKeySelective(UserRole record) {
        SQL sql = new SQL();
        sql.UPDATE("sys_user_role");
        
        if (record.getuId() != null) {
            sql.SET("u_id = #{uId,jdbcType=VARCHAR}");
        }
        
        if (record.getrId() != null) {
            sql.SET("r_id = #{rId,jdbcType=VARCHAR}");
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