package com.cydeo.tests.practice;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoBlaze {

    static WebDriver driver;

    @BeforeMethod
    public void setup(){

        driver= Driver.getDriver();

        driver.get("https://www.demoblaze.com/index.html");

    }

    @Test
    public void test1(){

        WebElement laptops = driver.findElement(By.partialLinkText("Laptops"));

        laptops.click();

        JavascriptExecutor js= (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,500)");

        BrowserUtils.sleep(2);

        WebElement sony_vaio_i5Button = driver.findElement(By.xpath("//img[@src='imgs/sony_vaio_5.jpg']/..//img"));

        BrowserUtils.sleep(1);

        sony_vaio_i5Button.click();

        WebElement add_to_cart = driver.findElement(By.partialLinkText("Add to cart"));

        add_to_cart.click();

        //Alert alert=driver.switchTo().alert();

        BrowserUtils.sleep(2);

        //alert.accept();


    }




}
/*
You have to implement the following Web automated checks over our DEMO ONLINE
    SHOP: https://www.demoblaze.com/index.html
    • Customer navigation through product categories: Phones, Laptops and Monitors
    • Navigate to "Laptop" → "Sony vaio i5" and click on "Add to cart". Accept pop up confirmation.  --- Create a custom method for adding products
    • Navigate to "Laptop" → "Dell i7 8gb" and click on "Add to cart". Accept pop up confirmation.
    • Click on "Place order".
    • Fill in all web form fields. ----USE JavaFaker---create a fillForm() custom method
    • Click on "Purchase"
    • Capture and log purchase Id and Amount.
    • Assert purchase amount equals expected.
    • Click on "Ok"
 */