package com.cydeo.tests.day9_javafaker_testbase_driverUtil.tasksMehmet;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Automationexercise_1 {

    WebDriver driver;


    @BeforeMethod
    public void setup(){

        driver= WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @Test
    public void test(){

        driver.get("https://www.automationexercise.com/contact_us");

        System.out.println("driver.getTitle() = " + driver.getTitle());

        System.out.println("driver.findElement(By.xpath(\"//h2[.='Get In Touch']\")).getText() = " + driver.findElement(By.xpath("//h2[.='Get In Touch']")).getText());

        driver.findElement(By.xpath("//input[@data-qa='name']")).sendKeys("Mehmet"+ Keys.ENTER);

        BrowserUtils.sleep(2);

       // Alert alert=driver.switchTo().alert();

        //alert.accept();

        driver.findElement(By.xpath("//input[@data-qa='email']")).sendKeys("mehmetnobel26@gmail.com"+Keys.ENTER);

        BrowserUtils.sleep(2);

        /*driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("u are doing great!!"+Keys.ENTER);
        BrowserUtils.sleep(2);

        driver.findElement(By.xpath("//input[@data-qa='subject']")).sendKeys("u are doing great!!"+Keys.ENTER);

        BrowserUtils.sleep(2);

         */




    }






}
