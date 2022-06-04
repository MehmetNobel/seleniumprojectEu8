package com.cydeo.tests.day10_upload_Actions_JsExecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExecuter {

    static WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = Driver.getDriver();

        driver.get("https://practice.cydeo.com/hovers");

    }

    @Test
    public void action1() {

        //((JavascriptExecutor)driver).executeScript("window")

        //JavaScriptExecuter


    }
}