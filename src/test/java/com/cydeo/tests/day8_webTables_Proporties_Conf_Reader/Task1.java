package com.cydeo.tests.day8_webTables_Proporties_Conf_Reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task1 {


    public WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void webTableTest1() {

        driver.get("https://practice.cydeo.com/web-tables");

        WebElement elementBobMartin = driver.findElement(By.xpath("//tbody//tbody//td[.='Bob Martin']"));

        System.out.println("elementBobMartin.getText() = " + elementBobMartin.getText());

        System.out.println("elementBobMartin.isDisplayed() = " + elementBobMartin.isDisplayed());

        WebElement elementBobDate = driver.findElement(By.xpath("//tbody//tbody//td[.='Bob Martin']/following-sibling::td[3]"));

        System.out.println("elementBobDate.isDisplayed() = " + elementBobDate.isDisplayed());

        System.out.println("elementBobDate.getText() = " + elementBobDate.getText());

        List<WebElement> names = driver.findElements(By.xpath("//input[@id='ctl00_MainContent_orderGrid_ctl07_OrderSelector']"));

        for (WebElement name : names) {

            System.out.println("name.getText() = " + name.getText());

        }

        String expected = "12/31/2021";

        String actual = elementBobDate.getText();

        Assert.assertEquals(actual, expected);


    }

    @Test
    public void webTableTest2() {

        driver.get("https://practice.cydeo.com/web-tables");

        String customerText = WebTableUtils.returnOrderDate(driver, "Samuel Jackson");

        System.out.println("customerText = " + customerText);


    }

     @Test
    public void webTableTest3(){

         driver.get("https://practice.cydeo.com/web-tables");

         WebTableUtils.orderVerify(driver,"Samuel Jackson","12/21/2021");

     }

}

