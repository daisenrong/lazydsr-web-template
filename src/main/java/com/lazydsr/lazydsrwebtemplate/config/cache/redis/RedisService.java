package com.lazydsr.lazydsrwebtemplate.config.cache.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * UtilRedis
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.util
 * Created by Lazy on 2018/5/19 17:34
 * Version: 0.1
 * Info: redis操作service
 */
@Service
public class RedisService<T> {
    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 写入缓存
     *
     * @param key   key
     * @param value value
     * @return result
     */
    public boolean set(final String key, Object value) {
        boolean result = false;
        try {
            ValueOperations<String, Object> operations = redisTemplate.opsForValue();
            operations.set(key, value);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
        //设置默认1天的过期时间
        //return set(key, value, 60 * 60 * 24 * 1L);
    }

    /**
     * 写入缓存设置时效时间
     *
     * @param key   key
     * @param value value
     * @return result
     */
    public boolean set(final String key, Object value, Long expireTime) {
        boolean result = false;
        try {
            ValueOperations<String, Object> operations = redisTemplate.opsForValue();
            //operations.set(key, value);
            //redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);

            operations.set(key, value, expireTime, TimeUnit.SECONDS);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 批量删除对应的value
     *
     * @param keys keys
     */
    public void delete(final String... keys) {
        for (String key : keys) {
            delete(key);
        }
    }

    /**
     * 批量删除key
     *
     * @param pattern pattern
     */
    public void deletePattern(final String pattern) {
        Set<String> keys = redisTemplate.keys(pattern);
        if (keys.size() > 0)
            redisTemplate.delete(keys);
    }

    /**
     * 删除对应的value
     *
     * @param key key
     */
    public void delete(final String key) {
        if (hasKey(key)) {
            redisTemplate.delete(key);
        }
    }

    /**
     * 判断缓存中是否有对应的value
     *
     * @param key key
     * @return result
     */
    public boolean hasKey(final String key) {
        return redisTemplate.hasKey(key);
    }

    /**
     * 读取缓存
     *
     * @param key key
     * @return result
     */
    public Object get(final String key) {
        Object result = null;
        ValueOperations<String, Object> operations = redisTemplate.opsForValue();
        result = operations.get(key);
        return result;
    }


    /**
     * 哈希 添加
     *
     * @param key     key
     * @param hashKey hashKey
     * @param value   value
     */
    public void setHash(String key, Object hashKey, Object value) {
        HashOperations<String, Object, Object> hash = redisTemplate.opsForHash();
        hash.put(key, hashKey, value);
    }

    /**
     * 哈希获取数据
     *
     * @param key     key
     * @param hashKey hashKey
     * @return object
     */
    public Object getHash(String key, Object hashKey) {
        HashOperations<String, Object, Object> hash = redisTemplate.opsForHash();
        return hash.get(key, hashKey);
    }

    /**
     * 列表添加
     *
     * @param key   key
     * @param value value
     */
    public void setList(String key, Object value) {
        ListOperations<String, Object> list = redisTemplate.opsForList();
        list.leftPush(key, value);
    }
    /**
     * 列表添加
     *
     * @param key   key
     * @param list list
     */
    public void setListAll(String key, List<T> list) {
        ListOperations<String, Object> opsForList = redisTemplate.opsForList();
        opsForList.leftPushAll(key, list);
    }

    /**
     * 列表获取
     *
     * @param key key
     * @return list
     */
    public List<T> getList(String key) {
        return getList(key,0,-1);
    }

    /**
     * 列表获取
     *
     * @param key   key
     * @param start start
     * @param end   end
     * @return list
     */
    public List<T> getList(String key, long start, long end) {
        ListOperations<String, Object> opsForList = redisTemplate.opsForList();
        opsForList.
        return (List<T>)list.range(key, start, end);
    }

    /**
     * 集合添加
     *
     * @param key   key
     * @param value value
     */
    public void setSet(String key, Object value) {
        SetOperations<String, Object> set = redisTemplate.opsForSet();
        set.add(key, value);
    }

    /**
     * 集合获取
     *
     * @param key key
     * @return set
     */
    public Set<Object> getSet(String key) {
        SetOperations<String, Object> set = redisTemplate.opsForSet();
        return set.members(key);
    }

    /**
     * 有序集合添加
     *
     * @param key   key
     * @param value value
     * @param score score
     */
    public void setZSet(String key, Object value, double score) {
        ZSetOperations<String, Object> zset = redisTemplate.opsForZSet();
        zset.add(key, value, score);
    }

    /**
     * 有序集合获取
     *
     * @param key   key
     * @param value value
     * @param score score
     * @return set
     */
    public Set<Object> getZSet(String key, double value, double score) {
        ZSetOperations<String, Object> zset = redisTemplate.opsForZSet();
        return zset.rangeByScore(key, value, score);
    }
}
