package cw.tests.Day14;

import org.testng.annotations.Test;

public class C02_Priority {

    // testler alfabetik çlışır
    //(priority si küçük olan önce çalışır. (priority= öncelikli demek)
    //(priority nin default değeeri 0 dır
    //(priority negatif değer alabilir
    //(priority aynı priority
    @Test(priority=3)
    public void c(){
        System.out.println("c çalışıyor");
    }

    @Test
    public void a(){
        System.out.println("a çalışıyor");
    }
    @Test(priority=-1)
    public void b(){
        System.out.println("b çalışıyor");
    }

}
