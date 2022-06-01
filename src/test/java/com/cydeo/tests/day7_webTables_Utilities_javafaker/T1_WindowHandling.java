package com.cydeo.tests.day7_webTables_Utilities_javafaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class    T1_WindowHandling {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @Test
    public void test1() {

        driver.get("https://amazon.com.tr");

        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com', '_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com', '_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com', '_blank');");

        BrowserUtils.switchWindowAndVeriy(driver,"etsy","Etsy");

    }

    @AfterMethod
    public void tearDown() {
        //driver.quit();

    }
}
