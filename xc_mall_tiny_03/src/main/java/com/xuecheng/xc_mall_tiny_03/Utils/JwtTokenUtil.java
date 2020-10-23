package com.xuecheng.xc_mall_tiny_03.Utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.jwt.Jwt;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author admin
 * @description
 * @ 2020/10/22
 */
public class JwtTokenUtil {
    private  static  final Logger logger  = LoggerFactory.getLogger(JwtTokenUtil.class);
    private static final String CLAIM_KEY_USERNAME = "sub"; //标识参数sub用户
    private static final String CLAIM_KEY_CREATED = "created";//
    @Value("${jwt.secret}")
    private String secret;
    @Value("${jwt.expiration}")
    private Long expiration;


    /**
     * 根据参数负责生成JWT的token
     * token组成 Header/头部（我来组成头部x） 自动生成
     * Payload/载荷 payload部分是JWT存储信息的部分，包含着Claims（声明），其实就是存储的的数据。
     *签名部分的生成公式如下
     * */
   private  String generateToken(Map<String,Object> claim){
    return Jwts.builder(). //jwtbuilder
            setClaims(claim). //token参数
            signWith(SignatureAlgorithm.HS512,secret).//选择token加密算法，以及自定义的秘钥
            compact();//合并内容返回String
   }
    /**
     * 从token中获取JWT中的负载
     */
    private Claims getClaimsFromToken(String token) {
        Claims claims = null;
        try {
            claims = Jwts.parser() //调用jjwt解析器
                    .setSigningKey(secret) //使用秘钥寻找对应token
                    .parseClaimsJws(token) // 解析token返回
                    .getBody(); //回去body 数据
        } catch (Exception e) {
            logger.info("JWT格式验证失败:{}",token);
        }
        return claims;
    }

    // todo 阅读

    /**
     * 生成token的过期时间
     */
    private Date generateExpirationDate() {
        return new Date(System.currentTimeMillis() + expiration * 1000);
    }

    /**
     * 从token中获取登录用户名
     */
    public String getUserNameFromToken(String token) {
        String username;
        try {
            Claims claims = getClaimsFromToken(token);
            username =  claims.getSubject();
        } catch (Exception e) {
            username = null;
        }
        return username;
    }
    /**
     * 验证token是否还有效
     *
     * @param token       客户端传入的token
     * @param userDetails 从数据库中查询出来的用户信息
     */
    public boolean validateToken(String token, UserDetails userDetails) {
        String username = getUserNameFromToken(token);
        return username.equals(userDetails.getUsername()) && !isTokenExpired(token);
    }

    /**
     * 判断token是否已经失效
     */
    private boolean isTokenExpired(String token) {
        Date expiredDate = getExpiredDateFromToken(token);
        return expiredDate.before(new Date());
    }

    /**
     * 从token中获取过期时间
     */
    private Date getExpiredDateFromToken(String token) {
        Claims claims = getClaimsFromToken(token);
        return claims.getExpiration();
    }

    /**
     * 根据用户信息生成token
     */
    public String generateToken(UserDetails userDetails) {
        Map<String, Object> claims = new HashMap<>();
        claims.put(CLAIM_KEY_USERNAME, userDetails.getUsername());
        claims.put(CLAIM_KEY_CREATED, new Date());
        return generateToken(claims);
    }

    /**
     * 判断token是否可以被刷新
     */
    public boolean canRefresh(String token) {
        return !isTokenExpired(token);
    }

    /**
     * 刷新token
     */
    public String refreshToken(String token) {
        Claims claims = getClaimsFromToken(token);
        claims.put(CLAIM_KEY_CREATED, new Date());
        return generateToken(claims);
    }




















}
