package com.lazydsr.lazydsrwebtemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LazydsrWebTemplateApplication {
    //@Qualifier("dataSource")
    //@Autowired
    //private DataSource dataSource;

    public static void main(String[] args) {
        SpringApplication.run(LazydsrWebTemplateApplication.class, args);
        //主数据库首次初始化

    }
}
