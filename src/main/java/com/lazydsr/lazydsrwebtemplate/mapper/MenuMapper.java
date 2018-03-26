package com.lazydsr.lazydsrwebtemplate.mapper;

import com.lazydsr.lazydsrwebtemplate.entity.Menu;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface MenuMapper {
    @Delete({
            "delete from sys_menu",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
            "add into sys_menu (id, name, ",
            "en_name, description, ",
            "parent_id, icon, ",
            "url, target, publics, ",
            "allow_edit, allow_delete, ",
            "orderNum, creator, ",
            "create_date, modifier, ",
            "modify_date, status)",
            "values (#{id,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
            "#{enName,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ",
            "#{parentId,jdbcType=VARCHAR}, #{icon,jdbcType=VARCHAR}, ",
            "#{url,jdbcType=VARCHAR}, #{target,jdbcType=VARCHAR}, #{publics,jdbcType=INTEGER}, ",
            "#{allowEdit,jdbcType=INTEGER}, #{allowDelete,jdbcType=INTEGER}, ",
            "#{ordernum,jdbcType=DOUBLE}, #{creator,jdbcType=VARCHAR}, ",
            "#{createDate,jdbcType=VARCHAR}, #{modifier,jdbcType=VARCHAR}, ",
            "#{modifyDate,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER})"
    })
    int insert(Menu record);

    @InsertProvider(type = MenuSqlProvider.class, method = "insertSelective")
    int insertSelective(Menu record);

    @Select({
            "select",
            "id, name, en_name, description, parent_id, icon, url, target, publics, allow_edit, ",
            "allow_delete, orderNum, creator, create_date, modifier, modify_date, status",
            "from sys_menu",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "en_name", property = "enName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "description", property = "description", jdbcType = JdbcType.VARCHAR),
            @Result(column = "parent_id", property = "parentId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "icon", property = "icon", jdbcType = JdbcType.VARCHAR),
            @Result(column = "url", property = "url", jdbcType = JdbcType.VARCHAR),
            @Result(column = "target", property = "target", jdbcType = JdbcType.VARCHAR),
            @Result(column = "publics", property = "publics", jdbcType = JdbcType.INTEGER),
            @Result(column = "allow_edit", property = "allowEdit", jdbcType = JdbcType.INTEGER),
            @Result(column = "allow_delete", property = "allowDelete", jdbcType = JdbcType.INTEGER),
            @Result(column = "orderNum", property = "ordernum", jdbcType = JdbcType.DOUBLE),
            @Result(column = "creator", property = "creator", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_date", property = "createDate", jdbcType = JdbcType.VARCHAR),
            @Result(column = "modifier", property = "modifier", jdbcType = JdbcType.VARCHAR),
            @Result(column = "modify_date", property = "modifyDate", jdbcType = JdbcType.VARCHAR),
            @Result(column = "status", property = "status", jdbcType = JdbcType.INTEGER)
    })
    Menu selectByPrimaryKey(String id);

    @Select({
            "select",
            "id, name, en_name, description, parent_id, icon, url, target, publics, allow_edit, ",
            "allow_delete, orderNum, creator, create_date, modifier, modify_date, status",
            "from sys_menu",
            //"where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "en_name", property = "enName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "description", property = "description", jdbcType = JdbcType.VARCHAR),
            @Result(column = "parent_id", property = "parentId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "icon", property = "icon", jdbcType = JdbcType.VARCHAR),
            @Result(column = "url", property = "url", jdbcType = JdbcType.VARCHAR),
            @Result(column = "target", property = "target", jdbcType = JdbcType.VARCHAR),
            @Result(column = "publics", property = "publics", jdbcType = JdbcType.INTEGER),
            @Result(column = "allow_edit", property = "allowEdit", jdbcType = JdbcType.INTEGER),
            @Result(column = "allow_delete", property = "allowDelete", jdbcType = JdbcType.INTEGER),
            @Result(column = "orderNum", property = "ordernum", jdbcType = JdbcType.DOUBLE),
            @Result(column = "creator", property = "creator", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_date", property = "createDate", jdbcType = JdbcType.VARCHAR),
            @Result(column = "modifier", property = "modifier", jdbcType = JdbcType.VARCHAR),
            @Result(column = "modify_date", property = "modifyDate", jdbcType = JdbcType.VARCHAR),
            @Result(column = "status", property = "status", jdbcType = JdbcType.INTEGER)
    })
    List<Menu> selectAllNormal();


    @UpdateProvider(type = MenuSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Menu record);

    @Update({
            "update sys_menu",
            "set name = #{name,jdbcType=VARCHAR},",
            "en_name = #{enName,jdbcType=VARCHAR},",
            "description = #{description,jdbcType=VARCHAR},",
            "parent_id = #{parentId,jdbcType=VARCHAR},",
            "icon = #{icon,jdbcType=VARCHAR},",
            "url = #{url,jdbcType=VARCHAR},",
            "target = #{target,jdbcType=VARCHAR},",
            "publics = #{publics,jdbcType=INTEGER},",
            "allow_edit = #{allowEdit,jdbcType=INTEGER},",
            "allow_delete = #{allowDelete,jdbcType=INTEGER},",
            "orderNum = #{ordernum,jdbcType=DOUBLE},",
            "creator = #{creator,jdbcType=VARCHAR},",
            "create_date = #{createDate,jdbcType=VARCHAR},",
            "modifier = #{modifier,jdbcType=VARCHAR},",
            "modify_date = #{modifyDate,jdbcType=VARCHAR},",
            "status = #{status,jdbcType=INTEGER}",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Menu record);
}