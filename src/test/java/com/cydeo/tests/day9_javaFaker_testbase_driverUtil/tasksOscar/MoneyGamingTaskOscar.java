package com.cydeo.tests.day9_javafaker_testbase_driverUtil.tasksOscar;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MoneyGamingTaskOscar {

    public WebDriver driver;


    @BeforeMethod
    public void setup(){

        //Driver.getDriver().get("https://google.com/%22");
        //WebElement iAgree = Driver.getDriver().findElement(By.xpath("//button[@id="L2AGLb"]/div"));
        //iAgree.click();

        //WebElement iAgree=driver.findElement(By.xpath("//button[@id=\"L2AGLb\"]/div"));

        //iAgree.click();

        driver= Driver.getDriver();

        driver.get("https://moneygaming.qa.gameaccount.com/main.do");



    }

    @Test
    public void test(){

        WebElement joinNowButton = driver.findElement(By.xpath("//a[@href='/sign-up.shtml']"));

        joinNowButton.click();

        Select select = new Select(driver.findElement(By.xpath("//select[@name='map(title)']")));

        select.selectByVisibleText("Mr");

        WebElement nameTextAarea = driver.findElement(By.xpath("//input[@name='map(firstName)']"));

        nameTextAarea.sendKeys("Mehmet");

        WebElement surNameTextAarea = driver.findElement(By.xpath("//input[@name='map(lastName)']"));

        surNameTextAarea.sendKeys("Nobel");

        WebElement checkboxButton = driver.findElement(By.xpath("//input[@name='map(terms)']"));

        checkboxButton.click();

        WebElement joinNowButton2 = driver.findElement(By.xpath("//input[@value='Join Now!']"));

        joinNowButton2.click();

        WebElement warningTextArea = driver.findElement(By.xpath("//label[.='This field is required']"));

        String text = warningTextArea.getText();

        String expetedText="This field is required";

        Assert.assertEquals(text,expetedText,"Texts are not same!!");


    }



}
