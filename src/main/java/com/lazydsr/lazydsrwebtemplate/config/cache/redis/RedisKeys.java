package com.lazydsr.lazydsrwebtemplate.config.cache.redis;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * RedisKeys
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.config.cache.redis
 * Created by Lazy on 2018/5/23 20:20
 * Version: 0.1
 * Info: @TODO:...
 */
@Component
public class RedisKeys {
    // 测试 begin
    public static final String _CACHE_KEY = "web_template";// 缓存key
    public static final Long _CACHE_EXPIRES_SECOND = 20L;// 缓存时间
    // 测试 end

    // 根据key设定具体的缓存时间
    private Map<String, Long> expiresMap = null;

    @PostConstruct
    public void init(){
        expiresMap = new HashMap<>();
        expiresMap.put(_CACHE_KEY, _CACHE_EXPIRES_SECOND);
    }

    public Map<String, Long> getExpiresMap(){
        return this.expiresMap;
    }
}
