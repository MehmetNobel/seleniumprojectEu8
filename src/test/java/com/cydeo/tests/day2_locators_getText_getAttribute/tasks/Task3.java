package com.cydeo.tests.day2_locators_getText_getAttribute.tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://google.com");

        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);

        String expectedTitle="apple";

        String actualTitle=driver.getTitle();

        if(actualTitle.startsWith(expectedTitle))

            System.out.println("Test passed");
        else
            System.out.println("Test failed");


    }
}
