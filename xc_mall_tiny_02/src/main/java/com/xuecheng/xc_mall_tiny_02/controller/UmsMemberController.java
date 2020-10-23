package com.xuecheng.xc_mall_tiny_02.controller;

import com.xuecheng.framework.model.response.ResponseResult;
import com.xuecheng.xc_mall_tiny_02.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author admin
 * @description
 * @ 2020/10/19
 */
@Controller
@Api(tags = "UmsMemberController", description = "会员登录注册管理")
public class UmsMemberController {

    @Autowired
    private UmsMemberService memberService;

    @ApiOperation("获取验证码")
    @RequestMapping(value = "/getAuthCode", method = RequestMethod.GET)
    @ResponseBody
    public ResponseResult getAuthCode(@RequestParam String telephone) {
        return memberService.generateAuthCode(telephone);
    }

    @ApiOperation("判断验证码是否正确")
    @RequestMapping(value = "/verifyAuthCode", method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult updatePassword(@RequestParam String telephone,
                                       @RequestParam String authCode) {
        return memberService.verifyAuthCode(telephone,authCode);
    }
}
