package com.cydeo.tests.day9_javafaker_testbase_driverUtil.tasksMehmet;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Practice2 {

    WebDriver driver;


    @BeforeMethod
    public void setup() {

        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    public void test() {

        driver.get("https://www.automationexercise.com/contact_us");

        System.out.println("driver.getTitle() = " + driver.getTitle());

        driver.findElement(By.xpath("//a[@href='/products']")).click();

        System.out.println("driver.findElement(By.xpath(\"//h2[.='All Products']\")).isDisplayed() = " + driver.findElement(By.xpath("//h2[.='All Products']")).isDisplayed());

        driver.findElement(By.xpath("//a[@href='/product_details/2']")).click();

        System.out.println("driver.findElement(By.xpath(\"//h2[.='Men Tshirt']\")).isDisplayed() = " + driver.findElement(By.xpath("//h2[.='Men Tshirt']")).isDisplayed());

        BrowserUtils.sleep(2);

        driver.findElement(By.xpath("//button[@type='button']")).click();

        BrowserUtils.sleep(1);

        driver.findElement(By.xpath("//button[.='Continue Shopping']")).click();




    }
}