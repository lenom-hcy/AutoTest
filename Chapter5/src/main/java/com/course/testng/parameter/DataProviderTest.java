package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDateProvider(String name,int age){
        System.out.println("name = " + name + "  gae = " + age);
    }

    @DataProvider(name = "data")
    public  Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhansan",10},
                {"wangwu",20},
                {"lisi",30}
        };
        return o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test1方法 name = " + name + "  gae = " + age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test2方法 name = " + name + "  gae = " + age);
    }

    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result = null;
        if (method.getName().equals("test1")){
            result = new Object[][]{
                    {"zhansan",10},
                    {"lisi",11}
            };
        }else if (method.getName().equals("test2") ){
            result = new Object[][]{
                    {"wangwu", 60},
                    {"zhaoliu", 70}
            };
        }
        return result;
    }
}
