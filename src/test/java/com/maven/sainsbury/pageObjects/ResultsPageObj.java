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
    private List <WebElement>  subheaderOptions;

// webelemnt for subheaderoptions under hedaer
    @FindBy(css=".NavLinksstyles__NavLinksListItemLink-oe4q0r-2")
    private List <WebElement> subheaderSelections;


    @FindBy(css= ".span-4 .ln-o-bare-link")
    private List<WebElement> subHeaderFilters;

    @FindBy(css=".tu-u-background--white .ln-c-form-option__label")
    private List<WebElement> filtersForSubHeaderCategorys;

    @FindBy(css=".ln-u-font-family-brand")
    private WebElement cookiePolicy;

    public void headerSelection(String headerOptions) throws InterruptedException {
        acceptCookies.click();
               for (WebElement subheaderoption:subheaderOptions) {
                     if(subheaderoption.getText().equalsIgnoreCase(headerOptions)){
                           Thread.sleep(3000);
                //subheaderoption.click();
                         helpers.hoverAction(subheaderoption);
                break;

            }
       }

    }
    public void productSelection(String productOptions) throws InterruptedException {
        for (WebElement subheaderSelection:subheaderSelections) {
            if(subheaderSelection.getText().equalsIgnoreCase(productOptions)){
               // Thread.sleep(3000);
                subheaderSelection.click();
                break;

            }
        }

    }
    public void subHeaderFilterSelections(String filterOptions) throws InterruptedException {
        cookiePolicy.click();
        for (WebElement subHeaderFilter:subHeaderFilters) {
            if (subHeaderFilter.getText().equalsIgnoreCase(filterOptions)) {
               Thread.sleep(3000);
                //helpers.scrolldownoptions(subHeaderFilter);
                subHeaderFilter.click();
                break;
            }
        }
    }
    public void filtersforsub_subheaders(String filterCategory) throws InterruptedException {
                for (WebElement filtersForSubHeaderCategory:filtersForSubHeaderCategorys) {
            if (filtersForSubHeaderCategory.getText().equalsIgnoreCase(filterCategory)) {
                Thread.sleep(3000);
                //helpers.scrolldownoptions(subHeaderFilter);
                filtersForSubHeaderCategory.click();
                break;
            }
        }
    }
}