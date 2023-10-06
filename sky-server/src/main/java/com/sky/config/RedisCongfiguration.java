package com.sky.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * Classname: RedisCongfiguration
 * Package: com.sky.config
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 18:15
 * @Version: v1.0
 */
@Configuration
@Slf4j
public class RedisCongfiguration {
    @Bean
    public RedisTemplate redisTemplate(RedisConnectionFactory redisConnectionFactory){
        log.info("开始创建redis模板对象");
        RedisTemplate<Object, Object> objectObjectRedisTemplate = new RedisTemplate<>();
        objectObjectRedisTemplate.setConnectionFactory(redisConnectionFactory);
        objectObjectRedisTemplate.setKeySerializer(new StringRedisSerializer());
        return objectObjectRedisTemplate;
    }
}
