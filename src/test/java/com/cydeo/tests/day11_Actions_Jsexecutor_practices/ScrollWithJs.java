package com.cydeo.tests.day11_Actions_Jsexecutor_practices;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScrollWithJs {

    static WebDriver driver;

    @BeforeMethod
    public void setup(){

        driver= Driver.getDriver();

        driver.get("https://practice.cydeo.com/large");

    }

    @Test
    public void test1(){

        WebElement cydeoBottom = driver.findElement(By.partialLinkText("CYDEO"));

        WebElement homeButton = driver.findElement(By.partialLinkText("Home"));

        JavascriptExecutor js= (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView(true)",cydeoBottom);  // argument 0 means cydeobottom

        BrowserUtils.sleep(2);

        //these javascrpit methods. since we use that method we must downcast to JavaScript Interface first.
        js.executeScript("arguments[1].scrollIntoView(true)",cydeoBottom,homeButton);  // argument 1 means homebutton ; takes that








    }
}
