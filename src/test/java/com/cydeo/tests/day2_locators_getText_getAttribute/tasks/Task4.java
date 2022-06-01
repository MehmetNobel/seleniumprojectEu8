package com.cydeo.tests.day2_locators_getText_getAttribute.tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/inputs ");

        driver.findElement(By.linkText("Home")).click();

        String expectedTitle="Practice";

        String actualTitle=driver.getTitle();

        if(actualTitle.equals(expectedTitle))
            
            System.out.println("Test passed");
        else
            System.out.println("Test failed");


    }
}
