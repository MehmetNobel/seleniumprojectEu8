package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CRM_Utilities {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }



    public static void crm_login(WebDriver driver) {

        WebElement elementUserName = driver.findElement(By.xpath("//input[@type='text']"));

        elementUserName.sendKeys("helpdesk1@cybertekschool.com");

        WebElement elementPassword=driver.findElement(By.cssSelector("input[placeholder='Password']"));

        elementPassword.sendKeys("UserUser");

        WebElement loginButton=driver.findElement(By.cssSelector("input[type='submit']"));

        loginButton.click();

    }

    public static void crm_login(WebDriver driver, String username, String password) {

        WebElement elementUserName = driver.findElement(By.xpath("//input[@type='text']"));

        elementUserName.sendKeys(username);

        WebElement elementPassword=driver.findElement(By.cssSelector("input[placeholder='Password']"));

        elementPassword.sendKeys(password);

        WebElement loginButton=driver.findElement(By.cssSelector("input[type='submit']"));

        loginButton.click();

    }


}
