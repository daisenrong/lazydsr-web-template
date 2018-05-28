package com.lazydsr.lazydsrwebtemplate.service.impl;

import com.lazydsr.lazydsrwebtemplate.config.cache.redis.RedisService;
import com.lazydsr.lazydsrwebtemplate.entity.DataSourceInfo;
import com.lazydsr.lazydsrwebtemplate.mapper.DataSourceInfoMapper;
import com.lazydsr.lazydsrwebtemplate.service.DataSourceInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
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
@Slf4j
public class DataSourceInfoServiceImpl implements DataSourceInfoService {
    private static final String prefix = "dataSourceInfo";
    @Autowired
    private DataSourceInfoMapper dataSourceInfoMapper;
    @Autowired
    private RedisService redisService;

    @Override
    public DataSourceInfo add(DataSourceInfo dataSourceInfo) {
        int count = dataSourceInfoMapper.insert(dataSourceInfo);
        return dataSourceInfoMapper.selectByPrimaryKey(dataSourceInfo.getId());
    }

    @Override
    @CacheEvict
    public int delete(String id) {
        return dataSourceInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public DataSourceInfo update(DataSourceInfo dataSourceInfo) {
        int count = dataSourceInfoMapper.updateByPrimaryKey(dataSourceInfo);
        return dataSourceInfoMapper.selectByPrimaryKey(dataSourceInfo.getId());
    }

    @Override
    @Cacheable(cacheNames = prefix, key = "#id")
    public DataSourceInfo findById(String id) {
        return dataSourceInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<DataSourceInfo> findAll() {
        List<DataSourceInfo> list = redisService.getList(prefix + "::findAll", 0, -1);

        if (list == null) {
            log.info("缓存数据获取失败，加载到缓存");
            list = dataSourceInfoMapper.selectAllNormal();
            redisService.setList(prefix + "::findAll", list);
        }

        return list;
    }

    @Override
    public List<DataSourceInfo> findAllNormal() {

        List<DataSourceInfo> list = redisService.getList(prefix + "::findAllNormal", 0, -1);

        if (list == null) {
            log.error("缓存数据获取失败，加载到缓存");
            list = dataSourceInfoMapper.selectAllNormal();
            if (list != null)
                redisService.setList(prefix + "::findAllNormal", list);
        }

        return list;
    }


}
