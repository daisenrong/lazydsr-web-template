package com.lazydsr.lazydsrwebtemplate.mapper;

import com.lazydsr.lazydsrwebtemplate.entity.Admin;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
@Mapper
public interface AdminMapper {
    @Delete({
        "delete from sys_admin",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "add into sys_admin (id, name, ",
        "creator, create_date, ",
        "modifier, modify_date, ",
        "status)",
        "values (#{id,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{creator,jdbcType=VARCHAR}, #{createDate,jdbcType=VARCHAR}, ",
        "#{modifier,jdbcType=VARCHAR}, #{modifyDate,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=INTEGER})"
    })
    int insert(Admin record);

    @InsertProvider(type=AdminSqlProvider.class, method="insertSelective")
    int insertSelective(Admin record);

    @Select({
        "select",
        "id, name, creator, create_date, modifier, modify_date, status",
        "from sys_admin",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="creator", property="creator", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="modifier", property="modifier", jdbcType=JdbcType.VARCHAR),
        @Result(column="modify_date", property="modifyDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER)
    })
    Admin selectByPrimaryKey(String id);

    @UpdateProvider(type=AdminSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Admin record);

    @Update({
        "update sys_admin",
        "set name = #{name,jdbcType=VARCHAR},",
          "creator = #{creator,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=VARCHAR},",
          "modifier = #{modifier,jdbcType=VARCHAR},",
          "modify_date = #{modifyDate,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Admin record);
}