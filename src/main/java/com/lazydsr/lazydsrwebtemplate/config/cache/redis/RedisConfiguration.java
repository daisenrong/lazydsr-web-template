package com.lazydsr.lazydsrwebtemplate.config.cache.redis;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.lang.reflect.Method;

/**
 * RedisConfiguration
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.config.cache.redis
 * Created by Lazy on 2018/5/18 23:43
 * Version: 0.1
 * Info: @TODO:...
 */
@Configuration
@EnableCaching
public class RedisConfiguration extends CachingConfigurerSupport {



    //@Bean
    //public CacheManager cacheManager(RedisTemplate<?, ?> redisTemplate) {
    //    RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate);
    //    return cacheManager;
    //    /*RedisCacheManager rcm = new RedisCacheManager(redisTemplate);
    //    // 多个缓存的名称,目前只定义了一个
    //    rcm.setCacheNames(Arrays.asList("thisredis"));
    //    //设置缓存默认过期时间(秒)
    //    rcm.setDefaultExpiration(600);
    //    return rcm;*/
    //}
    //// 以下两种redisTemplate自由根据场景选择
    //@Bean
    //public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory connectionFactory) {
    //    RedisTemplate<Object, Object> template = new RedisTemplate<>();
    //    template.setConnectionFactory(connectionFactory);
    //
    //    //使用Jackson2JsonRedisSerializer来序列化和反序列化redis的value值（默认使用JDK的序列化方式）
    //    Jackson2JsonRedisSerializer serializer = new Jackson2JsonRedisSerializer(Object.class);
    //
    //    ObjectMapper mapper = new ObjectMapper();
    //    mapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
    //    mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
    //    serializer.setObjectMapper(mapper);
    //
    //    template.setValueSerializer(serializer);
    //    //使用StringRedisSerializer来序列化和反序列化redis的key值
    //    template.setKeySerializer(new StringRedisSerializer());
    //    template.afterPropertiesSet();
    //    return template;
    //}
    //@Bean
    //public StringRedisTemplate stringRedisTemplate(RedisConnectionFactory factory) {
    //    StringRedisTemplate stringRedisTemplate = new StringRedisTemplate();
    //    stringRedisTemplate.setConnectionFactory(factory);
    //    return stringRedisTemplate;
    //}
}
