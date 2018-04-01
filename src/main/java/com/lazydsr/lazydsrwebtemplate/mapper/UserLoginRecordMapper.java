package com.lazydsr.lazydsrwebtemplate.mapper;

import com.lazydsr.lazydsrwebtemplate.entity.UserLoginRecord;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface UserLoginRecordMapper extends BaseMapper<UserLoginRecord> {
    //@Delete({
    //        "delete from sys_user_login_record",
    //        "where id = #{id,jdbcType=VARCHAR}"
    //})
    //int deleteByPrimaryKey(String id);
    //
    //@Insert({
    //        "insert into sys_user_login_record (id, user_id, ",
    //        "username, ip, date, ",
    //        "type, login_status, ",
    //        "creator, create_date, ",
    //        "modifier, modify_date, ",
    //        "status)",
    //        "values (#{id,jdbcType=VARCHAR}, #{userId,jdbcType=VARCHAR}, ",
    //        "#{username,jdbcType=VARCHAR}, #{ip,jdbcType=VARCHAR}, #{date,jdbcType=VARCHAR}, ",
    //        "#{type,jdbcType=INTEGER}, #{loginStatus,jdbcType=INTEGER}, ",
    //        "#{creator,jdbcType=VARCHAR}, #{createDate,jdbcType=VARCHAR}, ",
    //        "#{modifier,jdbcType=VARCHAR}, #{modifyDate,jdbcType=VARCHAR}, ",
    //        "#{status,jdbcType=INTEGER})"
    //})
    //int insert(UserLoginRecord record);
    //
    //@InsertProvider(type = UserLoginRecordSqlProvider.class, method = "insertSelective")
    //int insertSelective(UserLoginRecord record);
    //
    //@Select({
    //        "select",
    //        "id, user_id, username, ip, date, type, login_status, creator, create_date, modifier, ",
    //        "modify_date, status",
    //        "from sys_user_login_record",
    //        "where id = #{id,jdbcType=VARCHAR}"
    //})
    //@Results({
    //        @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
    //        @Result(column = "user_id", property = "userId", jdbcType = JdbcType.VARCHAR),
    //        @Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR),
    //        @Result(column = "ip", property = "ip", jdbcType = JdbcType.VARCHAR),
    //        @Result(column = "date", property = "date", jdbcType = JdbcType.VARCHAR),
    //        @Result(column = "type", property = "type", jdbcType = JdbcType.INTEGER),
    //        @Result(column = "login_status", property = "loginStatus", jdbcType = JdbcType.INTEGER),
    //        @Result(column = "creator", property = "creator", jdbcType = JdbcType.VARCHAR),
    //        @Result(column = "create_date", property = "createDate", jdbcType = JdbcType.VARCHAR),
    //        @Result(column = "modifier", property = "modifier", jdbcType = JdbcType.VARCHAR),
    //        @Result(column = "modify_date", property = "modifyDate", jdbcType = JdbcType.VARCHAR),
    //        @Result(column = "status", property = "status", jdbcType = JdbcType.INTEGER)
    //})
    //UserLoginRecord selectByPrimaryKey(String id);

    @Select({
            "select",
            "id, user_id, username, ip, date, type, login_status, creator, create_date, modifier, ",
            "modify_date, status",
            "from sys_user_login_record",
            "where user_id = #{user_id,jdbcType=VARCHAR}",
            "order by date desc"

    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
            @Result(column = "user_id", property = "userId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ip", property = "ip", jdbcType = JdbcType.VARCHAR),
            @Result(column = "date", property = "date", jdbcType = JdbcType.VARCHAR),
            @Result(column = "type", property = "type", jdbcType = JdbcType.INTEGER),
            @Result(column = "login_status", property = "loginStatus", jdbcType = JdbcType.INTEGER),
            @Result(column = "creator", property = "creator", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_date", property = "createDate", jdbcType = JdbcType.VARCHAR),
            @Result(column = "modifier", property = "modifier", jdbcType = JdbcType.VARCHAR),
            @Result(column = "modify_date", property = "modifyDate", jdbcType = JdbcType.VARCHAR),
            @Result(column = "status", property = "status", jdbcType = JdbcType.INTEGER)
    })
    List<UserLoginRecord> selectByUserId(String user_id);

    //@Select({
    //        "select",
    //        "id, user_id, username, ip, date, type, login_status, creator, create_date, modifier, ",
    //        "modify_date, status",
    //        "from sys_user_login_record"
    //
    //})
    //@Results({
    //        @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
    //        @Result(column = "user_id", property = "userId", jdbcType = JdbcType.VARCHAR),
    //        @Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR),
    //        @Result(column = "ip", property = "ip", jdbcType = JdbcType.VARCHAR),
    //        @Result(column = "date", property = "date", jdbcType = JdbcType.VARCHAR),
    //        @Result(column = "type", property = "type", jdbcType = JdbcType.INTEGER),
    //        @Result(column = "login_status", property = "loginStatus", jdbcType = JdbcType.INTEGER),
    //        @Result(column = "creator", property = "creator", jdbcType = JdbcType.VARCHAR),
    //        @Result(column = "create_date", property = "createDate", jdbcType = JdbcType.VARCHAR),
    //        @Result(column = "modifier", property = "modifier", jdbcType = JdbcType.VARCHAR),
    //        @Result(column = "modify_date", property = "modifyDate", jdbcType = JdbcType.VARCHAR),
    //        @Result(column = "status", property = "status", jdbcType = JdbcType.INTEGER)
    //})
    //List<UserLoginRecord> selectAll();

    //@UpdateProvider(type = UserLoginRecordSqlProvider.class, method = "updateByPrimaryKeySelective")
    //int updateByPrimaryKeySelective(UserLoginRecord record);
    //
    //@Update({
    //        "update sys_user_login_record",
    //        "set user_id = #{userId,jdbcType=VARCHAR},",
    //        "username = #{username,jdbcType=VARCHAR},",
    //        "ip = #{ip,jdbcType=VARCHAR},",
    //        "date = #{date,jdbcType=VARCHAR},",
    //        "type = #{type,jdbcType=INTEGER},",
    //        "login_status = #{loginStatus,jdbcType=INTEGER},",
    //        "creator = #{creator,jdbcType=VARCHAR},",
    //        "create_date = #{createDate,jdbcType=VARCHAR},",
    //        "modifier = #{modifier,jdbcType=VARCHAR},",
    //        "modify_date = #{modifyDate,jdbcType=VARCHAR},",
    //        "status = #{status,jdbcType=INTEGER}",
    //        "where id = #{id,jdbcType=VARCHAR}"
    //})
    //int updateByPrimaryKey(UserLoginRecord record);
}