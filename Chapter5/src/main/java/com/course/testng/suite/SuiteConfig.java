package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("before suit 运行了");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("after suit 运行了");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("before test 运行了");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("after test 运行了");
    }


}
