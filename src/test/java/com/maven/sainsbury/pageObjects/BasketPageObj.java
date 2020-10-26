package com.maven.sainsbury.pageObjects;

import com.maven.sainsbury.configurations.DriverFactory;
import com.maven.sainsbury.utils.Helper;
import cucumber.runtime.io.Helpers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BasketPageObj extends DriverFactory {
    Helper helpers = new Helper();


    @FindBy(css=".tu-c-product-card ")//webElements for the list of products on results page
    private List<WebElement> productList;

    @FindBy(css="#productVariantSize") // to select the size
    private WebElement sizePickerList;


    @FindBy(css="#AddToCart")
   private WebElement addToBasket;

    @FindBy(css="#minicart_data")
    private WebElement cartDetails;

    public String randomProductSelection(){
        int product = productList.size();//to get the product list size to be stored in variable(to know number of products in a page)
        System.out.println(product);
        int randomList = helpers.radomMethod(product);//this is to select a product randomly from the above list
       String productInString = productList.get(randomList).getText();//To capture the product label from the randomList
        System.out.println(productInString);
        productList.get(randomList).click();
        return productInString;
    }

    public void sizeSelectionForProduct() throws InterruptedException {
        sizePickerList.click();
        Select select = new Select(sizePickerList);
     Thread.sleep(2000);
     select.selectByIndex(2);
    }

    public void addingProductToBasket(){
        helpers.scrolldownoptions();
        addToBasket.click();
    }

public String assertCartDetails(){
    System.out.println(cartDetails.getText());
    return  cartDetails.getText();

}
    }

