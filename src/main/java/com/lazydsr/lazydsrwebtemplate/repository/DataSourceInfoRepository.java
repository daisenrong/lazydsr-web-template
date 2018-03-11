package com.lazydsr.lazydsrwebtemplate.repository;

import com.lazydsr.lazydsrwebtemplate.entity.DataSourceInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * DatasourceRepository
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.repository
 * Created by Lazy on 2018/3/8 23:11
 * Version: 0.1
 * Info: @TODO:...
 */
public interface DataSourceInfoRepository extends JpaRepository<DataSourceInfo,String>{
    public List<DataSourceInfo> findByStatus(int status);
}
