package com.lazydsr.lazydsrwebtemplate;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

@SpringBootApplication
@Slf4j
public class LazydsrWebTemplateApplication {
    //@Qualifier("dataSource")
    //@Autowired
    //private DataSource dataSource;

    public static void main(String[] args) {
        log.error("应用启动开始。。。。。。。。。。");
        SpringApplication.run(LazydsrWebTemplateApplication.class, args);
        log.error("应用启动结束。。。。。。。。。。");

    }


}
