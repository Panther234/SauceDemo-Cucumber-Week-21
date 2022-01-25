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

public class InventoryPage extends Utility {

    private static final Logger log = LogManager.getLogger(InventoryPage.class.getName());

    public InventoryPage() {PageFactory.initElements(driver, this);}

    @CacheLookup
    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement sortContainer;

    @CacheLookup
    @FindBy(xpath = "//option[text()='Price (high to low)']")
    WebElement sortHighToLowOption;


    public void productSortContainer(){
        clickOnElement(sortContainer);
        log.info("clicking on Product Sort Container field. ");
    }

    public void sortProductHighToLowPrice(){
        clickOnElement(sortHighToLowOption);
        log.info("clicking on Product Sort by High to Low. ");
    }
}
