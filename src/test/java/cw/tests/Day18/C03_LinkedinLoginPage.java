package cw.tests.Day18;

import cw.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C03_LinkedinLoginPage {


    public C03_LinkedinLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "username")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@aria-label='Sign in']")
    public WebElement signIn;

    @FindBy(id = "error-for-username")
    public WebElement errorMessage;



}