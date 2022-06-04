package com.cydeo.tests.day10_upload_Actions_JsExecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsTask {

    static WebDriver driver;

    @BeforeMethod
    public void setup(){

        driver= Driver.getDriver();

        driver.get("https://practice.cydeo.com/hovers");

    }

    @Test
    public void action1(){

        WebElement picture1 = driver.findElement(By.xpath("(//img)[1]"));
        WebElement picture2 = driver.findElement(By.xpath("(//img)[2]"));
        WebElement picture3 = driver.findElement(By.xpath("(//img)[3]"));

        WebElement user1 = driver.findElement(By.xpath("//h5[.='name: user1']"));
        WebElement user2 = driver.findElement(By.xpath("//h5[.='name: user2']"));
        WebElement user3 = driver.findElement(By.xpath("//h5[.='name: user3']"));

        Actions actions=new Actions(driver);

        actions.moveToElement(picture1).perform();

        BrowserUtils.sleep(1);

        Assert.assertTrue(picture1.isDisplayed());

        actions.moveToElement(picture2).perform();  // if we dont write perform it will not work.

        BrowserUtils.sleep(1);

        Assert.assertTrue(picture2.isDisplayed());

        actions.moveToElement(picture3).perform();

        BrowserUtils.sleep(1);

        Assert.assertTrue(picture3.isDisplayed());



    }

}
