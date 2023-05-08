package cw.tests.Day16;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class C02_ParametersUsage {

    protected WebDriver driver;

    // Browser konfigurasyonlari
    @BeforeMethod
    @Parameters("browser")
    public void setup(@Optional("chrome") String browser){

        // switch veya if else bloklarina tabi tutulur

        switch (browser){
// browser imiz "chrome" ise chromedriver set edilir.
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            // browser imiz "firefox" ise firefoxdriver set edilir.
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    // Browser in kapatilmasi
    @AfterMethod
    public void teardown(){
    driver.quit();
    }

    @Test
    public void test01(){

        driver.get("https://www.amazon.com/");
    }

}