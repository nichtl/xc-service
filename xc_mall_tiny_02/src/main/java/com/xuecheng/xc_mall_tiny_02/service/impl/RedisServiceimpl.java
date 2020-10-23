package com.xuecheng.xc_mall_tiny_02.service.impl;

import com.xuecheng.xc_mall_tiny_02.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.concurrent.TimeUnit;

/**
 * @Author admin
 * @description
 * @ 2020/10/19
 */
@Service
public class RedisServiceimpl implements RedisService {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    /**
     * 存储数据
     * @param K
     * @param V
     */
    @Override
    public void set(String K, String V) {
      stringRedisTemplate.opsForValue().set(K,V);
    }

    /**
     * 获取数据
     * @param K
     */
    @Override
    public String get(String K) {
        return stringRedisTemplate.opsForValue().get(K);
    }

    /**
     * 设置超期时间
     *
     * @param key
     * @param expire
     */
    @Override
    public boolean expire(String key, long expire) {
        return stringRedisTemplate.expire(key,expire, TimeUnit.MINUTES);
    }

    /**
     * 删除数据
     *
     * @param key
     */
    @Override
    public void remove(String key) {
        stringRedisTemplate.delete(key);
    }

    /**
     * 自增操作
     *
     * @param key
     * @param delta 自增步长
     */
    @Override
    public Long increment(String key, long delta) {
       return stringRedisTemplate.opsForValue().increment(key, delta);
    }
}
