package com.cydeo.tests.day5_textNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class StaleElementsTask1 {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/add_remove_elements/");

        WebElement elementAddButton = driver.findElement(By.xpath("//button[.='Add Element']"));

        elementAddButton.click();

        WebElement elementDeleteButton = driver.findElement(By.cssSelector("button[class='added-manually']"));

        System.out.println("elementDeleteButton.isDisplayed() = " + elementDeleteButton.isDisplayed());

        elementDeleteButton = driver.findElement(By.cssSelector("button[class='added-manually']"));

        elementDeleteButton.click();

        try {
            System.out.println("elementDeleteButton.isDisplayed() = " + elementDeleteButton.isDisplayed());
        } catch (StaleElementReferenceException e) {
            System.out.println("the delete button element has no any more");
        }

    }
}
