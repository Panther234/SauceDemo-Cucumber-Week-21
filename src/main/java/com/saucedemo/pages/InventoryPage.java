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

import java.util.ArrayList;
import java.util.List;

public class InventoryPage extends Utility {

    private static final Logger log = LogManager.getLogger(InventoryPage.class.getName());

    public InventoryPage() {
        PageFactory.initElements(driver, this);
    }

    static List<String> productsList = new ArrayList<>();


    @CacheLookup
    @FindBy(css = "span.title")
    WebElement headingText;

    @CacheLookup
    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement sortContainer;

    @CacheLookup
    @FindBy(xpath = "//div[@class='inventory_item_name']")
    List<WebElement> productListName;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Add to cart')]")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//button[@id='back-to-products']")
    WebElement backToProducts;

    @CacheLookup
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement shoppingCart;

    public void verifyHeadingText(String expected) {
        String actual = headingText.getText().trim();
        boolean expectedResult = actual.contains(expected);
        Assert.assertTrue(expectedResult);
        log.info("Verifying heading text. '" + actual + "'");
    }

    public void productSortContainer(String text) {
        selectByVisibleTextFromDropDown(sortContainer, text);
        log.info("clicking on Product Sort Container field. ");
    }

    public void selectCostliestProductAndAddToBasket(String text) {
        for (WebElement product : productListName) {
            productsList.add(product.getText());
        }
        for (WebElement products : productListName) {
            if (products.getText().equalsIgnoreCase(productsList.get(0))) {
                clickOnElement(products);
                clickOnElement(addToCartButton);
                break;
            }
        }
        log.info("Select Costliest product and add to basket. '" + text + "'");
        clickOnElement(backToProducts);
        log.info("Click Back to products button. ");
        selectByVisibleTextFromDropDown(sortContainer, text);
        log.info("Select text from dropdown. '" + text + "'");

    }

    public void selectCheapestProductAndAddToBasket(String text) {

        for (WebElement product : productListName) {
            productsList.add(product.getText());
        }
        for (WebElement products : productListName) {
            if (products.getText().equalsIgnoreCase(productsList.get(productsList.size() - 1))) {
                clickOnElement(products);
                clickOnElement(addToCartButton);
                break;
            }
        }
        log.info("Select cheapest product and add to basket. '" + text + "'");
    }

    public void clickShoppingCart() {
        clickOnElement(shoppingCart);
        log.info("clicking on Shopping cart button. ");
    }

}
