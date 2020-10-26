package com.maven.sainsbury.stepDefinitions;

import com.maven.sainsbury.pageObjects.ResultsPageObj;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class ResultsStepDef {

    ResultsPageObj resultsPage = new ResultsPageObj();

    @When("^user must be able to hover over the subheader options \"([^\"]*)\"$")
    public void userMustBeAbleToHoverOverTheSubheaderOptions(String headerOptions) throws Throwable {
        resultsPage.headerSelection(headerOptions);
    }

    @And("^select a product under selected subheader \"([^\"]*)\"$")
    public void selectAProductUnderSelectedSubheader(String productOptions) throws Throwable {
        resultsPage.productSelection(productOptions);
    }

    @And("^user is able to select the subheader filter\"([^\"]*)\"$")
    public void userIsAbleToSelectTheSubheaderFilter(String filterOptions) throws Throwable {
        resultsPage.subHeaderFilterSelections(filterOptions);
    }

    @And("^user is able to select the subheader filters\"([^\"]*)\"$")
    public void userIsAbleToSelectTheSubheaderFilters(String filterCategory) throws Throwable {
        resultsPage.filtersforsub_subheaders(filterCategory);
    }
}