package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TrialForJustChromeDriver {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        ChromeDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");

        driver.executeScript("window.scrollBy(0,750)");

        Actions actions=new Actions(driver);

        actions.moveToElement(driver.findElement(By.xpath("//img[@alt='Shop Pet supplies']"))).perform();








    }



}
