package com.maven.sainsbury.stepDefinitions;

import com.maven.sainsbury.pageObjects.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class HomePageStepDef {

    HomePage homePage = new HomePage();


   @Given("^user is on the homepage$")
    public void userIsOnTheHomepage() {
        String actual = homePage.getCurrentUrl();
        assertThat("User passing the incomplete Url", actual, Matchers.endsWith("https://www.sainsburys.co.uk/"));
    }


    @When("^user searching for a product\"([^\"]*)\"$")
    public void userSearchingForAProduct(String item) throws Throwable {
        homePage.search(item);
    }

    @And("^user must be able to see the list of searched products$")
    public void userMustBeAbleToSeeTheListOfSearchedProducts() {
homePage.setSearchResultsTitleBar();
    }


}
