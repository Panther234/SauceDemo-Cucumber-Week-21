package com.saucedemo.cucumber;

/*
 * Created By: Hiren Patel
 * Project Name: SauceDemo-Cucumber-Week-21
 */

import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.CheckoutPage;
import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.InventoryPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchTestSteps {
    @Given("^I am on saucedemo page$")
    public void iAmOnSaucedemoPage() {
        new HomePage().verifyHomePage();
    }

    @When("^I login with credential username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginWithCredentialUsernameAndPassword(String arg0, String arg1) {
        new HomePage().userName();
        new HomePage().password();
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new HomePage().login();
    }

    @And("^I filter the products by Price \"([^\"]*)\"$")
    public void iFilterTheProductsByPrice(String priceSort) {
//        new InventoryPage().verifyHeadingText(expected);
        new InventoryPage().productSortContainer(priceSort);
    }

    @And("^I select cheapest & costliest products and add to basket \"([^\"]*)\"$")
    public void iSelectCheapestCostliestProductsAndAddToBasket(String selectProduct) {
        new InventoryPage().selectCostliestProductAndAddToBasket(selectProduct);
        new InventoryPage().selectCheapestProductAndAddToBasket(selectProduct);
    }

    @And("^I open shopping cart$")
    public void iOpenShoppingCart() {
        new InventoryPage().clickShoppingCart();
    }

    @And("^I go to checkout$")
    public void iGoToCheckout() {
        new CartPage().clickOnCheckoutTab();
    }

    @And("^I enter details firstname \"([^\"]*)\", lastName \"([^\"]*)\" and zipPostalCode \"([^\"]*)\"$")
    public void iEnterDetailsFirstnameLastNameAndZipPostalCode(String firstName, String lastName, String postcode) {
        new CheckoutPage().enterPersonalDetails(firstName, lastName, postcode);
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new CheckoutPage().clickOnContinueButton();
    }

    @And("^I click on finish button$")
    public void iClickOnFinishButton() {
        new CheckoutPage().clickOnFinishButton();
    }

    @Then("^I should be able to see message \"([^\"]*)\"$")
    public void iShouldBeAbleToSeeMessageThankYouForYourOrder(String expectedMessage) {
        new CheckoutPage().verifyMessage(expectedMessage);
    }


}
