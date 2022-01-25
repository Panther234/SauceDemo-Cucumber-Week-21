package com.saucedemo.pages;
/*
 * Created By: Hiren Patel
 * Project Name: SauceDemo-Cucumber-Week-21
 */

import com.saucedemo.propertyreader.PropertyReader;
import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement userNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement loginButton;


    public void verifyHomePage() {
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = PropertyReader.getInstance().getProperty("baseUrl");
        log.info("verifying homepage url.");
        AssertJUnit.assertEquals(expectedUrl, actualUrl);
    }

    public void userName() {
        sendTextToElement(userNameField,"Satandard_user");
        log.info("Send UserName to UserName field. ");
    }

    public void password() {
        sendTextToElement(passwordField,"secret_sauce");
        log.info("Send Password to Password field. ");
    }

    public void login(){
        clickOnElement(loginButton);
        log.info("Clicking on Login button. ");
    }
}
