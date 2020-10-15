package com.xuecheng.framework.domain.system;

import com.xuecheng.framework.annotationMine.Info;
import lombok.Builder;
import lombok.Data;

@Data
// 为Person类配置了刚刚定义的注解@Info
public class Person {

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private int age;

    /**
     * 是否有效
     */
    private boolean isDelete;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
