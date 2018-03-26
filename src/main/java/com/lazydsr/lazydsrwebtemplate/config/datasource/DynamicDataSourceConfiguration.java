package com.lazydsr.lazydsrwebtemplate.config.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import com.lazydsr.lazydsrwebtemplate.entity.DataSourceInfo;
import com.lazydsr.lazydsrwebtemplate.mapper.DataSourceInfoMapper;
import com.lazydsr.lazydsrwebtemplate.propdomian.MainDataSourceInfo;
import com.lazydsr.lazydsrwebtemplate.util.SpringContextUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
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

@Slf4j
public class DynamicDataSourceConfiguration extends AbstractRoutingDataSource {

    private static DynamicDataSourceConfiguration instance;
    private static byte[] lock = new byte[0];
    private static Map<Object, Object> dataSourceMap = new HashMap<Object, Object>();


    public static synchronized DynamicDataSourceConfiguration getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new DynamicDataSourceConfiguration();
                }
            }
        }
        return instance;
    }

    public void init() throws SQLException {
        loadMainDataSourceInfo();
        setTargetDataSources(getDataSourceMap());
    }

    private void loadMainDataSourceInfo() {
        Connection connection = null;
        try {
            MainDataSourceInfo mainDataSourceInfo = SpringContextUtil.getBean(MainDataSourceInfo.class);
            DataSource dataSource = SpringContextUtil.getBean(DataSource.class);
            connection = dataSource.getConnection();
            DatabaseMetaData metaData = connection.getMetaData();
            mainDataSourceInfo.setDatabase(metaData.getDatabaseProductName());
            mainDataSourceInfo.setVersion(metaData.getDatabaseProductVersion());
            mainDataSourceInfo.setDriver(metaData.getDriverName());
            mainDataSourceInfo.setDriverVersion(metaData.getDriverVersion());
            //TODO:可能会有问题，后面在验证吧
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void setTargetDataSources(Map<Object, Object> targetDataSources) {

        dataSourceMap.putAll(targetDataSources);
        super.setTargetDataSources(targetDataSources);
        //重要的方法,一定要加上不然会出现动态添加数据源的时候无法生效的情况
        super.afterPropertiesSet();

    }

    public Map<Object, Object> getDataSourceMap() throws SQLException {
        Map<Object, Object> result = new HashMap<Object, Object>();
        //result.put("dataSource", SpringContextUtil.getBean("dataSource"));
        DataSourceInfoMapper dataSourceInfoMapper = SpringContextUtil.getBean(DataSourceInfoMapper.class);
        List<DataSourceInfo> dataSourcesListInfo = dataSourceInfoMapper.selectAllNormal();
        for (DataSourceInfo ds : dataSourcesListInfo) {
            result.put(ds.getName(), buildDatasource(ds));
        }
        return result;
    }

    public DataSource buildDatasource(DataSourceInfo dataSourceInfo) throws SQLException {
        //DruidDataSource druidDataSource = DruidDataSourceBuilder.create().build();
        DruidDataSource druidDataSource = new DruidDataSource();

        druidDataSource.setName(dataSourceInfo.getName());

        druidDataSource.setUrl(DataSourceUtil.getConnectUrl(dataSourceInfo.getDbtype(), dataSourceInfo.getAddress(), dataSourceInfo.getProt(), dataSourceInfo.getDbname(), "utf-8", false));
        druidDataSource.setUsername(dataSourceInfo.getUsername());
        druidDataSource.setPassword(dataSourceInfo.getPassword());
        druidDataSource.setDriverClassName(DatabaseTypeEnum.getDriverClassNameByDbType(dataSourceInfo.getDbtype()));
        druidDataSource.setInitialSize(dataSourceInfo.getMinActive());
        druidDataSource.setMaxActive(dataSourceInfo.getMaxActive());
        druidDataSource.setMinIdle(dataSourceInfo.getMinActive());


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

        druidDataSource.init();
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

        //return DataSourceContextHolder.getDataSourceType();
        return DataSourceContextHolder.getDataSourceType();
    }


}
