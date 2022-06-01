package com.cydeo.tests.day6_Alerts_iframes_windows;

import com.cydeo.utilities.ReviewUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task2_Oscar {

    WebDriver driver;


    @BeforeMethod
    public void setup() {

        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void TesterLoginTest1() {

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx");

        driver.findElement(By.cssSelector("#ctl00_MainContent_username")).sendKeys("Tester");

        driver.findElement(By.cssSelector("#ctl00_MainContent_password")).sendKeys("test");

        driver.findElement(By.cssSelector("input[value='Login']")).click();

        driver.findElement(By.xpath("//a[.='Check All']")).click();

        ReviewUtils.staticWait(1);

        List<WebElement> elements = driver.findElements(By.xpath("//input[@type='checkbox']"));

        for (WebElement element : elements) {

            System.out.println("element.isSelected() = " + element.isSelected());

        }

        driver.findElement(By.xpath("//a[.='Uncheck All']")).click();

        elements = driver.findElements(By.xpath("//input[@type='checkbox']"));

        for (WebElement element : elements) {

            System.out.println("element.isSelected() = " + element.isSelected());

        }








    }
}