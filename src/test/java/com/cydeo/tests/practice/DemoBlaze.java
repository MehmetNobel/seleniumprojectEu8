package com.cydeo.tests.practice;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
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

        BrowserUtils.sleep(2);

        sony_vaio_i5Button.click();

        WebElement add_to_cart = driver.findElement(By.partialLinkText("Add to cart"));

        add_to_cart.click();

        BrowserUtils.sleep(2);

        Alert alert=driver.switchTo().alert();

        BrowserUtils.sleep(2);

        alert.accept();

        driver.findElement(By.partialLinkText("Home")).click();

        BrowserUtils.sleep(1);

        driver.findElement(By.partialLinkText("Laptops")).click();

        driver.findElement(By.partialLinkText("Dell i7 8gb")).click();

        BrowserUtils.sleep(2);

        driver.findElement(By.partialLinkText("Add to cart")).click();

        BrowserUtils.sleep(2);

        Alert alert2=driver.switchTo().alert();

        BrowserUtils.sleep(2);

        alert2.accept();

        BrowserUtils.sleep(2);

        driver.findElement(By.partialLinkText("Cart")).click();

        driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();

        Faker faker=new Faker();

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(faker.name().firstName());

        driver.findElement(By.cssSelector("#country")).sendKeys(faker.country().name());

        driver.findElement(By.cssSelector("#city")).sendKeys(faker.address().city());

        driver.findElement(By.cssSelector("#card")).sendKeys("1234567891234567");

        driver.findElement(By.cssSelector("#month")).sendKeys("11");

        driver.findElement(By.cssSelector("#year")).sendKeys("2022");

        driver.findElement(By.xpath("//button[@onclick='purchaseOrder()']")).click();

        String purchasedText = driver.findElement(By.xpath("//p[@style='display: block;']")).getText();

        System.out.println("purchasedText = " + purchasedText);

        System.out.println("*********************************");

        for (String s : purchasedText.split("\n")) {

            System.out.println("s = " + s);

        }

        int price=Integer.parseInt(purchasedText.split("\n")[1].split(" ")[1]);

        System.out.println("price = " + price);


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