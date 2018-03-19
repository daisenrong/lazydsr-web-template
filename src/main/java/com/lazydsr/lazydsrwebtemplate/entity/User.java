package com.lazydsr.lazydsrwebtemplate.entity;

import com.lazydsr.lazydsrwebtemplate.base.STATICVALUE;
import com.lazydsr.util.time.UtilDateTime;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


/**
 * User
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.entity
 * Created by Lazy on 2018/3/5 22:23
 * Version: 0.1
 * Info: @TODO:...
 */
@Entity
@Data
@Table(name = "sysUser")
public class User {
    @Id
    @GenericGenerator(name = "Custom_UUID", strategy = "com.lazydsr.commons.util.CustomIdentifierGenerator")
    @GeneratedValue(generator = "Custom_UUID")
    @Column(length = 32)
    private String id;
    @Column(length = 100, nullable = false)
    private String name;
    /**
     * 用户名
     */
    @Column(name = "username", unique = true)
    private String username;
    /**
     * 密码
     */
    @Column(length = 100)
    private String password;
    /**
     * 编号
     */
    @Column(name = "workcode", unique = true)
    String workcode;
    /**
     * 密码连续输入错误次数
     */
    @Column(name = "sumpasswordwrong")
    int sumpasswordwrong = 0;
    /**
     * 密码锁定标记
     */
    @Column(name = "passwordlock")
    int passwordlock = 1;
    /**
     * 旧密码1
     */
    String oldpassword1;
    /**
     * 旧密码2
     */
    String oldpassword2;

    /**
     * 邮箱
     */
    String email;
    /**
     * 手机
     */
    String mobile;
    /**
     * 座机
     */
    String telphone;
    /**
     * 组织
     */
    String organization;
    /**
     * 公司
     */
    String company;
    /**
     * 部门
     */
    String department;
    /**
     * 身份证
     */
    String idcard;
    /**
     * 本次登录时间
     */
    @Column(name = "currentlogindate", length = 19)
    private String currentLoginDate;
    /**
     * 最后登录时间
     */
    @Column(name = "lastlogindate", length = 19)
    private String lastLoginDate;
    /**
     * 排序
     */
    @Column(name = "ordernum")
    double ordernum = 1000;
    /**
     * 账号类型
     */
    @Column(name = "accounttype")
    int accounttype;


    /**
     * 状态
     * 0  启用
     * 1  禁用
     */
    private int status = STATICVALUE.ENABLE;
    /**
     * 创建人
     */
    private String creator;
    @Column(length = 19)
    /**
     * 创建时间
     */
    private String createDate = UtilDateTime.getCurrDateTime();
    /**
     * 最后修改人
     */
    private String modifier;
    /**
     * 最后修改时间
     */
    @Column(length = 19)
    private String modifyDate = UtilDateTime.getCurrDateTime();
    /**
     * 数据状态
     * 0 为正常
     * 1 为删除
     */
    @Column(name = "dataStatus")
    private int dataStatus = STATICVALUE.ENABLE;

}
