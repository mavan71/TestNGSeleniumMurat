package cw.tests.Day14;

import org.testng.annotations.*;

public class C01_Annotations {


    @BeforeTest
    public void beforeTest(){
        System.out.println("\tBefore Test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("\tAfter Test");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("\t\tBefore Class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("\t\tAfter Class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("\t\t\tBefore Method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("\t\t\tAfter Merhod");
    }

    @Test
    public void test01(){
        System.out.println("\t\t\t\tMethod1");
    }

    @Test
    public void test02(){
        System.out.println("\t\t\t\tMethod2");
    }


}
