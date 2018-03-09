package com.lazydsr.lazydsrwebtemplate.config.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.lazydsr.lazydsrwebtemplate.base.STATICVALUE;
import com.lazydsr.lazydsrwebtemplate.entity.Datasource;
import com.lazydsr.lazydsrwebtemplate.service.DatasourceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MultiDatasourceConfiguration
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.config.datasource
 * Created by Lazy on 2018/3/8 20:41
 * Version: 0.1
 * Info: 多数据源配置
 */
@Component
@Slf4j
public class MultiDatasourceConfiguration extends AbstractRoutingDataSource {
    @Autowired
    private DatasourceService datasourceService;

    @Override
    public void afterPropertiesSet() {
        init();
        super.afterPropertiesSet();
    }

    public boolean init() {
        boolean result = true;
        List<Datasource> datasources = datasourceService.findByStatus(STATICVALUE.ENABLE);
        Map<Object, Object> datasourceMap = new HashMap<>();
        for (Datasource datasource : datasources) {
            try {
                DataSource newDataSource = initDatasource(datasource);
                //System.out.println(newDataSource);
                //Connection connection = newDataSource.getConnection();
                //PreparedStatement preparedStatement = connection.prepareStatement("SELECT 1 AS aa FROM dual");
                //ResultSet resultSet = preparedStatement.executeQuery();
                //if (resultSet.next()) {
                //    String aa = resultSet.getString("aa");
                //    System.out.println("aaaaaaaaaaaaaaaaaaa" + aa);
                //}
                datasourceMap.put(datasource.getName()+datasource.getDbtype(),newDataSource);
            } catch (Exception e) {
                log.error("数据源加载失败");
                result = false;
            }
        }
        this.setTargetDataSources(datasourceMap);
        return result;
    }

    //@ConfigurationProperties(prefix = "spring.datasource.other")
    public DataSource initDatasource(Datasource datasource) throws SQLException {
        DruidDataSource druidDataSource = DruidDataSourceBuilder.create().build();
        //DruidDataSource druidDataSource = new DruidDataSource();


        druidDataSource.setUrl(DatasourceUtil.getConnectUrl(datasource.getDbtype(), datasource.getAddress(), datasource.getProt(), datasource.getDbname(), "utf-8", false));
        druidDataSource.setUsername(datasource.getUsername());
        druidDataSource.setPassword(datasource.getPassword());
        druidDataSource.setDriverClassName(DatabaseTypeEnum.getDriverClassNameByDbType(datasource.getDbtype()));
        druidDataSource.setInitialSize(datasource.getMinActive());
        druidDataSource.setMaxActive(datasource.getMaxActive());
        druidDataSource.setMinIdle(datasource.getMinActive());


        druidDataSource.setMaxWait(60000);
        druidDataSource.setTimeBetweenEvictionRunsMillis(60000);
        druidDataSource.setMinEvictableIdleTimeMillis(300000);
        druidDataSource.setValidationQuery("SELECT 1 FROM dual");
        druidDataSource.setTestWhileIdle(true);
        druidDataSource.setTestOnBorrow(false);
        druidDataSource.setTestOnReturn(false);
        druidDataSource.setPoolPreparedStatements(true);
        druidDataSource.setMaxPoolPreparedStatementPerConnectionSize(20);
        druidDataSource.setFilters("stat,wall");

        return druidDataSource;
    }

    /**
     * Determine the current lookup key. This will typically be
     * implemented to check a thread-bound transaction context.
     * <p>Allows for arbitrary keys. The returned key needs
     * to match the stored lookup key type, as resolved by the
     * {@link #resolveSpecifiedLookupKey} method.
     */
    @Override
    protected Object determineCurrentLookupKey() {
        return null;
    }
}
