package cw.tests.Day14;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C08_HardSoftAssertions {


    @Test
    public void hard(){
        // Hard assertionlar Assert classi uzerinden cagirdigimiz ve bildgimiz methodlardir.
        // Test execution u sirasinda herhangi bir assertion fail ederse test execution o anda durdurulur

        System.out.println("Checking 1 = 1");
        Assert.assertEquals(1,1);

        System.out.println("Checking 1 = 2");
        Assert.assertEquals(1,2); // Assertion fail edeceginden execution burada kalir

        System.out.println("Checking 2 = 3");
        Assert.assertEquals(2,3);
    }

    @Test
    public void soft(){

        SoftAssert sa = new SoftAssert();//bir obje oluşturuyoruz
        //sa.assertAll(); bu ifadeyi üste yazarsak test doğru olan kısımları ve hatalı kısımlarıyla geçer
        System.out.println("Checking 1 = 1");
        sa.assertEquals(1,1);

        System.out.println("Checking 1 = 2");
        sa.assertEquals(1,2);

        System.out.println("Checking 2 = 3");
        sa.assertEquals(2,3);
      //sa.assertAll(); bu ifadeyi alta yazarsak test hard assertion gibi çalışır bir hata bulunursa test failed olur.
      // sa.assertAll(); // assertAll() kullanilmaz ise tum assertionlar bos yere yazilmis olur//  sa.assertAll(); hard assertion yerine geçer



        System.out.println("Bu yazi konsolda cikacak mi?");
    }

}








