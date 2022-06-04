package com.cydeo.tests.day10_upload_Actions_JsExecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UploadTask {

    static WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = Driver.getDriver();

        driver.get("https://practice.cydeo.com/upload");

    }

    @Test
    public void uploadTest1() {

        WebElement chooseFileButton = driver.findElement(By.xpath("//input[@id='file-upload']"));

        String path = "C:\\Users\\ev\\Desktop\\metin.txt";

        BrowserUtils.sleep(2);

        chooseFileButton.sendKeys(path);

        WebElement uploadButton = driver.findElement(By.xpath("//input[@id='file-submit']"));

        uploadButton.click();

        WebElement fileUploadedMessage = driver.findElement(By.tagName("h3"));

        System.out.println("fileUploadedMessage.isDisplayed() = " + fileUploadedMessage.isDisplayed());

        Assert.assertTrue(fileUploadedMessage.isDisplayed());


    }


}
