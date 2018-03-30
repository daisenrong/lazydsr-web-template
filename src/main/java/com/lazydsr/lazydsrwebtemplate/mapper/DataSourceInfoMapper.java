package com.lazydsr.lazydsrwebtemplate.mapper;

import com.lazydsr.lazydsrwebtemplate.entity.DataSourceInfo;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;
@Mapper
public interface DataSourceInfoMapper {
    @Delete({
            "delete from sys_datasourceinfo",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
            "insert into sys_datasourceinfo (id, name, ",
            "dbtype, address, ",
            "prot, dbname, username, ",
            "password, min_active, ",
            "max_active, creator, ",
            "create_date, modifier, ",
            "modify_date, status)",
            "values (#{id,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
            "#{dbtype,jdbcType=VARCHAR}, #{address,jdbcType=VARCHAR}, ",
            "#{prot,jdbcType=VARCHAR}, #{dbname,jdbcType=VARCHAR}, #{username,jdbcType=VARCHAR}, ",
            "#{password,jdbcType=VARCHAR}, #{minActive,jdbcType=INTEGER}, ",
            "#{maxActive,jdbcType=INTEGER}, #{creator,jdbcType=VARCHAR}, ",
            "#{createDate,jdbcType=VARCHAR}, #{modifier,jdbcType=VARCHAR}, ",
            "#{modifyDate,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER})"
    })
    int insert(DataSourceInfo record);

    @InsertProvider(type = DataSourceInfoSqlProvider.class, method = "insertSelective")
    int insertSelective(DataSourceInfo record);

    @Select({
            "select",
            "id, name, dbtype, address, prot, dbname, username, password, min_active, max_active, ",
            "creator, create_date, modifier, modify_date, status",
            "from sys_datasourceinfo",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "dbtype", property = "dbtype", jdbcType = JdbcType.VARCHAR),
            @Result(column = "address", property = "address", jdbcType = JdbcType.VARCHAR),
            @Result(column = "prot", property = "prot", jdbcType = JdbcType.VARCHAR),
            @Result(column = "dbname", property = "dbname", jdbcType = JdbcType.VARCHAR),
            @Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR),
            @Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
            @Result(column = "min_active", property = "minActive", jdbcType = JdbcType.INTEGER),
            @Result(column = "max_active", property = "maxActive", jdbcType = JdbcType.INTEGER),
            @Result(column = "creator", property = "creator", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_date", property = "createDate", jdbcType = JdbcType.VARCHAR),
            @Result(column = "modifier", property = "modifier", jdbcType = JdbcType.VARCHAR),
            @Result(column = "modify_date", property = "modifyDate", jdbcType = JdbcType.VARCHAR),
            @Result(column = "status", property = "status", jdbcType = JdbcType.INTEGER)
    })
    DataSourceInfo selectByPrimaryKey(String id);

    @Select({
            "select",
            "id, name, dbtype, address, prot, dbname, username, password, min_active, max_active, ",
            "creator, create_date, modifier, modify_date, status",
            "from sys_datasourceinfo"
            //"where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "dbtype", property = "dbtype", jdbcType = JdbcType.VARCHAR),
            @Result(column = "address", property = "address", jdbcType = JdbcType.VARCHAR),
            @Result(column = "prot", property = "prot", jdbcType = JdbcType.VARCHAR),
            @Result(column = "dbname", property = "dbname", jdbcType = JdbcType.VARCHAR),
            @Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR),
            @Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
            @Result(column = "min_active", property = "minActive", jdbcType = JdbcType.INTEGER),
            @Result(column = "max_active", property = "maxActive", jdbcType = JdbcType.INTEGER),
            @Result(column = "creator", property = "creator", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_date", property = "createDate", jdbcType = JdbcType.VARCHAR),
            @Result(column = "modifier", property = "modifier", jdbcType = JdbcType.VARCHAR),
            @Result(column = "modify_date", property = "modifyDate", jdbcType = JdbcType.VARCHAR),
            @Result(column = "status", property = "status", jdbcType = JdbcType.INTEGER)
    })
    List<DataSourceInfo> selectAll();

    @Select({
            "select",
            "id, name, dbtype, address, prot, dbname, username, password, min_active, max_active, ",
            "creator, create_date, modifier, modify_date, status",
            "from sys_datasourceinfo",
            "where status = 0"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "dbtype", property = "dbtype", jdbcType = JdbcType.VARCHAR),
            @Result(column = "address", property = "address", jdbcType = JdbcType.VARCHAR),
            @Result(column = "prot", property = "prot", jdbcType = JdbcType.VARCHAR),
            @Result(column = "dbname", property = "dbname", jdbcType = JdbcType.VARCHAR),
            @Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR),
            @Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
            @Result(column = "min_active", property = "minActive", jdbcType = JdbcType.INTEGER),
            @Result(column = "max_active", property = "maxActive", jdbcType = JdbcType.INTEGER),
            @Result(column = "creator", property = "creator", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_date", property = "createDate", jdbcType = JdbcType.VARCHAR),
            @Result(column = "modifier", property = "modifier", jdbcType = JdbcType.VARCHAR),
            @Result(column = "modify_date", property = "modifyDate", jdbcType = JdbcType.VARCHAR),
            @Result(column = "status", property = "status", jdbcType = JdbcType.INTEGER)
    })
    List<DataSourceInfo> selectAllNormal();

    @UpdateProvider(type = DataSourceInfoSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DataSourceInfo record);

    @Update({
            "update sys_datasourceinfo",
            "set name = #{name,jdbcType=VARCHAR},",
            "dbtype = #{dbtype,jdbcType=VARCHAR},",
            "address = #{address,jdbcType=VARCHAR},",
            "prot = #{prot,jdbcType=VARCHAR},",
            "dbname = #{dbname,jdbcType=VARCHAR},",
            "username = #{username,jdbcType=VARCHAR},",
            "password = #{password,jdbcType=VARCHAR},",
            "min_active = #{minActive,jdbcType=INTEGER},",
            "max_active = #{maxActive,jdbcType=INTEGER},",
            "creator = #{creator,jdbcType=VARCHAR},",
            "create_date = #{createDate,jdbcType=VARCHAR},",
            "modifier = #{modifier,jdbcType=VARCHAR},",
            "modify_date = #{modifyDate,jdbcType=VARCHAR},",
            "status = #{status,jdbcType=INTEGER}",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(DataSourceInfo record);
}