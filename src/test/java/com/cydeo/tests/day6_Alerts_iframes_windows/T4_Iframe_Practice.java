package com.cydeo.tests.day6_Alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Iframe_Practice {


    WebDriver driver;


    @BeforeMethod
    public void setup() {

        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    //@Ignore
    @Test
    public void iframeTest1() {

        driver.get("https://practice.cydeo.com/iframe");

        //waiting 10 seconds for implicitly wait.after then gives no such element exception.

        // driver.switchTo().frame(0);   one way to access the inner html

        driver.switchTo().frame("mce_0_ifr");

        WebElement elementInsideText = driver.findElement(By.xpath("//p"));

        System.out.println("elementInsideText = " + elementInsideText.getText());

        // we need to focus drivers focus to the inner html.

        Assert.assertTrue(elementInsideText.isDisplayed());

        driver.switchTo().parentFrame();

        String textOuter = driver.findElement(By.xpath("//h3")).getText();

        String expectedOuterText="An iFrame containing the TinyMCE WYSIWYG Editor";

        Assert.assertTrue(textOuter.equals(expectedOuterText));


    }
}