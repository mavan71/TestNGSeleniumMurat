package cw.tests.Day14;

import org.testng.annotations.Test;

public class C04_Enabled {

        // enabled = false olursa testimiz pasif hale gelir ve calismaz
        // default degeri true dur


    @Test
    public void enabledTest(){
        System.out.println("enable test 1 çalıştı");

    }

    @Test(enabled = false)
    public void disabledTest(){
        System.out.println("enable test 2 çalıştı");
    }
}













