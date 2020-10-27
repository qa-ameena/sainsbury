package com.maven.sainsbury.stepDefinitions;

import com.maven.sainsbury.pageObjects.BasketPageObj;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class BasketStepDef {
    BasketPageObj basket = new BasketPageObj();

    @And("^user should be able to pick a product to add randomly$")
    public void userShouldBeAbleToPickAProductToAddRandomly() {
        basket.randomProductSelection();
    }

    @And("^user should be able to able to pick size\"([^\"]*)\"$")
    public void userShouldBeAbleToAbleToPickSize(String arg0) throws Throwable {
      basket.sizeSelectionForProduct();
    }

    @And("^user should be able to select required quantity \"([^\"]*)\"$")
    public void userShouldBeAbleToSelectRequiredQuantity(String arg0) throws Throwable {
        
    }

    @Then("^user should be able to view the product in the basket$")
    public void userShouldBeAbleToViewTheProductInTheBasket() {
        basket.addingProductToBasket();
        String actualItem = basket.assertCartDetails();
        assertThat("No of items not displaying", actualItem, Matchers.containsString("1 item"));

    }
}
