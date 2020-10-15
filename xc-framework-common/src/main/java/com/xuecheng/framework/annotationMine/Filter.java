package com.xuecheng.framework.annotationMine;

import javax.xml.bind.annotation.XmlType;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//方法 参数
@Target({ElementType.TYPE, ElementType.METHOD,ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface Filter {
String FilterMethodName() default "FilterMethod";
String FilterClassMethodName() default "";
boolean toFilterParameter() default false;

}
