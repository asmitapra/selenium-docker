package com.test.tests;

import com.test.pages.RegistrationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import tests.BaseTest;

public class RegisterTest extends BaseTest {

    //private WebDriver driver;

    /*@BeforeTest
    public void setupDriver()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asmita.Prabhune\\Desktop\\drivers\\chromedriver.exe");
        this.driver = new ChromeDriver();
    }*/

    @Test
    public void registrationPage()
    {
        RegistrationPage page = new RegistrationPage(driver);
        page.goTo();
        page.enterUserDetails("selenium","docker");
        page.submit();
    }

   /* @AfterTest
    public void closeBrowser()
    {
        this.driver.close();
    }*/


}
