package cw.tests.Day16;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C01_Parameters {


    @Test
    @Parameters("isim")
    public void parameterizedTest(String name){

        System.out.println("Hello " + name);

    }


    // parametrelerin sirasina gore xml dosyasindan parametreler okunur.
    // Parametreleri String disinda veri tipleriyle alabiliriz. (Eger ki cevrilebiliyorsa)
    @Test
    @Parameters({"isim", "soyisim", "yas"})
    public void twoParameterTest(String name, String surname, int age){

        System.out.println("Hello " + name + " " + surname);
        System.out.println(age);
    }

}