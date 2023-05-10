package cw.tests.Day17;

import org.testng.annotations.Test;

public class C03_ParallelTestMethod{


    @Test(
            threadPoolSize = 4,
            invocationCount = 10
    )
    public void test01(){
        long id = Thread.currentThread().getId();
        System.out.println("Thread = " + id);
    }

}