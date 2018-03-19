package com.lazydsr.lazydsrwebtemplate.entity;

import com.lazydsr.lazydsrwebtemplate.base.STATICVALUE;
import com.lazydsr.lazydsrwebtemplate.config.datasource.DatabaseTypeEnum;
import com.lazydsr.util.time.UtilDateTime;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Datasource
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.entity
 * Created by Lazy on 2018/3/8 20:58
 * Version: 0.1
 * Info: 数据库配置信息实体
 */
@Entity
@Table(name = "sysDatasourceinfo")
@Data
public class DataSourceInfo {
    @Id
    @GenericGenerator(name = "Custom_UUID", strategy = "com.lazydsr.commons.util.CustomIdentifierGenerator")
    @GeneratedValue(generator = "Custom_UUID")
    @Column(length = 32)
    private String id;
    /**
     * 数据源名称
     */
    @Column(nullable = false)
    private String name;
    /**
     * 数据库类型
     */
    @Column(nullable = false)
    private String dbtype;
    /**
     * 数据库服务器地址
     */
    @Column(nullable = false)
    private String address;
    /**
     * 数据库端口
     */
    @Column(nullable = false)
    private String prot;
    /**
     * 数据库名称
     */
    @Column(nullable = false)
    private String dbname;
    /**
     * 连接用户名
     */
    @Column(nullable = false)
    private String username;
    /**
     * 连接密码
     */
    @Column(nullable = false)
    private String password;
    /**
     * 最小连接数
     */
    @Column(nullable = false)
    private int minActive;
    /**
     * 最大连接数
     */
    @Column(nullable = false)
    private int maxActive;



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
