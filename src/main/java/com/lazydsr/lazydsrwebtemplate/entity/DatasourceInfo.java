package com.lazydsr.lazydsrwebtemplate.entity;

import com.lazydsr.lazydsrwebtemplate.base.STATICVALUE;
import com.lazydsr.util.time.UtilDateTime;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * DatasourceInfo
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.entity
 * Created by Lazy on 2018/3/8 20:58
 * Version: 0.1
 * Info: 数据库配置信息实体
 */
@Entity
@Table
@Data
public class DatasourceInfo {
    @Id
    @GenericGenerator(name="Custom_UUID", strategy="com.lazydsr.commons.util.CustomIdentifierGenerator")
    @GeneratedValue(generator="Custom_UUID")
    @Column(length = 32)
    private String id;
    @Column(nullable = false,unique = true)
    private String name;
    private String url;
    private String username;
    private String password;
    private int minActive;
    private int maxActive;

    private int status=STATICVALUE.ENABLE;


    private String creator;
    private String createDate= UtilDateTime.getCurrDateTime();
    private String modifier;
    private String modifyDate=UtilDateTime.getCurrDateTime();
    private int dataStatus= STATICVALUE.ENABLE;

}
