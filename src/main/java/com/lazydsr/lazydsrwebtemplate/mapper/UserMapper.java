package com.lazydsr.lazydsrwebtemplate.mapper;

import com.lazydsr.lazydsrwebtemplate.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface UserMapper {
    @Delete({
        "delete from sys_user",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into sys_user (id, name, ",
        "username, password, ",
        "workcode, sum_password_wrong, ",
        "password_lock, old_password1, ",
        "old_password2, email, ",
        "mobile, telphone, ",
        "organization, company, ",
        "department, id_card, ",
        "current_login_date, last_login_date, ",
        "order_num, account_type, ",
        "creator, create_date, ",
        "modifier, modify_date, ",
        "status)",
        "values (#{id,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{username,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{workcode,jdbcType=VARCHAR}, #{sumPasswordWrong,jdbcType=INTEGER}, ",
        "#{passwordLock,jdbcType=INTEGER}, #{oldPassword1,jdbcType=VARCHAR}, ",
        "#{oldPassword2,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, ",
        "#{mobile,jdbcType=VARCHAR}, #{telphone,jdbcType=VARCHAR}, ",
        "#{organization,jdbcType=VARCHAR}, #{company,jdbcType=VARCHAR}, ",
        "#{department,jdbcType=VARCHAR}, #{idCard,jdbcType=VARCHAR}, ",
        "#{currentLoginDate,jdbcType=VARCHAR}, #{lastLoginDate,jdbcType=VARCHAR}, ",
        "#{orderNum,jdbcType=DOUBLE}, #{accountType,jdbcType=INTEGER}, ",
        "#{creator,jdbcType=VARCHAR}, #{createDate,jdbcType=VARCHAR}, ",
        "#{modifier,jdbcType=VARCHAR}, #{modifyDate,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=INTEGER})"
    })
    int insert(User record);

    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    int insertSelective(User record);

    @Select({
        "select",
        "id, name, username, password, workcode, sum_password_wrong, password_lock, old_password1, ",
        "old_password2, email, mobile, telphone, organization, company, department, id_card, ",
        "current_login_date, last_login_date, order_num, account_type, creator, create_date, ",
        "modifier, modify_date, status",
        "from sys_user",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="workcode", property="workcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="sum_password_wrong", property="sumPasswordWrong", jdbcType=JdbcType.INTEGER),
        @Result(column="password_lock", property="passwordLock", jdbcType=JdbcType.INTEGER),
        @Result(column="old_password1", property="oldPassword1", jdbcType=JdbcType.VARCHAR),
        @Result(column="old_password2", property="oldPassword2", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="telphone", property="telphone", jdbcType=JdbcType.VARCHAR),
        @Result(column="organization", property="organization", jdbcType=JdbcType.VARCHAR),
        @Result(column="company", property="company", jdbcType=JdbcType.VARCHAR),
        @Result(column="department", property="department", jdbcType=JdbcType.VARCHAR),
        @Result(column="id_card", property="idCard", jdbcType=JdbcType.VARCHAR),
        @Result(column="current_login_date", property="currentLoginDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_login_date", property="lastLoginDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_num", property="orderNum", jdbcType=JdbcType.DOUBLE),
        @Result(column="account_type", property="accountType", jdbcType=JdbcType.INTEGER),
        @Result(column="creator", property="creator", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="modifier", property="modifier", jdbcType=JdbcType.VARCHAR),
        @Result(column="modify_date", property="modifyDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER)
    })
    User selectByPrimaryKey(String id);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    @Update({
        "update sys_user",
        "set name = #{name,jdbcType=VARCHAR},",
          "username = #{username,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "workcode = #{workcode,jdbcType=VARCHAR},",
          "sum_password_wrong = #{sumPasswordWrong,jdbcType=INTEGER},",
          "password_lock = #{passwordLock,jdbcType=INTEGER},",
          "old_password1 = #{oldPassword1,jdbcType=VARCHAR},",
          "old_password2 = #{oldPassword2,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "mobile = #{mobile,jdbcType=VARCHAR},",
          "telphone = #{telphone,jdbcType=VARCHAR},",
          "organization = #{organization,jdbcType=VARCHAR},",
          "company = #{company,jdbcType=VARCHAR},",
          "department = #{department,jdbcType=VARCHAR},",
          "id_card = #{idCard,jdbcType=VARCHAR},",
          "current_login_date = #{currentLoginDate,jdbcType=VARCHAR},",
          "last_login_date = #{lastLoginDate,jdbcType=VARCHAR},",
          "order_num = #{orderNum,jdbcType=DOUBLE},",
          "account_type = #{accountType,jdbcType=INTEGER},",
          "creator = #{creator,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=VARCHAR},",
          "modifier = #{modifier,jdbcType=VARCHAR},",
          "modify_date = #{modifyDate,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(User record);
}