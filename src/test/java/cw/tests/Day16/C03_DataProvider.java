package cw.tests.Day16;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

public class C03_DataProvider {

        // Data provider sayesinde bir testi birden fazla veri setiyle tekrar tekrar calistirabiliriz


        // 1 - Veri saglayacak methodu @DataProvider anotasyonu ile susle
        // 2 - Veriyi kullanacak olan methodun dataProvider attribute unu olustur
        // 3 - Veriyi kullanacak methodun method signature una degiskenleri ekle

        // Artik kopru kuruldu veriler bir bir akiyor..

    // Veriyi kullanacak
    @Test(dataProvider = "data")
    public void test01(String email, String sifre, String hataMesaji){

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Siteye git");
        System.out.println("Kullanici adina " + email + " yaz");
        System.out.println("Sifre alanina " + sifre + " yaz");
        System.out.println("Sign Up a tikla");
        System.out.println("Hata mesajinin " + hataMesaji + "oldugunu dogrula");
        System.out.println("---------------------------------------------------------------------------------");


    }


    // Veriyi saglayacak
    @DataProvider
    public Object[][] data(){

        // DataProvider methodu kesinlikle ve kesinlikle Object[][] return etmelidir
        // 2 boyutlu array imizin her satiri bir test execution her sutunu ise execution sirasinda kullanilcak olan degiskeni temsil eder
        Object[][] data = new Object[6][3];

        data[0] = new Object[]{"karl@gmail.com", "Aa1.", "6 harften kisa"};
        data[1] = new Object[]{"karl@gmail.com", "Aa1.skjdhfgsdkhjfdksjhfkdsjhfkdjshfksdhj", "20 harften uzun"};
        data[2] = new Object[]{"karl@gmail.com", "AAAAA1.", "Kucuk harf yok"};
        data[3] = new Object[]{"karl@gmail.com", "aaaaa1.", "Buyuk harf yok"};
        data[4] = new Object[]{"karl@gmail.com", "Aaaaaa.", "Sayi yok"};
        data[5] = new Object[]{"karl@gmail.com", "Aa1aaaaa", "Ozel karakter yok"};

        // Excel den veri okunabilir ve array e yazilip return edilebilir.

        return data;



    }


}
