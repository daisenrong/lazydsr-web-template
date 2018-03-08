package com.lazydsr.lazydsrwebtemplate.config.datasource;


import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.sql.SQLException;

//import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;

/**
 * DruidConfiguration
 * PROJECT_NAME: lazy-web
 * PACKAGE_NAME: com.lazy.web.config
 * Created by Lazy on 2017/9/28 17:16
 * Version: 1.0
 * Info: Druid数据源设置--主数据源
 */
@Configuration
@Slf4j
public class DruidConfiguration {
    //@Primary
    //@Bean
    //@ConfigurationProperties("spring.datasource.druid")
    //public DataSource dataSourceOne(){
    //    return DruidDataSourceBuilder.create().build();
    //}
    //@Bean
    //@ConfigurationProperties("spring.datasource.druid.two")
    //public DataSource dataSourceTwo(){
    //    return DruidDataSourceBuilder.create().build();
    //}
    ////绑定application.properties的spring.druid的属性为datasource
    //@ConfigurationProperties(prefix = "spring.druid")
    //@Bean(initMethod = "init",destroyMethod = "close")
    //public DruidDataSource dataSource(){
    //    DruidDataSource druidDataSource = new DruidDataSource();
    //    druidDataSource.setProxyFilters(Lists.newArrayList(statFilter()));
    //    return druidDataSource;
    //}
    ////慢日志输出
    //@Bean
    //public Filter statFilter(){
    //    StatFilter statFilter = new StatFilter();
    //    statFilter.setSlowSqlMillis(1);
    //    statFilter.setLogSlowSql(true);
    //    statFilter.setMergeSql(true);
    //    return statFilter;
    //}
    ////监控:localhost:8080/druid
    //@Bean
    //public ServletRegistrationBean servletRegistrationBean(){
    //    return new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
    //}
    @Bean(name = "dataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.druid")
    public DataSource dataSource() throws SQLException {
        //DruidDataSource dataSource = DruidDataSourceBuilder.create().build();
        //dataSource.init();
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    public ServletRegistrationBean statViewServlet() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        //白名单：
        servletRegistrationBean.addInitParameter("allow", "172.25.1.233,172.25.80.36,127.0.0.1");
        //IP黑名单 (存在共同时，deny优先于allow) : 如果满足deny的即提示:Sorry, you are not permitted to view this page.
        servletRegistrationBean.addInitParameter("deny", "192.168.1.100");
        //登录查看信息的账号密码.
        servletRegistrationBean.addInitParameter("loginUsername", "druid");
        servletRegistrationBean.addInitParameter("loginPassword", "12345678");
        //是否能够重置数据.
        servletRegistrationBean.addInitParameter("resetEnable", "false");
        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean statFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
        //添加过滤规则.
        filterRegistrationBean.addUrlPatterns("/*");
        //添加不需要忽略的格式信息.
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }
}
