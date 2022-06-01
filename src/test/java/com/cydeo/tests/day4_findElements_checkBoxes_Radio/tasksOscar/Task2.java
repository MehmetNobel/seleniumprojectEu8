package com.cydeo.tests.day4_findElements_checkBoxes_Radio.tasksOscar;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Task2 {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        String expectedTitle = "Web Orders";

        driver.findElement(By.cssSelector("#ctl00_MainContent_username")).sendKeys("Tester");

        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");

        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        String actualTitle=driver.getTitle();

        if (actualTitle.equals(expectedTitle))
            System.out.println("passed");
        else
            System.out.println("failed");








    }
}
