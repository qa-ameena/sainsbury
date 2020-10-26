package com.maven.sainsbury.stepDefinitions;

import com.maven.sainsbury.pageObjects.DropDownPageObject;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class DropDownStepDef {
    DropDownPageObject dropdown = new DropDownPageObject();

    @When("^Customer must be able to click the dropdown$")
    public void customerMustBeAbleToClickTheDropdown() {

    }

    @And("^customer should be able to select \"([^\"]*)\"$")
    public void customerShouldBeAbleToSelect(String CustomerSelectedDropDown) throws Throwable {
       dropdown.setDropDownButton(CustomerSelectedDropDown);
    }


  }
