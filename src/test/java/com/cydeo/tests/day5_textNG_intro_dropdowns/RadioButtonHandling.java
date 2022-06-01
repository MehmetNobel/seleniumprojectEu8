package com.cydeo.tests.day5_textNG_intro_dropdowns;

import com.cydeo.utilities.ReviewUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class RadioButtonHandling {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement elementHockeyButton = driver.findElement(By.cssSelector("#hockey"));

        ReviewUtils.staticWait(2);

        elementHockeyButton.click();

        System.out.println("elementHockeyButton.isSelected() = " + elementHockeyButton.isSelected());


    }
}
