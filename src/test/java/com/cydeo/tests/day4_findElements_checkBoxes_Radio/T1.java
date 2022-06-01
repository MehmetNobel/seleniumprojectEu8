package com.cydeo.tests.day4_findElements_checkBoxes_Radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1 {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("Chrome");

        driver.get("https://practice.cydeo.com/");

        driver.manage().window().maximize();

        WebElement homeElement = driver.findElement(By.cssSelector("a[class='nav-link']"));

        WebElement homeElement2 = driver.findElement(By.cssSelector(".nav-link"));

        WebElement homeElement3 = driver.findElement(By.cssSelector("a[href=\"/\"]"));

        WebElement forgotPasswordElement = driver.findElement(By.cssSelector("a[href='/forgot_password']"));

        WebElement forgotPasswordElement2 = driver.findElement(By.xpath("//a[.='Forgot Password']"));

        WebElement forgotPasswprdElement3 = driver.findElement(By.xpath("//div//ul//li[20]"));// forgotpassword

        WebElement forgotpassordHeaderElement1 = driver.findElement(By.cssSelector("//div.example>h2"));

        WebElement forgotpassordHeaderElement2 = driver.findElement(By.xpath("//html//body//div//div[2]//div[1]//h2"));

        WebElement forgotpassordHeaderElement3 = driver.findElement(By.xpath("//h2"));  // will directly jump to h2

        // driver.findElement(By.xpath("//h2[.='Forgot Password']")); or
        // driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        driver.findElement(By.xpath("//label[.='E-mail']")).isDisplayed();  // 1 .way for email

        driver.findElement(By.xpath("//label")); // 2 .way for email

        driver.findElement(By.cssSelector("div.large-6>label")); // 3 .way for email

        driver.findElement(By.cssSelector("div.large-6>input")); // 1.way for email box.

        driver.findElement(By.cssSelector("//input")); // 1.way for email box.

        driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));  // 2.way for email box

        driver.findElement(By.xpath("//i[.='Retrieve password']"));  // 1.way retrieve password

        driver.findElement(By.xpath("i[class='icon-2x icon-signin']"));  // 2.way retrieve password

        driver.findElement(By.xpath("//i[contains(@class,'icon')]"));   // 3.way retrieve password

        driver.findElement(By.cssSelector("i.icon-2x")); //4 .way

        driver.findElement(By.cssSelector("i.icon-signin"));  //5 .way







    }
}
