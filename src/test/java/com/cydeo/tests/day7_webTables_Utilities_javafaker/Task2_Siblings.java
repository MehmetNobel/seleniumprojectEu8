package com.cydeo.tests.day7_webTables_Utilities_javafaker;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task2_Siblings {


    WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @Test
    public void test1() {

        driver.get("https://practice.cydeo.com/dropdown");

       //Select selectMonthDropDown=new Select(driver.findElement(By.xpath("//option[.='August']/following-sibling::option[1]")));

        Select selectMonthDropDown=new Select(driver.findElement(By.xpath("//select[@id='month']")));

        selectMonthDropDown.selectByVisibleText("August");
    }

    @AfterMethod
    public void tearDown() {
        //driver.quit();

    }
}


