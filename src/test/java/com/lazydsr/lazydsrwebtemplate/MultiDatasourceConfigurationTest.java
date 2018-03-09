package com.lazydsr.lazydsrwebtemplate;

import com.lazydsr.lazydsrwebtemplate.config.datasource.DatabaseTypeEnum;
import com.lazydsr.lazydsrwebtemplate.config.datasource.MultiDatasourceConfiguration;
import com.lazydsr.lazydsrwebtemplate.entity.Datasource;
import com.lazydsr.lazydsrwebtemplate.repository.DatasourceRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.annotation.Target;

import static org.junit.Assert.*;

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
public class MultiDatasourceConfigurationTest {

    @Autowired
    private MultiDatasourceConfiguration configuration;
    @Autowired
    private DatasourceRepository datasourceRepository;

    @Test
    public void init() {
        boolean init = configuration.init();
        System.out.println(init);
    }

    @Test
    public void saveDatasource() {
        Datasource datasource = new Datasource();
        datasource.setName("test");
        datasource.setAddress("192.168.1.104");
        datasource.setDbname("develop");
        datasource.setDbtype(DatabaseTypeEnum.ORACLE.getDbType());
        datasource.setPassword("root");
        datasource.setUsername("root");
        datasource.setMinActive(5);
        datasource.setMaxActive(50);
        datasource.setProt("3306");
        datasourceRepository.save(datasource);
    }
}