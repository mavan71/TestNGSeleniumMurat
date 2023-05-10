package cw.tests.Day17;

import org.testng.annotations.Test;

public class C02_ParalelExecution {
    @Test
    public void test01(){
        Long id=Thread.currentThread().getId();
        System.out.println("This test is running in thread "+id);
    }
    @Test
    public void test02(){
        Long id=Thread.currentThread().getId();

        System.out.println("This test is running in thread "+id);
    }
    @Test
    public void test03(){
        Long id=Thread.currentThread().getId();

        System.out.println("This test is running in thread "+id);
    }
    @Test
    public void test04(){
        Long id=Thread.currentThread().getId();

        System.out.println("This test is running in thread "+id);
    }
    @Test
    public void test05(){
        Long id=Thread.currentThread().getId();
        System.out.println("This test is running in thread "+id);
    }
    @Test
    public void test06(){
        Long id=Thread.currentThread().getId();

        System.out.println("This test is running in thread "+id);
    }
    @Test
    public void test07(){
        Long id=Thread.currentThread().getId();

        System.out.println("This test is running in thread "+id);
    }
    @Test
    public void test08(){
        Long id=Thread.currentThread().getId();

        System.out.println("This test is running in thread "+id);
    }
}
