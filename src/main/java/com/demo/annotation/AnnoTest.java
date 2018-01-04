package com.demo.annotation;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface Anno {
    String desc();

}
public class AnnoTest {
    @Anno(desc = "anno")
    public static void fun() {

    }
    public static void main(String[] args) throws Exception{
        String content = "from runoob.com";
        String pattern = "om.*runoob.*";
        boolean ismatch = content.matches(pattern);
        System.out.println(ismatch);
    }
}
class Noseri {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
class Seri implements Serializable{
    private static final long serialVersionUID = 111;
    private String name;
    private Integer age;
    public static String de = "world";

    public static String getDe() {
        return de;
    }

    public static void setDe(String de) {
        Seri.de = de;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Seri{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
enum Et {
    YES,
    NO,
    ;
}
class A {
    int i;
    String dec;
}