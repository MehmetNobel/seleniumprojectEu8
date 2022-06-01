package com.cydeo.tests.day9_javafaker_testbase_driverUtil.tasksMehmet;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandling {

   /* WebDriver driver;


    @BeforeMethod
    public void setup() {

        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    */

    @Test
    public void test() {


        Driver.getDriver().get("https://www.hyrtutorials.com/p/window-handles-practice.html");

        Driver.getDriver().findElement(By.xpath("//button[@id='newWindowBtn']")).click();

        Set<String> windowHandles = Driver.getDriver().getWindowHandles();

        for (String each : windowHandles) {

            Driver.getDriver().switchTo().window(each);

            if (Driver.getDriver().getTitle().contains("Basic"))
                break;
        }

        System.out.println("driver.getTitle() = " + Driver.getDriver().getTitle());

        Driver.getDriver().manage().window().maximize();

        BrowserUtils.sleep(2);

        Driver.getDriver().findElement(By.xpath("(//a[.='Contact'])[2]")).click();

        for (String each : windowHandles) {
            Driver.getDriver().switchTo().window(each);
            if (Driver.getDriver().getTitle().contains("Window"))
                break;
        }

        System.out.println("driver.getTitle() = " + Driver.getDriver().getTitle());

        BrowserUtils.sleep(2);

        // Select select= new Select(driver.findElement(By.xpath("//select[@id='selectnav1']")));

        //select.selectByVisibleText("YouTube Courses");

        //Driver.getDriver().findElement(By.xpath("(//a[.='Tutorials'])[1]")).click();

        Select select = new Select(Driver.getDriver().findElement(By.xpath("//select[@id='selectnav2']")));

        select.selectByVisibleText("Contact");


    }
}