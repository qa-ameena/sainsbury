package com.maven.sainsbury.stepDefinitions;

import com.maven.sainsbury.pageObjects.ResultsPageObj;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class ResultsStepDef {

    ResultsPageObj resultsPage = new ResultsPageObj();

    @When("^user must be able to hover over the subHeader options \"([^\"]*)\"$")
    public void userMustBeAbleToHoverOverTheSubHeaderOptions(String headerOptions) throws Throwable {
        resultsPage.headerSelection(headerOptions);
    }

    @And("^select a product under selected subHeader \"([^\"]*)\"$")
    public void selectAProductUnderSelectedSubHeader(String productOptions) throws Throwable {
        resultsPage.productSelection(productOptions);
    }

    @And("^user is able to select the subHeader filter\"([^\"]*)\"$")
    public void userIsAbleToSelectTheSubHeaderFilter(String filterOptions) throws Throwable {
        resultsPage.subHeaderFilterSelections(filterOptions);
    }

    @And("^user is able to select the subHeader filters\"([^\"]*)\"$")
    public void userIsAbleToSelectTheSubHeaderFilters(String filterCategory) throws Throwable {
        resultsPage.filtersforsub_subheaders(filterCategory);
    }
}