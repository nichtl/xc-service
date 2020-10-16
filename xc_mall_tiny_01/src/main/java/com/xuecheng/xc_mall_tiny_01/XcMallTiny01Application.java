package com.xuecheng.xc_mall_tiny_01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class XcMallTiny01Application {

    public static void main(String[] args) {
        SpringApplication.run(XcMallTiny01Application.class, args);
    }

}
