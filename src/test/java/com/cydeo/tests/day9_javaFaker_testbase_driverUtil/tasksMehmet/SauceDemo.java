package com.cydeo.tests.day9_javaFaker_testbase_driverUtil.tasksMehmet;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceDemo {

    static WebDriver driver;

    @BeforeMethod
    public void setup(){

        driver= Driver.getDriver();

        driver.get("https://www.saucedemo.com/inventory.html");


    }

    @Test
    public void test1(){

        //driver.findElement()

    }


}
