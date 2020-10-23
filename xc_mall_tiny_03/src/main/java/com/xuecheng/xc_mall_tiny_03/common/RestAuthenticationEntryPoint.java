package com.xuecheng.xc_mall_tiny_03.common;

/**
 * @Author admin
 * @description
 * @ 2020/10/23
 */
import cn.hutool.json.JSONUtil;
import com.xuecheng.framework.model.response.ResponseResult;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 当未登录或者token失效访问接口时，自定义的返回结果
 * Created by macro on 2018/5/14.
 */
@Component
public class RestAuthenticationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        response.getWriter().println(JSONUtil.parse(ResponseResult.UNAUTH()));
        response.getWriter().flush();
    }
}
