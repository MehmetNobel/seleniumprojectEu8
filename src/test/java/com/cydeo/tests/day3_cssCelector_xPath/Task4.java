package com.cydeo.tests.day3_cssCelector_xPath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task4 {

    public static void main(String[] args) {


        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        WebElement forgotPasswordElement = driver.findElement(By.cssSelector("button[class='login-btn']"));

        String actualButtonText=forgotPasswordElement.getText();

        String expectedButtonText="Reset password";

        if(actualButtonText.equals(expectedButtonText))
            System.out.println("passed");
        else
            System.out.println("failed");


    }
}
