package com.cydeo.tests.day6_Alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task3_Windows {


    WebDriver driver;


    @BeforeMethod
    public void setup() {

        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    //@Ignore
    @Test
    public void iframeTest1() {

        driver.get("https://practice.cydeo.com/windows");

        driver.findElement(By.xpath("//a[.='Click Here']")).click();

        // driver.getWindowHandles()   ==>> return Set<String> not to contain any duplicate value.

        for (String windowHandle : driver.getWindowHandles()) {

            driver.switchTo().window(windowHandle);
            System.out.println("driver.getTitle() = " + driver.getTitle());

        }

        String expectedTitle="New Window";

        String actualTitle=driver.getTitle();

        System.out.println("actualTitle = " + actualTitle);

        Assert.assertEquals(actualTitle,expectedTitle);

    }




}