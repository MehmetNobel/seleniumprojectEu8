package com.cydeo.tests.day4_findElements_checkBoxes_Radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T2_FindElements {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("Chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/abtest");

        List<WebElement> linksElements = driver.findElements(By.tagName("a"));

        System.out.println("linksElements.size() = " + linksElements.size());

        for (WebElement linksElement : linksElements) {

            System.out.println("linksElement.getAttribute(\"href\") = " + linksElement.getAttribute("href"));
            System.out.println("linksElement.getText() = " + linksElement.getText());
        }




    }
}
