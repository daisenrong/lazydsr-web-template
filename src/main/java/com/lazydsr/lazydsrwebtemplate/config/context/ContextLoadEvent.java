package com.lazydsr.lazydsrwebtemplate.config.context;

import com.lazydsr.lazydsrwebtemplate.config.datasource.DynamicDataSourceConfiguration;
import com.lazydsr.lazydsrwebtemplate.config.system.SystemInfoConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * ContextLoadEvent
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.config.content
 * Created by Lazy on 2018/3/8 20:36
 * Version: 0.1
 * Info: 容器加载事件
 */
@Component
@Slf4j
public class ContextLoadEvent implements ApplicationRunner {
    //@Autowired
    //private DynamicDataSourceConfiguration dynamicDataSourceConfiguration;

    /**
     * Callback used to run the bean.
     *
     * @param args incoming application arguments
     * @throws Exception on error
     */
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.error("多数据源加载开始");
        DynamicDataSourceConfiguration.getInstance().init();
        log.error("多数据源加载结束");

        log.error("加载系统基本信息开始");
        //该行代码报错的话，请检查一下系统中的库是不是存在
        SystemInfoConfiguration.getInstance().init();
        log.error("加载系统基本信息结束");
    }
}
