package com.cydeo.tests.day6_Alerts_iframes_windows;

import com.cydeo.utilities.ReviewUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task1_Alerts_1 {

    WebDriver driver;


    @BeforeMethod
    public void setup() {

        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void alertTest1() {

        driver.get("https://practice.cydeo.com/javascript_alerts");

        WebElement alertjs1 = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));

        alertjs1.click();

        Alert alertJSAlert = driver.switchTo().alert();

        //we must switch to the alert and accept it.

        alertJSAlert.accept();

        String expectedalert1text = "You successfully clicked an alert";

        String actualAlert1Text = driver.findElement(By.xpath("//p[.='You successfully clicked an alert']")).getText();

        Assert.assertEquals(actualAlert1Text, expectedalert1text);

    }

    @Test
    public void alertTest2() {

        driver.get("https://practice.cydeo.com/javascript_alerts");

        WebElement elementJsConfirm = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));

        ReviewUtils.staticWait(1);

        elementJsConfirm.click();

        Alert alert = driver.switchTo().alert();

        ReviewUtils.staticWait(1);

        alert.accept();

        WebElement actualTextElement = driver.findElement(By.xpath("//p[.='You clicked: Ok']"));

        String actualtext = actualTextElement.getText();

        String expectedText = "You clicked: Ok";

        Assert.assertEquals(actualtext, expectedText);

    }

    @Test
    public void alertTest3() {

        driver.get("https://practice.cydeo.com/javascript_alerts");

        WebElement elementJsConfirm = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));

        elementJsConfirm.click();

        Alert alert = driver.switchTo().alert();

        String str = "ok";

        alert.sendKeys(str);

        alert.accept();

        WebElement actualTextElement = driver.findElement(By.xpath("//p[.='You entered: " + str + "']"));

        String text = actualTextElement.getText();

        String expected = "You entered: " + str;

        Assert.assertEquals(text,expected,"failed");


    }
}