package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        // setting up the webdriver

        WebDriverManager.chromedriver().setup();

        //this line opens an emtpy browser for us.
        WebDriver driver=new ChromeDriver();

        //maximize the page

        driver.manage().window().maximize();

        //driver.manage().window().fullscreen(); it is useful for mac.sometimes it does not work on windows.
        //so we perefer to use maximize() method.

        driver.get("https://www.tesla.com");

        Thread.sleep(3000);

        driver.navigate().back();

        Thread.sleep(3000);

        driver.navigate().forward(); // navigates forward

        Thread.sleep(3000);

        driver.navigate().refresh();  // refreshes the pages

        // the other way for navigating. same with .get() method

        driver.navigate().to("https://www.google.com");

        System.out.println("driver.getTitle() = " + driver.getTitle());

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        driver.close(); // closes the current tab.

        //driver.quit();  closes all the tabs.


    }
}
