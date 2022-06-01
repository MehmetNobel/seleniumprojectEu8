package com.cydeo.tests.day7_webTables_Utilities_javafaker;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task3_WebTables {


    WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @Test
    public void test1() {

        driver.get("https://practice.cydeo.com/tables");

        //Select selectMonthDropDown=new Select(driver.findElement(By.xpath("//select[@id='month']")));

        //selectMonthDropDown.selectByVisibleText("August");

        WebElement element = driver.findElement(By.xpath("(//table)[1]/tbody/tr"));

        String table1Row1Text = element.getText();

        System.out.println("table1Row1Text = " + table1Row1Text);

        System.out.println("*************************");

        List<WebElement> elements = driver.findElements(By.xpath("(//table)[1]//td"));

        for (WebElement webElement : elements) {

            System.out.println("webElement.getText() = " + webElement.getText());

        }

        //   (//table)[1]//td[.='Frank']    we can define specifically as well


    }


}
