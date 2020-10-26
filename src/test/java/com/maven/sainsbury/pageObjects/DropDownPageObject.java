package com.maven.sainsbury.pageObjects;

import com.maven.sainsbury.configurations.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DropDownPageObject extends DriverFactory {
    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement acceptCookies;

    @FindBy(css="#category")
    private WebElement dropDownButton;

    public void setDropDownButton(String CustomerSelectedDropDown){
      acceptCookies.click();
        dropDownButton.click();
      Select select = new Select(dropDownButton);
     //select.selectByIndex(1);
      select.selectByVisibleText(CustomerSelectedDropDown);
    }
}
