$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("purchase.feature");
formatter.feature({
  "line": 1,
  "name": "Search functionality",
  "description": "As a user I want to purchase cheapest and costliest product from the saucedemo after sorting the products by Hight to Low filter.",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3691046700,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User navigates saucedemo page and complete the item purchas",
  "description": "",
  "id": "search-functionality;user-navigates-saucedemo-page-and-complete-the-item-purchas",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on saucedemo page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I login with credential username \"standard_user\" and password \"secret_sauce\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I filter the products by Price \"Price (high to low)\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select cheapest \u0026 costliest products and add to basket \"Price (high to low)\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I open shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I go to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter details firstname \"Bob\", lastName \"Alexa\" and zipPostalCode \"AB1 2CD\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on finish button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should be able to see message \"Thank you for your order\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchTestSteps.iAmOnSaucedemoPage()"
});
formatter.result({
  "duration": 194346700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 34
    },
    {
      "val": "secret_sauce",
      "offset": 63
    }
  ],
  "location": "SearchTestSteps.iLoginWithCredentialUsernameAndPassword(String,String)"
});
formatter.result({
  "duration": 209663900,
  "status": "passed"
});
formatter.match({
  "location": "SearchTestSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 139038900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (high to low)",
      "offset": 32
    }
  ],
  "location": "SearchTestSteps.iFilterTheProductsByPrice(String)"
});
formatter.result({
  "duration": 224031700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (high to low)",
      "offset": 58
    }
  ],
  "location": "SearchTestSteps.iSelectCheapestCostliestProductsAndAddToBasket(String)"
});
formatter.result({
  "duration": 664174500,
  "status": "passed"
});
formatter.match({
  "location": "SearchTestSteps.iOpenShoppingCart()"
});
formatter.result({
  "duration": 60094100,
  "status": "passed"
});
formatter.match({
  "location": "SearchTestSteps.iGoToCheckout()"
});
formatter.result({
  "duration": 60599100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bob",
      "offset": 27
    },
    {
      "val": "Alexa",
      "offset": 43
    },
    {
      "val": "AB1 2CD",
      "offset": 69
    }
  ],
  "location": "SearchTestSteps.iEnterDetailsFirstnameLastNameAndZipPostalCode(String,String,String)"
});
formatter.result({
  "duration": 239666701,
  "status": "passed"
});
formatter.match({
  "location": "SearchTestSteps.iClickOnContinueButton()"
});
formatter.result({
  "duration": 71110899,
  "status": "passed"
});
formatter.match({
  "location": "SearchTestSteps.iClickOnFinishButton()"
});
formatter.result({
  "duration": 71592301,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Thank you for your order",
      "offset": 33
    }
  ],
  "location": "SearchTestSteps.iShouldBeAbleToSeeMessageThankYouForYourOrder(String)"
});
formatter.result({
  "duration": 35164999,
  "status": "passed"
});
formatter.after({
  "duration": 776977800,
  "status": "passed"
});
});