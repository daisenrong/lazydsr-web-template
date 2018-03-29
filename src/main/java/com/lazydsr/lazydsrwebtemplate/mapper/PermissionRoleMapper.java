package com.lazydsr.lazydsrwebtemplate.mapper;

import com.lazydsr.lazydsrwebtemplate.entity.PermissionRole;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface PermissionRoleMapper {
    @Delete({
        "delete from sys_permission_role",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into sys_permission_role (id, p_id, ",
        "r_id, creator, create_date, ",
        "modifier, modify_date, ",
        "status)",
        "values (#{id,jdbcType=VARCHAR}, #{pId,jdbcType=VARCHAR}, ",
        "#{rId,jdbcType=VARCHAR}, #{creator,jdbcType=VARCHAR}, #{createDate,jdbcType=VARCHAR}, ",
        "#{modifier,jdbcType=VARCHAR}, #{modifyDate,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=INTEGER})"
    })
    int insert(PermissionRole record);

    @InsertProvider(type=PermissionRoleSqlProvider.class, method="insertSelective")
    int insertSelective(PermissionRole record);

    @Select({
        "select",
        "id, p_id, r_id, creator, create_date, modifier, modify_date, status",
        "from sys_permission_role",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="p_id", property="pId", jdbcType=JdbcType.VARCHAR),
        @Result(column="r_id", property="rId", jdbcType=JdbcType.VARCHAR),
        @Result(column="creator", property="creator", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="modifier", property="modifier", jdbcType=JdbcType.VARCHAR),
        @Result(column="modify_date", property="modifyDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER)
    })
    PermissionRole selectByPrimaryKey(String id);

    @UpdateProvider(type=PermissionRoleSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PermissionRole record);

    @Update({
        "update sys_permission_role",
        "set p_id = #{pId,jdbcType=VARCHAR},",
          "r_id = #{rId,jdbcType=VARCHAR},",
          "creator = #{creator,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=VARCHAR},",
          "modifier = #{modifier,jdbcType=VARCHAR},",
          "modify_date = #{modifyDate,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(PermissionRole record);
}