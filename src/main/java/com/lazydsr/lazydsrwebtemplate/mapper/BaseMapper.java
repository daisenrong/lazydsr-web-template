package com.lazydsr.lazydsrwebtemplate.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * BaseMapper
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.mapper
 * Created by Lazy on 2018/3/31 23:37
 * Version: 0.1
 * Info: @TODO:...
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
