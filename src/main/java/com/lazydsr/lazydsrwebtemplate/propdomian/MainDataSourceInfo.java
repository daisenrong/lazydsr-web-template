package com.lazydsr.lazydsrwebtemplate.propdomian;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * MainDataSourceInfo
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.domain
 * Created by Lazy on 2018/3/18 3:25
 * Version: 0.1
 * Info: @TODO:...
 */
@Component
@Data
@ConfigurationProperties(prefix = "spring.datasource.druid")
public class MainDataSourceInfo {

    //数据库
    private String database;
    //数据库版本
    private String version;
    //驱动
    private String driver;
    //驱动版本
    private String driverVersion;
    //连接url
    private String url;
    //用户
    private String username;


    //数据源类型
    private String type;

    //最小连接数
    private int minIdle;
    //最大连接数
    private int maxActive;


}
