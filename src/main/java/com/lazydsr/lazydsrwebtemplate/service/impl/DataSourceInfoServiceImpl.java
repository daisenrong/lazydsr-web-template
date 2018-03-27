package com.lazydsr.lazydsrwebtemplate.service.impl;

import com.lazydsr.lazydsrwebtemplate.entity.DataSourceInfo;
import com.lazydsr.lazydsrwebtemplate.mapper.DataSourceInfoMapper;
import com.lazydsr.lazydsrwebtemplate.service.DataSourceInfoService;
import com.lazydsr.util.id.UtilUUId;
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
public class DataSourceInfoServiceImpl implements DataSourceInfoService {
    @Autowired
    private DataSourceInfoMapper dataSourceInfoMapper;

    @Override
    public DataSourceInfo add(DataSourceInfo dataSourceInfo) {
        if (dataSourceInfo.getId() == null)
            dataSourceInfo.setId(UtilUUId.getId());
        int count = dataSourceInfoMapper.insert(dataSourceInfo);
        return dataSourceInfoMapper.selectByPrimaryKey(dataSourceInfo.getId());
    }

    @Override
    public int delete(String id) {
        return dataSourceInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public DataSourceInfo update(DataSourceInfo dataSourceInfo) {
        int count = dataSourceInfoMapper.updateByPrimaryKey(dataSourceInfo);
        return dataSourceInfoMapper.selectByPrimaryKey(dataSourceInfo.getId());
    }

    @Override
    public DataSourceInfo findById(String id) {
        return dataSourceInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<DataSourceInfo> findAll() {
        List<DataSourceInfo> dataSourceInfos = dataSourceInfoMapper.selectAll();
        return dataSourceInfos;
    }

    @Override
    public List<DataSourceInfo> findAllNormal() {
        return dataSourceInfoMapper.selectAllNormal();
    }


}
