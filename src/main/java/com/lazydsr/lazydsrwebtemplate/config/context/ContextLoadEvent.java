package com.lazydsr.lazydsrwebtemplate.config.context;

import com.lazydsr.lazydsrwebtemplate.config.datasource.MultiDatasourceConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private MultiDatasourceConfiguration multiDatasourceConfiguration;

    /**
     * Callback used to run the bean.
     *
     * @param args incoming application arguments
     * @throws Exception on error
     */
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.error("多数据源加载开始");
        boolean initResult = multiDatasourceConfiguration.init();
        if (initResult) {
            log.error("多数据源加载成功");
        } else {
            log.error("多数据源加载失败");
        }
        log.error("多数据源加载结束");
    }
}
