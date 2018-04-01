package com.lazydsr.lazydsrwebtemplate.mapper;

import com.lazydsr.lazydsrwebtemplate.entity.Permission;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface PermissionMapper extends BaseMapper<Permission> {
    //@Delete({
    //        "delete from sys_permission",
    //        "where id = #{id,jdbcType=VARCHAR}"
    //})
    //int deleteByPrimaryKey(String id);
    //
    //@Insert({
    //        "insert into sys_permission (id, name, ",
    //        "url, pid, description, ",
    //        "creator, create_date, ",
    //        "modifier, modify_date, ",
    //        "status)",
    //        "values (#{id,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
    //        "#{url,jdbcType=VARCHAR}, #{pid,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ",
    //        "#{creator,jdbcType=VARCHAR}, #{createDate,jdbcType=VARCHAR}, ",
    //        "#{modifier,jdbcType=VARCHAR}, #{modifyDate,jdbcType=VARCHAR}, ",
    //        "#{status,jdbcType=INTEGER})"
    //})
    //int insert(Permission record);
    //
    //@InsertProvider(type = PermissionSqlProvider.class, method = "insertSelective")
    //int insertSelective(Permission record);
    //
    //@Select({
    //        "select",
    //        "id, name, url, pid, description, creator, create_date, modifier, modify_date, ",
    //        "status",
    //        "from sys_permission",
    //        "where id = #{id,jdbcType=VARCHAR}"
    //})
    //@Results({
    //        @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
    //        @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
    //        @Result(column = "url", property = "url", jdbcType = JdbcType.VARCHAR),
    //        @Result(column = "pid", property = "pid", jdbcType = JdbcType.VARCHAR),
    //        @Result(column = "description", property = "description", jdbcType = JdbcType.VARCHAR),
    //        @Result(column = "creator", property = "creator", jdbcType = JdbcType.VARCHAR),
    //        @Result(column = "create_date", property = "createDate", jdbcType = JdbcType.VARCHAR),
    //        @Result(column = "modifier", property = "modifier", jdbcType = JdbcType.VARCHAR),
    //        @Result(column = "modify_date", property = "modifyDate", jdbcType = JdbcType.VARCHAR),
    //        @Result(column = "status", property = "status", jdbcType = JdbcType.INTEGER)
    //})
    //Permission selectByPrimaryKey(String id);

    @Select({
            "SELECT ",
            " p.* ",
            " FROM sys_user u ",
            " LEFT JOIN sys_user_role sru ON u.id= sru.u_id ",
            " LEFT JOIN sys_role r ON sru.r_id=r.id ",
            " LEFT JOIN sys_permission_role spr ON spr.r_id=r.id ",
            " LEFT JOIN sys_permission p ON p.id =spr.p_id ",
            " WHERE u.id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "url", property = "url", jdbcType = JdbcType.VARCHAR),
            @Result(column = "pid", property = "pid", jdbcType = JdbcType.VARCHAR),
            @Result(column = "description", property = "description", jdbcType = JdbcType.VARCHAR),
            @Result(column = "creator", property = "creator", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_date", property = "createDate", jdbcType = JdbcType.VARCHAR),
            @Result(column = "modifier", property = "modifier", jdbcType = JdbcType.VARCHAR),
            @Result(column = "modify_date", property = "modifyDate", jdbcType = JdbcType.VARCHAR),
            @Result(column = "status", property = "status", jdbcType = JdbcType.INTEGER)
    })
    List<Permission> selectByUserId(String id);

    //@UpdateProvider(type = PermissionSqlProvider.class, method = "updateByPrimaryKeySelective")
    //int updateByPrimaryKeySelective(Permission record);
    //
    //@Update({
    //        "update sys_permission",
    //        "set name = #{name,jdbcType=VARCHAR},",
    //        "url = #{url,jdbcType=VARCHAR},",
    //        "pid = #{pid,jdbcType=VARCHAR},",
    //        "description = #{description,jdbcType=VARCHAR},",
    //        "creator = #{creator,jdbcType=VARCHAR},",
    //        "create_date = #{createDate,jdbcType=VARCHAR},",
    //        "modifier = #{modifier,jdbcType=VARCHAR},",
    //        "modify_date = #{modifyDate,jdbcType=VARCHAR},",
    //        "status = #{status,jdbcType=INTEGER}",
    //        "where id = #{id,jdbcType=VARCHAR}"
    //})
    //int updateByPrimaryKey(Permission record);
}