package com.maven.sainsbury.pageObjects;

import com.maven.sainsbury.configurations.DriverFactory;
import com.maven.sainsbury.utils.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultsPageObj extends DriverFactory {

    Helper helpers=new Helper();

    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement acceptCookies;

//webelemt for header
    @FindBy(css="a.NavItemstyles__NavLink-tj0ono-0")
    private List <WebElement>  subHeaderOptions;

// webElement for subHeaderOptions under header
    @FindBy(css=".NavLinksstyles__NavLinksListItemLink-oe4q0r-2")
    private List <WebElement> subHeaderSelections;

//webElement for subHeaderFilter options
    @FindBy(css= ".span-4 .ln-o-bare-link")
    private List<WebElement> subHeaderFilters;

    //webElement for SubHeaderFilter Categories
    @FindBy(css=".tu-u-background--white .ln-c-form-option__label")
    private List<WebElement> filtersForSubHeaderCategories;

    //To kill the cookie policy popup during selection process
    @FindBy(css=".ln-u-font-family-brand")
    private WebElement cookiePolicy;

    public void headerSelection(String headerOptions) throws InterruptedException {
        acceptCookies.click();
               for (WebElement subHeaderOption:subHeaderOptions) {
                     if(subHeaderOption.getText().equalsIgnoreCase(headerOptions)){
                           Thread.sleep(3000);
                //subHeaderOption.click();
                         helpers.hoverAction(subHeaderOption);
                break;

            }
       }

    }
    public void productSelection(String productOptions) throws InterruptedException {
        for (WebElement subHeaderSelection:subHeaderSelections) {
            if(subHeaderSelection.getText().equalsIgnoreCase(productOptions)){
               // Thread.sleep(3000);
                subHeaderSelection.click();
                break;

            }
        }

    }
    public void subHeaderFilterSelections(String filterOptions) throws InterruptedException {
        cookiePolicy.click();
        for (WebElement subHeaderFilter:subHeaderFilters) {
            if (subHeaderFilter.getText().equalsIgnoreCase(filterOptions)) {
               Thread.sleep(3000);
                //helpers.scrollDownOptions(subHeaderFilter);
                subHeaderFilter.click();
                break;
            }
        }
    }
    public void filtersForSub_SubHeaders(String filterCategory) throws InterruptedException {
                for (WebElement filtersForSubHeaderCategory:filtersForSubHeaderCategories) {
            if (filtersForSubHeaderCategory.getText().equalsIgnoreCase(filterCategory)) {
                Thread.sleep(3000);
                //helpers.scrollDownOptions(subHeaderFilter);
                filtersForSubHeaderCategory.click();
                break;
            }
        }
    }
}