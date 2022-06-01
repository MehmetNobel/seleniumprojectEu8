package com.cydeo.tests.day7_webTables_Utilities_javafaker.tasks_Mehmet;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task1 {

    WebDriver driver;

    @BeforeMethod
    public void setup(){

    driver= WebDriverFactory.getDriver("chrome");

    driver.manage().window().maximize();

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @Test
    public void test1(){

     driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

        WebElement element1 = driver.findElement(By.xpath("((//table)[1]//tbody//tr/../tr)[4]/following-sibling::tr[2]//td[2]"));

        System.out.println("element1.getText() = " + element1.getText());

        System.out.println("******************************");

        List<WebElement> elements = driver.findElements(By.xpath("(//table)[1]//tbody//td"));

        for (WebElement element : elements) {

            System.out.println("element.getText() = " + element.getText());

        }



    }







}
