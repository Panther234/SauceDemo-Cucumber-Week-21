package com.saucedemo.cucumber;

/*
 * Created By: Hiren Patel
 * Project Name: SauceDemo-Cucumber-Week-21
 */

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
    public void iFilterTheProductsByPrice() {
        new InventoryPage().productSortContainer();
        new InventoryPage().sortProductHighToLowPrice();
    }

    @And("^I select cheapest & costliest products and add to basket$")
    public void iSelectCheapestCostliestProductsAndAddToBasket() {
    }

    @And("^I open shopping cart$")
    public void iOpenShoppingCart() {
    }

    @And("^I go to checkout$")
    public void iGoToCheckout() {
    }

    @And("^I enter details firstname \"([^\"]*)\", lastName \"([^\"]*)\" and zipPostalCode \"([^\"]*)\"$")
    public void iEnterDetailsFirstnameLastNameAndZipPostalCode(String arg0, String arg1, String arg2) {

    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
    }

    @And("^I click on finish button$")
    public void iClickOnFinishButton() {
    }

    @Then("^I should be able to see message 'Thank you for your order'$")
    public void iShouldBeAbleToSeeMessageThankYouForYourOrder() {
    }
}
