package com.maven.sainsbury.configurations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver driver;
    public DriverFactory(){PageFactory.initElements(driver,this);}
    public void setDriver(String browser){
        switch(browser){
            case"chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;
            case"IE":
                WebDriverManager.iedriver().setup();
                driver=new InternetExplorerDriver();
                break;
                default:
                    driver = new SafariDriver();
            break;

        }

    }


    public void setUrl(String url) {
        driver.get(url);
    }

    public void maximiseWindow() {
        driver.manage().window().maximize();
    }

    public void timeOuts() {
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
    }

    public void deleteCookies() {
        driver.manage().deleteAllCookies();
    }

    public void closeBrowser() {
        driver.close();
    }

//    @FindBy(id = "onetrust-accept-btn-handler")
//    private WebElement acceptCookies;

//public void setAcceptCookies(){
  //  acceptCookies.click();

}
