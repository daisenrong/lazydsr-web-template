package com.lazydsr.lazydsrwebtemplate.config.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.lazydsr.lazydsrwebtemplate.base.STATICVALUE;
import com.lazydsr.lazydsrwebtemplate.entity.DataSourceInfo;
import com.lazydsr.lazydsrwebtemplate.service.DataSourceInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.*;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

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
public class DynamicDataSourceConfiguration_bak extends AbstractRoutingDataSource implements ApplicationContextAware {

    private static DynamicDataSourceConfiguration_bak instance;
    private static byte[] lock = new byte[0];
    private static Map<Object, Object> dataSourceMap = new HashMap<Object, Object>();

    private ApplicationContext applicationContext;
    @Autowired
    private DataSourceInfoService dataSourceInfoService;
    @Autowired
    private DefaultListableBeanFactory beanDefinitionRegistry;


    private Map<Object, Object> targetDataSources;


    public static synchronized DynamicDataSourceConfiguration_bak getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new DynamicDataSourceConfiguration_bak();
                }
            }
        }
        return instance;
    }


    //@Override
    //public void afterPropertiesSet() {
    //    getDataSourceMap();
    //    super.afterPropertiesSet();
    //}

    /**
     * Specify the map of target DataSources, with the lookup key as key.
     * The mapped value can either be a corresponding {@link javax.sql.DataSource}
     * instance or a data source name String (to be resolved via a
     * {@link #setDataSourceLookup DataSourceLookup}).
     * <p>The key can be of arbitrary type; this class implements the
     * generic lookup process only. The concrete key representation will
     * be handled by {@link #resolveSpecifiedLookupKey(Object)} and
     * {@link #determineCurrentLookupKey()}.
     *
     * @param targetDataSources
     */
    @Override
    public void setTargetDataSources(Map<Object, Object> targetDataSources) {
        log.error("111111111111111111");
        this.targetDataSources.putAll(getDataSourceMap());
        //dataSourceMap.putAll(targetDataSources);
        super.setTargetDataSources(targetDataSources);
        //重要的方法,一定要加上不然会出现动态添加数据源的时候无法生效的情况
        super.afterPropertiesSet();
        log.error("2222222222222222");
    }

    public Map<Object, Object> getDataSourceMap() {
        //获取数据库中的数据源信息
        List<DataSourceInfo> dataSourceInfos = dataSourceInfoService.findAllNormal();
        Map<Object, Object> dataSourceMap = new HashMap<>();
        for (DataSourceInfo dataSourceInfo : dataSourceInfos) {
            try {
                String dataSourceName = dataSourceInfo.getName() + "_DataSource";
                //javax.sql.DataSource buildDatasource = buildDatasource(dataSource);
                dataSourceMap.put(dataSourceName, dataSourceName);


                GenericBeanDefinition definition = new GenericBeanDefinition();
                definition.setBeanClass(DruidDataSource.class);    //设置类
                definition.setScope("singleton");       //设置scope
                definition.setLazyInit(false);          //设置是否懒加载
                definition.setAutowireCandidate(true);  //设置是否可以被其他对象自动注入

                //注入相应属性
                definition.setAttribute("name", dataSourceName);
                //definition.setAttribute("type",dataSource.getUsername());
                definition.setAttribute("driver-class-name", DatabaseTypeEnum.getDriverClassNameByDbType(dataSourceInfo.getDbtype()));
                definition.setAttribute("url", DataSourceUtil.getConnectUrl(dataSourceInfo.getDbtype(), dataSourceInfo.getAddress(), dataSourceInfo.getProt(), dataSourceInfo.getDbname(), "utf-8", false));
                definition.setAttribute("username", dataSourceInfo.getUsername());
                definition.setAttribute("password", dataSourceInfo.getPassword());
                definition.setAttribute("initialSize", dataSourceInfo.getMinActive());
                definition.setAttribute("minIdle", dataSourceInfo.getMinActive());
                definition.setAttribute("maxActive", dataSourceInfo.getMaxActive());


                definition.setAttribute("maxWait", 60000);
                definition.setAttribute("timeBetweenEvictionRunsMillis", 60000);
                definition.setAttribute("minEvictableIdleTimeMillis", 300000);
                definition.setAttribute("validationQuery", "SELECT 1 FROM dual");
                definition.setAttribute("testWhileIdle", true);
                definition.setAttribute("testOnBorrow", false);
                definition.setAttribute("testOnReturn", false);
                definition.setAttribute("poolPreparedStatements", true);
                definition.setAttribute("maxPoolPreparedStatementPerConnectionSize", 20);
                definition.setAttribute("filters", "stat,wall");
                definition.setAttribute("connectionProperties", "druid.stat.mergeSql=true;druid.stat.slowSqlMillis=5000");
                definition.setAttribute("useGlobalDataSourceStat", true);

                beanDefinitionRegistry.registerBeanDefinition(dataSourceName, definition);


            } catch (Exception e) {
                log.error("数据源加载失败");
            }
        }
        //super.setTargetDataSources(datasourceMap);
        return dataSourceMap;
    }

    //@ConfigurationProperties(prefix = "spring.datasource.other")
    public javax.sql.DataSource buildDatasource(DataSourceInfo dataSourceInfo) throws SQLException {
        DruidDataSource druidDataSource = DruidDataSourceBuilder.create().build();
        //DruidDataSource druidDataSource = new DruidDataSource();


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

    /**
     * Set the ApplicationContext that this object runs in.
     * Normally this call will be used to initialize the object.
     * <p>Invoked after population of normal bean properties but before an init callback such
     * as {@link InitializingBean#afterPropertiesSet()}
     * or a custom init-method. Invoked after {@link ResourceLoaderAware#setResourceLoader},
     * {@link ApplicationEventPublisherAware#setApplicationEventPublisher} and
     * {@link MessageSourceAware}, if applicable.
     *
     * @param applicationContext the ApplicationContext object to be used by this object
     * @throws ApplicationContextException in case of context initialization errors
     * @throws BeansException              if thrown by application context methods
     * @see BeanInitializationException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
