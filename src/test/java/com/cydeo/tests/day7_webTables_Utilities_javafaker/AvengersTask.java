package com.cydeo.tests.day7_webTables_Utilities_javafaker;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AvengersTask {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @Test
    public void test1() {

        driver.get("https://www.automationexercise.com");

        String expectedTitle="Automation Exercise";


       // driver.findElement(By.linkText("/test_cases")).click();



        Assert.assertEquals(driver.getTitle(),expectedTitle);

    }



}