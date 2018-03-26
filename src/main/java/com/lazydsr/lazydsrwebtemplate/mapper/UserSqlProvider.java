package com.lazydsr.lazydsrwebtemplate.mapper;

import com.lazydsr.lazydsrwebtemplate.entity.User;
import org.apache.ibatis.jdbc.SQL;

public class UserSqlProvider {

    public String insertSelective(User record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sys_user");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getUsername() != null) {
            sql.VALUES("username", "#{username,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.VALUES("password", "#{password,jdbcType=VARCHAR}");
        }
        
        if (record.getWorkcode() != null) {
            sql.VALUES("workcode", "#{workcode,jdbcType=VARCHAR}");
        }
        
        if (record.getSumPasswordWrong() != null) {
            sql.VALUES("sum_password_wrong", "#{sumPasswordWrong,jdbcType=INTEGER}");
        }
        
        if (record.getPasswordLock() != null) {
            sql.VALUES("password_lock", "#{passwordLock,jdbcType=INTEGER}");
        }
        
        if (record.getOldPassword1() != null) {
            sql.VALUES("old_password1", "#{oldPassword1,jdbcType=VARCHAR}");
        }
        
        if (record.getOldPassword2() != null) {
            sql.VALUES("old_password2", "#{oldPassword2,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.VALUES("email", "#{email,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            sql.VALUES("mobile", "#{mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getTelphone() != null) {
            sql.VALUES("telphone", "#{telphone,jdbcType=VARCHAR}");
        }
        
        if (record.getOrganization() != null) {
            sql.VALUES("organization", "#{organization,jdbcType=VARCHAR}");
        }
        
        if (record.getCompany() != null) {
            sql.VALUES("company", "#{company,jdbcType=VARCHAR}");
        }
        
        if (record.getDepartment() != null) {
            sql.VALUES("department", "#{department,jdbcType=VARCHAR}");
        }
        
        if (record.getIdCard() != null) {
            sql.VALUES("id_card", "#{idCard,jdbcType=VARCHAR}");
        }
        
        if (record.getCurrentLoginDate() != null) {
            sql.VALUES("current_login_date", "#{currentLoginDate,jdbcType=VARCHAR}");
        }
        
        if (record.getLastLoginDate() != null) {
            sql.VALUES("last_login_date", "#{lastLoginDate,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderNum() != null) {
            sql.VALUES("order_num", "#{orderNum,jdbcType=DOUBLE}");
        }
        
        if (record.getAccountType() != null) {
            sql.VALUES("account_type", "#{accountType,jdbcType=INTEGER}");
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

    public String updateByPrimaryKeySelective(User record) {
        SQL sql = new SQL();
        sql.UPDATE("sys_user");
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getUsername() != null) {
            sql.SET("username = #{username,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.SET("password = #{password,jdbcType=VARCHAR}");
        }
        
        if (record.getWorkcode() != null) {
            sql.SET("workcode = #{workcode,jdbcType=VARCHAR}");
        }
        
        if (record.getSumPasswordWrong() != null) {
            sql.SET("sum_password_wrong = #{sumPasswordWrong,jdbcType=INTEGER}");
        }
        
        if (record.getPasswordLock() != null) {
            sql.SET("password_lock = #{passwordLock,jdbcType=INTEGER}");
        }
        
        if (record.getOldPassword1() != null) {
            sql.SET("old_password1 = #{oldPassword1,jdbcType=VARCHAR}");
        }
        
        if (record.getOldPassword2() != null) {
            sql.SET("old_password2 = #{oldPassword2,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("email = #{email,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            sql.SET("mobile = #{mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getTelphone() != null) {
            sql.SET("telphone = #{telphone,jdbcType=VARCHAR}");
        }
        
        if (record.getOrganization() != null) {
            sql.SET("organization = #{organization,jdbcType=VARCHAR}");
        }
        
        if (record.getCompany() != null) {
            sql.SET("company = #{company,jdbcType=VARCHAR}");
        }
        
        if (record.getDepartment() != null) {
            sql.SET("department = #{department,jdbcType=VARCHAR}");
        }
        
        if (record.getIdCard() != null) {
            sql.SET("id_card = #{idCard,jdbcType=VARCHAR}");
        }
        
        if (record.getCurrentLoginDate() != null) {
            sql.SET("current_login_date = #{currentLoginDate,jdbcType=VARCHAR}");
        }
        
        if (record.getLastLoginDate() != null) {
            sql.SET("last_login_date = #{lastLoginDate,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderNum() != null) {
            sql.SET("order_num = #{orderNum,jdbcType=DOUBLE}");
        }
        
        if (record.getAccountType() != null) {
            sql.SET("account_type = #{accountType,jdbcType=INTEGER}");
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