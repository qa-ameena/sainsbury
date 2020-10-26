package com.maven.sainsbury.pageObjects;

import com.maven.sainsbury.configurations.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage  extends DriverFactory {
    @FindBy(id="onetrust-accept-btn-handler")
    private WebElement acceptCookies;

    @FindBy(id="term")
    private WebElement searchBox;


  @FindBy(css = ".SearchWithDatastyles__Button-sc-1m9u6re-6")
    private WebElement magnifierGlass;

    @FindBy(id="search-results-title")
    private WebElement searchResultsTitleBar;


    public void search(String item){
        acceptCookies.click();
        searchBox.sendKeys(item);
       magnifierGlass.click();
            }
            public void  setSearchResultsTitleBar(){
        searchResultsTitleBar.getText();
            }
public String getCurrentUrl(){
      return driver.getCurrentUrl();
    }
}
