package com.cydeo.tests.day5_textNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TaskHepsiBurada {

    WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDownMethod() {

       // driver.close();
    }

    @Test
    public void selenium_test() {

        driver.get("https://www.hepsiburada.com/");

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Samsung TV"+ Keys.ENTER);

        //driver.findElement(By.cssSelector("input[value='samsung']")).click();

        driver.findElement(By.cssSelector("input[placeholder='En az']")).sendKeys("3000"+Keys.ENTER);

        driver.findElement(By.cssSelector("input[placeholder='En çok']")).sendKeys("4000"+Keys.ENTER);

        driver.findElement(By.cssSelector("button[kind='primary']")).click();


        /*String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, "Google");

         */

    }
}




