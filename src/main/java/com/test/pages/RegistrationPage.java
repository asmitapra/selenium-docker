package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(name = "et_pb_contact_name_0")
    private WebElement firstNameText;

    @FindBy(name = "et_pb_contact_message_0")
    private WebElement lastNameText;

    @FindBy(name = "et_builder_submit_button")
    private WebElement submitBtn;

    public RegistrationPage(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        PageFactory.initElements(driver, this);
    }

    public void goTo()
    {
        this.driver.get("https://ultimateqa.com/filling-out-forms/");
        this.wait.until(ExpectedConditions.visibilityOf(this.firstNameText));
    }

    public void enterUserDetails(String firstName, String lastName)
    {
        this.firstNameText.sendKeys(firstName);
        this.lastNameText.sendKeys(lastName);
    }

    public void submit()
    {
        this.submitBtn.click();
    }


}
