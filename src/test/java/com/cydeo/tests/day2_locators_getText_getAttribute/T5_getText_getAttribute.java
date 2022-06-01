package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://practice.cydeo.com/registration_form");

        String registrationText=driver.findElement(By.tagName("h2")).getText();

        String expectedRegistrationText="Registration form";

        if(registrationText.equals(expectedRegistrationText))
            System.out.println("test passed");
        else
            System.out.println("test failed");

        String actualPlaceHolderValue=driver.findElement(By.name("firstname")).getAttribute("placeholder");
        String expectedPlaceHolderValue="first name";
        if(expectedPlaceHolderValue.equals(actualPlaceHolderValue))
            System.out.println("passed");
        else
            System.out.println("failed");






    }
}
