package com.xuecheng.manage_cms;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

/**
 * @author Administrator
 * @version 1.0
 * @create 2018-09-12 17:13
 **/
@SpringBootApplication
@EntityScan("com.xuecheng.framework.domain.cms")//扫描实体类
@ComponentScan(basePackages={"com.xuecheng.api"})//扫描接口
@ComponentScan(basePackages={"com.xuecheng.manage_cms"})//扫描本项目下的所有类
public class ManageCmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManageCmsApplication.class,args);
       /* try {
            XWPFTemplate template = XWPFTemplate.compile("template.doc").render(
                    new HashMap<String, Object>() {{
                        put("title", "Hi, poi-tl Word模板引擎");
                    }});
            FileOutputStream out = new FileOutputStream("output.docx");
            template.write(out);
            out.flush();
            out.close();
            template.close();
        }catch (IOException e){e.printStackTrace();}*/
    }
}
