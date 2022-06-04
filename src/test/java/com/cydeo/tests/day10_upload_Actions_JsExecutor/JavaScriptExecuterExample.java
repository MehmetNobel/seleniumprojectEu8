package com.cydeo.tests.day10_upload_Actions_JsExecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExecuterExample {

    static WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = Driver.getDriver();

        driver.get("https://practice.cydeo.com/infinite_scroll");

    }

    @Test
    public void action1() {


        JavascriptExecutor js = (JavascriptExecutor) driver;

        for (int i = 0; i <10 ; i++) {

            BrowserUtils.sleep(1);

            js.executeScript("window.scrollBy(0,750)");  // for going down


        }
        for (int i = 0; i < 10; i++) {

            BrowserUtils.sleep(1);

            js.executeScript("window.scrollBy(0,-750)");  // for going up


        }



    }
}