package com.cydeo.tests.day4_findElements_checkBoxes_Radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T6_StaleElementReferenceException {

    public static void main(String[] args) {

        //staleelementexception cuts the connection btw driver and locator.
        //so after refreshing we must reassign the locator not to get staleelementreferenceexception.

        WebDriver driver= WebDriverFactory.getDriver("Chrome");

        driver.manage().window().maximize();

        //it is enough to set just one time for implicit wait for a whole session.

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/abtest");

        WebElement cydeoButton = driver.findElement(By.linkText("CYDEO"));

        System.out.println("cydeoButton.isDisplayed() = " + cydeoButton.isDisplayed());

        driver.navigate().refresh();

        cydeoButton = driver.findElement(By.linkText("CYDEO"));

        System.out.println("cydeoButton.isDisplayed() = " + cydeoButton.isDisplayed());





    }
}
