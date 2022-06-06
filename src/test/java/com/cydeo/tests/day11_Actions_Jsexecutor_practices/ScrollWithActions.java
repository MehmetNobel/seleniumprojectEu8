package com.cydeo.tests.day11_Actions_Jsexecutor_practices;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScrollWithActions {

    static WebDriver driver;

    @BeforeMethod
    public void setup(){

        driver= Driver.getDriver();

    }


    @Test
    public void test(){

        // ways for scrolling
        // 1 : moveToElement .. actions
        // 2: actions.sendKeys(Keys.PageUop).perform
        // 3: js.scrollDown("Scroll by 2////


        driver.get("https://practice.cydeo.com/");

        Actions actions=new Actions(driver);

        BrowserUtils.sleep(2);

        actions.moveToElement(driver.findElement(By.xpath("//div[text()='Powered by ']"))).perform();

        BrowserUtils.sleep(2);

       //actions.sendKeys(Keys.PAGE_UP).perform();  // goes up some part..

       actions.moveToElement(driver.findElement(By.partialLinkText("Home"))).perform();

       BrowserUtils.sleep(2);

       Driver.closeDriver();

    }

    @Test
    public void test2(){

        driver.get("https://practice.cydeo.com/");

        JavascriptExecutor js= (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,750)");




    }



}
