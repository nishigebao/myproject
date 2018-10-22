package com.hr.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.core.RedisTemplate;

import java.lang.reflect.Method;

@Configuration
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport{
    @Bean
    CacheManager cacheManager(RedisTemplate redisTemplate){
        return new RedisCacheManager(redisTemplate);
    }

    //自定义key配置
    @Override
    public KeyGenerator keyGenerator() {
        return new KeyGenerator() {
            @Override
            public Object generate(Object o, Method method, Object... objects) {
                StringBuilder sb=new StringBuilder();
                sb.append(o.getClass().getName());
                sb.append(method.getName());
                System.out.println("自定义的key:"+sb.toString());
                return sb.toString();
            }
        };
    }
}
