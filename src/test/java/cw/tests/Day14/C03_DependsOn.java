package cw.tests.Day14;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C03_DependsOn {


        // Depensonmethods attribute u icerisine {} arasinda test isimleri alir ve bu testler basirili olursa asil testimiz calisir

    @Test
    public void test01(){
        System.out.println("01");
    }

    @Test(
            dependsOnMethods = {"test01", "test03"}
    )
    public void test02(){
        System.out.println("02");
    }//Test02 test1 ve test3 e bağlı. Test3 failed ettiği için test 2de failed oldu.

    @Test
    public void test03(){
        System.out.println("03");
       Assert.fail();
    }

    @Test
    public void test04(){
        System.out.println("04");
    }

}