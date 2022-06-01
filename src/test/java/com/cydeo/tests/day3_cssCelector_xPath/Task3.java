package com.cydeo.tests.day3_cssCelector_xPath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task3 {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        WebElement logInelement = driver.findElement(By.cssSelector("input[type='submit']"));

        String actuallogintext = logInelement.getAttribute("value");

        String expectedLogInText = "Log In";

        if (actuallogintext.equals(expectedLogInText)) {

            System.out.println("actuallogintext = " + actuallogintext);

            System.out.println("expectedLogInText = " + expectedLogInText);

            System.out.println("passed");
        } else
            System.out.println("failed");




    }
}
