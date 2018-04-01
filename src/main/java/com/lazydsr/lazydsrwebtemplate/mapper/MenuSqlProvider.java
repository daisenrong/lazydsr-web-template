package com.lazydsr.lazydsrwebtemplate.mapper;

import com.lazydsr.lazydsrwebtemplate.entity.Menu;
import org.apache.ibatis.jdbc.SQL;

public class MenuSqlProvider {

    public String insertSelective(Menu record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sys_menu");

        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }

        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }

        if (record.getEnName() != null) {
            sql.VALUES("en_name", "#{enName,jdbcType=VARCHAR}");
        }

        if (record.getDescription() != null) {
            sql.VALUES("description", "#{description,jdbcType=VARCHAR}");
        }

        if (record.getParentId() != null) {
            sql.VALUES("parent_id", "#{parentId,jdbcType=VARCHAR}");
        }

        if (record.getIcon() != null) {
            sql.VALUES("icon", "#{icon,jdbcType=VARCHAR}");
        }

        if (record.getUrl() != null) {
            sql.VALUES("url", "#{url,jdbcType=VARCHAR}");
        }

        if (record.getTarget() != null) {
            sql.VALUES("target", "#{target,jdbcType=VARCHAR}");
        }

        if (record.getPublics() != null) {
            sql.VALUES("publics", "#{publics,jdbcType=INTEGER}");
        }

        if (record.getAllowEdit() != null) {
            sql.VALUES("allow_edit", "#{allowEdit,jdbcType=INTEGER}");
        }

        if (record.getAllowDelete() != null) {
            sql.VALUES("allow_delete", "#{allowDelete,jdbcType=INTEGER}");
        }

        if (record.getOrdernum() != null) {
            sql.VALUES("orderNum", "#{ordernum,jdbcType=DOUBLE}");
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

    public String updateByPrimaryKeySelective(Menu record) {
        SQL sql = new SQL();
        sql.UPDATE("sys_menu");

        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }

        if (record.getEnName() != null) {
            sql.SET("en_name = #{enName,jdbcType=VARCHAR}");
        }

        if (record.getDescription() != null) {
            sql.SET("description = #{description,jdbcType=VARCHAR}");
        }

        if (record.getParentId() != null) {
            sql.SET("parent_id = #{parentId,jdbcType=VARCHAR}");
        }

        if (record.getIcon() != null) {
            sql.SET("icon = #{icon,jdbcType=VARCHAR}");
        }

        if (record.getUrl() != null) {
            sql.SET("url = #{url,jdbcType=VARCHAR}");
        }

        if (record.getTarget() != null) {
            sql.SET("target = #{target,jdbcType=VARCHAR}");
        }

        if (record.getPublics() != null) {
            sql.SET("publics = #{publics,jdbcType=INTEGER}");
        }

        if (record.getAllowEdit() != null) {
            sql.SET("allow_edit = #{allowEdit,jdbcType=INTEGER}");
        }

        if (record.getAllowDelete() != null) {
            sql.SET("allow_delete = #{allowDelete,jdbcType=INTEGER}");
        }

        if (record.getOrdernum() != null) {
            sql.SET("orderNum = #{ordernum,jdbcType=DOUBLE}");
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