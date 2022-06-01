package com.cydeo.tests.day3_cssCelector_xPath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task2 {

    public static void main(String[] args) {

        //isdisplayed method gives us true or false if the web element is displayed in the page or not.

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        WebElement rememberMeButton = driver.findElement(By.className("login-item-checkbox-label"));

        System.out.println("rememberMeButton.isDisplayed() = " + rememberMeButton.isDisplayed());

        String rememberMeActualText = rememberMeButton.getText();

        String rememberMeExpectedText="Remember me on this computer";

        if (rememberMeActualText.equals(rememberMeExpectedText))
            System.out.println("passed");
        else
            System.out.println("failed");

        WebElement forgotPassword = driver.findElement(By.className("login-link-forgot-pass"));

        String expectedForgotPassword="Forgot your password?";

        String actualForgotPassword=forgotPassword.getText();

        if(actualForgotPassword.equals(expectedForgotPassword))
            System.out.println("passed");
        else
            System.out.println("failed");

        String hrefValue = forgotPassword.getAttribute("href");

        String expectedhrefValue="forgot_password=yes";

        if (hrefValue.contains(expectedhrefValue))
            System.out.println("href passed");
        else
            System.out.println("href failed");



    }
}
