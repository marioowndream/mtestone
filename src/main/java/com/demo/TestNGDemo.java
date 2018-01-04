package com.demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class TestNGDemo {
    //测试用例执行前执行
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod");
    }
    //测试用例执行后执行
    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod");
    }
    //测试用例
    @Test
    public void fun1() {
        System.out.println("this is test fun1");
    }
    //提供数据源的测试用例
    @Test(dataProvider = "data1")
    public void fun2(String name, int age) {
        System.out.println("name = " + name + "," + "age = " + age);
    }
    //提供数据源的测试用例
    @Test(dataProvider = "data2")
    public void fun3(String name, int age) {
        System.out.println("name = " + name + "," + "age = " + age);
    }

    //提供数据方式1
    @DataProvider(name = "data1")
    public Object[][] getData1() {
        return new Object[][]{
                {"zhangsan", 29}
        };
    }

    //提供数据方式2
    @DataProvider(name = "data2")
    public Iterator<Object[]> getData2() {
        ArrayList<Object[]> list = new ArrayList<Object[]>();
        list.add(new Object[]{"lisi", 30});
        return list.iterator();
    }
}
