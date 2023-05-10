package cw.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {


    private static WebDriver driver;

    public static WebDriver getDriver(){
        // todo getDriver methoduna cross browser testing yetisi ekle
        //driver objemiz oluşturulmadıysa driver oluştur.//driver olşturulmadıysa default değeri null dır.
        if(driver==null){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));
        }
        return driver;
    }
    public static void closeDriver(){
        if(driver!=null){
            driver.quit();

        }
    }

}
