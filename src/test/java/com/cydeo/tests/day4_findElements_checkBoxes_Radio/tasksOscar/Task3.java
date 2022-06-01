package com.cydeo.tests.day4_findElements_checkBoxes_Radio.tasksOscar;

import com.cydeo.utilities.ReviewUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Task3 {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://www.demoblaze.com/index.html");

        driver.findElement(By.linkText("Laptops")).click();

        ReviewUtils.staticWait(1);

        driver.findElement(By.linkText("Sony vaio i5")).click();

        ReviewUtils.staticWait(1);

        String actualPrice=driver.findElement(By.cssSelector("h3[class='price-container']")).getText();

        int expectedPrice=790;

        System.out.println(actualPrice);  //$790 *includes tax

        String arr[]=actualPrice.split(" ");

        int actualPriceInt=Integer.parseInt((arr[0].substring(1)));

        if(actualPriceInt==expectedPrice)
            System.out.println("passed");
        else
            System.out.println("failed");







    }
}
