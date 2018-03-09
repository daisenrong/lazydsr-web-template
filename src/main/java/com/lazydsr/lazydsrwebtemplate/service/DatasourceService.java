package com.lazydsr.lazydsrwebtemplate.service;

import com.lazydsr.lazydsrwebtemplate.entity.Datasource;

import java.util.List;

/**
 * DatasourceService
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.service
 * Created by Lazy on 2018/3/9 21:54
 * Version: 0.1
 * Info: @TODO:...
 */
public interface DatasourceService {
    public List<Datasource> findAll();
    public List<Datasource> findByStatus(int status);
}
