package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

    public static void sleep(int seconds) {

        seconds *= 1000;

        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {

        }
    }

    public static void switchWindowAndVeriy(WebDriver driver, String expectedInUrl, String expectedInTitle) {

        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String each : allWindowHandles) {
            driver.switchTo().window(each);
            System.out.println(driver.getCurrentUrl());
            if (driver.getCurrentUrl().contains(expectedInUrl)) {
                break;
            }
        }

        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }


    public static void verifyTitle(WebDriver driver, String expectedTitle){

        Assert.assertEquals(driver.getTitle(),expectedTitle);
    }



}
