package com.cydeo.tests.day3_cssCelector_xPath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Amazon {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");

        driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("java"+ Keys.ENTER);

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("img[alt='Effective Java']")).click();

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("a[title='Add to List']")).click();

       /* driver.findElement(By.cssSelector("input[type='email']")).sendKeys("mehmetnobel26@gmail.com"+Keys.ENTER);

        driver.findElement(By.cssSelector("a[id='auth-fpp-link-bottom']")).click();

        driver.findElement(By.cssSelector("input[id='continue']")).click();*/

    }
}
