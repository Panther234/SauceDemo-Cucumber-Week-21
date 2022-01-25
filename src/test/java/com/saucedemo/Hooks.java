package com.saucedemo;
/*
 * Created By: Hiren Patel
 * Project Name: SauceDemo-Cucumber-Week-21
 */

import com.cucumber.listener.Reporter;
import com.saucedemo.propertyreader.PropertyReader;
import com.saucedemo.utility.Utility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks extends Utility {
    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
        Reporter.assignAuthor("Hiren Patel");// to assign author name in final report
    }
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenShotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        closeBrowser();
    }
}