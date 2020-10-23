package com.xuecheng.xc_mall_tiny_02.service;

import com.xuecheng.framework.model.response.ResponseResult;

/**
 * 会员管理Service
 * Created by macro on 2018/8/3.
 */
public interface UmsMemberService {
    /**
     * 生成验证码
     */
    ResponseResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    ResponseResult verifyAuthCode(String telephone, String authCode);
}
