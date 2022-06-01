package com.cydeo.tests.day5_textNG_intro_dropdowns;

import com.cydeo.utilities.ReviewUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TaskPolymer {

     static WebDriver driver;

    public static void getTab(String tabText){  // main method is static method.
        // I can NOT use an instance method inside static method, so we declare this method static
        // Second problem was our driver object, we had to make it global and static
        WebElement tab = driver.findElement(By.xpath("//div[.='"+tabText+"']"));
        tab.click();
    }

    public static void main(String[] args) {

        driver= WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://todomvc.com/");

        ReviewUtils.staticWait(1);

        //getTab("Labs");

        //getTab("Compile-to-JS");

        getTab("JavaScript");

        WebElement polymerLink = driver.findElement(By.linkText("Polymer"));

        polymerLink.click();


        WebElement elementEnterToDoItemButton = driver.findElement(By.cssSelector("#new-todo"));

        String str="mehmet";

        elementEnterToDoItemButton.sendKeys(str+ Keys.ENTER);

        ReviewUtils.staticWait(1);

        WebElement elementIsStringDisplayed = driver.findElement(By.xpath("//label[.='" + str + "']"));

        System.out.println("elementIsStringDisplayed.isDisplayed() = " + elementIsStringDisplayed.isDisplayed());

        String str2="semih";

        ReviewUtils.staticWait(1);

        elementEnterToDoItemButton.sendKeys(str2+ Keys.ENTER);

        WebElement elementIsStringDisplayed2 = driver.findElement(By.xpath("//label[.='" + str2 + "']"));

        System.out.println("elementIsStringDisplayed.isDisplayed() = " + elementIsStringDisplayed2.isDisplayed());


    }
}
