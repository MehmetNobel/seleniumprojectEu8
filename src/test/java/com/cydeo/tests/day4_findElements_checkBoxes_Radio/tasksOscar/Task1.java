package com.cydeo.tests.day4_findElements_checkBoxes_Radio.tasksOscar;

import com.cydeo.utilities.ReviewUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1 {

    public static void main(String[] args) {


        WebDriver driver= WebDriverFactory.getDriver("Chrome");

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

       /* WebElement elementHome = driver.findElement(By.cssSelector("a[class='nav-link']"));

        WebElement h2Header = driver.findElement(By.tagName("h2"));

        WebElement emailElement = driver.findElement(By.cssSelector("label[for='email']"));
        
       
        */

        WebElement forgot_Password_Button = driver.findElement(By.linkText("Forgot Password"));

        forgot_Password_Button.click();

        ReviewUtils.staticWait(1);

        WebElement elementEmail = driver.findElement(By.name("email"));

        elementEmail.sendKeys("mehmet@gmail.com");

        System.out.println("elementEmail.getAttribute(\"value\") = " + elementEmail.getAttribute("value"));

        WebElement elementButton = driver.findElement(By.cssSelector("button[type='submit']"));

        elementButton.click();

        String actualConfirmation_message = driver.findElement(By.name("confirmation_message")).getText();

        String expectedConfirmationMessage="Your e-mail's been sent!";

        if(actualConfirmation_message.equals(expectedConfirmationMessage))
            System.out.println("passed");
        else
            System.out.println("failed");




    }
}
