package com.cydeo.tests.day2_locators_getText_getAttribute.tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("http://zero.webappsecurity.com/login.html ");

        String expectedHeaderTask="Log in to ZeroBank";

        String actualHeaderTask=driver.findElement(By.tagName("h3")).getText();

        if(actualHeaderTask.equals(expectedHeaderTask))

            System.out.println("test passed");
        else
            System.out.println("test failed");


    }
}
