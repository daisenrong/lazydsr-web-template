package com.lazydsr.lazydsrwebtemplate;

import com.alibaba.druid.pool.DruidDataSource;
import com.lazydsr.lazydsrwebtemplate.config.datasource.DatabaseTypeEnum;
import com.lazydsr.lazydsrwebtemplate.config.datasource.DynamicDataSourceConfiguration;
import com.lazydsr.lazydsrwebtemplate.entity.DataSourceInfo;
import com.lazydsr.lazydsrwebtemplate.repository.DataSourceInfoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.sql.SQLException;

/**
 * MultiDatasourceConfigurationTest
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate
 * Created by Lazy on 2018/3/9 22:56
 * Version: 0.1
 * Info: @TODO:...
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MultiDataSourceInfoConfigurationTest {

    @Autowired
    private DynamicDataSourceConfiguration configuration;
    @Autowired
    private DataSourceInfoRepository dataSourceInfoRepository;

    @Test
    public void init() {
        //boolean init = configuration.setTargetDataSources(configuratio);
        //System.out.println(init);
    }

    @Test
    public void saveDatasource() {
        DataSourceInfo dataSourceInfo = new DataSourceInfo();
        dataSourceInfo.setName("test");
        dataSourceInfo.setAddress("192.168.1.104");
        dataSourceInfo.setDbname("develop");
        dataSourceInfo.setDbtype(DatabaseTypeEnum.ORACLE.getDbType());
        dataSourceInfo.setPassword("root");
        dataSourceInfo.setUsername("root");
        dataSourceInfo.setMinActive(5);
        dataSourceInfo.setMaxActive(50);
        dataSourceInfo.setProt("3306");
        dataSourceInfoRepository.save(dataSourceInfo);
    }
    @Resource
    private DruidDataSource dataSource;
    @Test
    public void testOtherDatasource() throws SQLException {
        dataSource.getConnection();
    }
}