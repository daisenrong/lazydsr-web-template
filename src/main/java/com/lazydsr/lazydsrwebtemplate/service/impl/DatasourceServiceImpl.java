package com.lazydsr.lazydsrwebtemplate.service.impl;

import com.lazydsr.lazydsrwebtemplate.entity.Datasource;
import com.lazydsr.lazydsrwebtemplate.repository.DatasourceRepository;
import com.lazydsr.lazydsrwebtemplate.service.DatasourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * DatasourceInfoServiceImpl
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.service.impl
 * Created by Lazy on 2018/3/9 21:55
 * Version: 0.1
 * Info: @TODO:...
 */
@Service
public class DatasourceServiceImpl implements DatasourceService {
    @Autowired
    private DatasourceRepository datasourceRepository;

    @Override
    public List<Datasource> findAll() {
        List<Datasource> datasources = datasourceRepository.findAll();
        return datasources;
    }

    @Override
    public List<Datasource> findByStatus(int status) {
        List<Datasource> datasources = datasourceRepository.findByStatus(status);
        return datasources;
    }
}
