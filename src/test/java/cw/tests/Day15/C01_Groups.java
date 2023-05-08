package cw.tests.Day15;

import org.testng.annotations.Test;

public class C01_Groups {
    @Test(groups = {"smoke"})
    public void smokeTest(){
        System.out.println("Smoke test running");
    }
    @Test(groups = {"regression"})
    public void regressionTest(){
        System.out.println("Regression test running");
    }
    @Test(groups = {"smoke", "regression"})
    public void smokeRegressionTest(){
        System.out.println("Smoke and Regression test running");
    }
}
