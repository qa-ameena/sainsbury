package com.maven.sainsbury.utils;

import com.maven.sainsbury.configurations.DriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class Helper extends DriverFactory {

    //random selection of product
    public int radomMethod(int sizeSelection){
        Random random = new Random();
        return random.nextInt(sizeSelection-1); //To allocate number randomly and select product randomly
            }
public void hoverAction(WebElement items) {
    Actions actions = new Actions(driver);
    actions.moveToElement(items).build().perform();
}
public void setWebDriverWaits(WebElement item){
    WebDriverWait waits = new WebDriverWait(driver, 20);
    waits.until(ExpectedConditions.elementToBeClickable(item));
    }
    public void scrollDownOptions(){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        //js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        js.executeScript("window.scrollTo(0,300)");
}
public void dropDownForSelect(WebElement sizePicker){
  Select select= new Select(sizePicker);
}
}


