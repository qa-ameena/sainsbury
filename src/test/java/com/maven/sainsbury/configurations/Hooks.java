package com.maven.sainsbury.configurations;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks  {
    DriverFactory driverfactory = new DriverFactory();
    @Before
    public void setUp(){
        driverfactory.setDriver("chrome");
        driverfactory.setUrl("https://www.sainsburys.co.uk/");
        driverfactory.maximiseWindow();
        //driverfactory.deleteCookies();
        driverfactory.timeOuts();
      //  driverfactory.setAcceptCookies();
           }
           @After
    public void tearDown(){

// driverfactory.closeBrowser();//
}
}