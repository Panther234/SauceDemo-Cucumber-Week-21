package com.saucedemo.pages;
/*
 * Created By: Hiren Patel
 * Project Name: SauceDemo-Cucumber-Week-21
 */

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckoutPage extends Utility {

    private static final Logger log = LogManager.getLogger(CheckoutPage.class.getName());

    public CheckoutPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "first-name")
    WebElement firstName;

    @CacheLookup
    @FindBy(id = "last-name")
    WebElement lastName;

    @CacheLookup
    @FindBy(id = "postal-code")
    WebElement postalCode;

    @CacheLookup
    @FindBy(id = "continue")
    WebElement continueButton;

    @CacheLookup
    @FindBy(id = "finish")
    WebElement finishButton;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='THANK YOU FOR YOUR ORDER']")
    WebElement message;

    public void enterPersonalDetails(String fName, String lName, String pCode){
        sendTextToElement(firstName, fName);
        sendTextToElement(lastName,lName);
        sendTextToElement(postalCode,pCode);
        log.info("Send text to filed . '" + fName + lName + pCode + "'");
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
        log.info("clicking on continue button. ");
    }

    public void clickOnFinishButton(){
        clickOnElement(finishButton);
        log.info("clicking on Finish button. ");
    }

    public void verifyMessage(String expectedMessage){
        String actual = message.getText().trim();
        Assert.assertTrue(actual.equalsIgnoreCase(expectedMessage));
        log.info("Verifying message text. '" + expectedMessage + "'");
    }

}
