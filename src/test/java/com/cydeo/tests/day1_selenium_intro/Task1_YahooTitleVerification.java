package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.yahoo.com");

        Thread.sleep(2000);

        System.out.println("driver.getTitle() = " + driver.getTitle());

        if(driver.getTitle().contains("Yahoo"))
            System.out.println("yes, it is yahoo exactly.");


    }
}
