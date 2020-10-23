package com.xuecheng.xc_mall_tiny_02.service.impl;

import com.xuecheng.framework.model.response.*;
import com.xuecheng.xc_mall_tiny_02.service.RedisService;
import com.xuecheng.xc_mall_tiny_02.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Random;

/**
 * @Author admin
 * @description
 * @ 2020/10/19
 */
@Service
public class UmsServiceImpl implements UmsMemberService {
    @Autowired
    private RedisService redisService;
    @Value("${redis.key.prefix.authcode}")
    private  String REDIS_KEY_PREFIX;
    @Value("${redis.key.expire.authcode}")
    private  Long REDIS_KEY_EXPIRE;


    /**
     * 生成验证码
     *
     * @param telephone
     */
    @Override
    public ResponseResult generateAuthCode(String telephone) {
        StringBuilder sb =  new StringBuilder();
        Random  random  = new Random();
        // 简单生成
        for (int i = 0; i < 6; i++) {
            sb.append(random.nextInt(10));
        }
        // 验证码绑定手机号 存到redis  设置过期时间
        redisService.set(REDIS_KEY_PREFIX+telephone, sb.toString());
        redisService.expire(REDIS_KEY_PREFIX+telephone,REDIS_KEY_EXPIRE);

        return  new ResponseResult(true,10000, sb.toString());
    }

    /**
     * 对输入的验证码进行校验
     * @param telephone
     * @param authCode
     */
    @Override
    public ResponseResult verifyAuthCode(String telephone, String authCode) {
        if(StringUtils.isEmpty(authCode)){
            return  new ResponseResult(false,99999,"验证码为空，请输入验证码");
        }
        String telauthcode = redisService.get(REDIS_KEY_PREFIX+telephone);
        boolean result = authCode.equals(telauthcode);
        if(result){
            return  new ResponseResult(true,10000,"验证码正确");
        }else {
            return  new ResponseResult(false,99999,"验证码错误");
        }
    }
}
