package com.cydeo.tests.practice_1;

import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SmartBearOscarExample {

    static WebDriver driver;

    @BeforeMethod
    public void setup(){

        driver= Driver.getDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }

    @Test
    public void test1(){

        WebElement userName = driver.findElement(By.cssSelector("#ctl00_MainContent_username"));

        userName.sendKeys("Tester");

        WebElement password = driver.findElement(By.xpath("//input[contains(@name,'pass')]"));

        password.sendKeys("test");

        WebElement loginButton = driver.findElement(By.xpath("//input[contains(@id,'log')]"));

        loginButton.click();

        WebElement orderButton = driver.findElement(By.partialLinkText("Order"));

        orderButton.click();

        WebElement selectButton = driver.findElement(By.xpath("//select[contains(@name,'ctl00')]"));

        Select dropdown=new Select(selectButton);

        System.out.println("dropdown.getFirstSelectedOption().getText() = " + dropdown.getFirstSelectedOption().getText());

        dropdown.selectByVisibleText("FamilyAlbum");

        System.out.println("dropdown.getFirstSelectedOption().getText() = " + dropdown.getFirstSelectedOption().getText());

        WebElement quantityArea = driver.findElement(By.xpath("//input[contains(@id,'Quan')]"));

        quantityArea.sendKeys("02"+ Keys.ENTER);

        WebElement calculateBuuton = driver.findElement(By.xpath("//input[contains(@id,'Quan')]"));

        calculateBuuton.click();

        Faker faker=new Faker();

        WebElement customerName = driver.findElement(By.xpath("//input[contains(@id,'ctl00_MainContent_fmwOrder_txtName')]"));

        customerName.sendKeys(faker.name().firstName());

        WebElement streetArea = driver.findElement(By.xpath("//input[contains(@name,'ctl00$MainContent$fmwOrder$TextBox2')]"));

        streetArea.sendKeys(faker.address().streetAddress());

        WebElement city = driver.findElement(By.xpath("//input[contains(@name,'ctl00$MainContent$fmwOrder$TextBox3')]"));

        city.sendKeys(faker.address().cityName());

        WebElement state = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox4']"));

        state.sendKeys(faker.address().state());

        WebElement zipcode = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox5']"));

        zipcode.sendKeys(faker.numerify("#########"));

        WebElement visaRadioButton = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_cardList_0']"));

        visaRadioButton.click();

        WebElement bankCard = driver.findElement(By.xpath("//input[contains(@id,'ctl00_MainContent_fmwOrder_TextBox6')]"));

        bankCard.sendKeys(faker.numerify("################"));

        driver.findElement(By.partialLinkText("Process")).click();

        WebElement expiryDate = driver.findElement(By.xpath("//input[contains(@name,'ctl00$MainContent$fmwOrder$TextBox1')]"));

        expiryDate.sendKeys(faker.numerify("02/24"));

        driver.findElement(By.partialLinkText("Process")).click();

        System.out.println("driver.findElement(By.tagName(\"strong\")).isDisplayed() = " + driver.findElement(By.tagName("strong")).isDisplayed());


    }


}
/*
Smartbear software order placing
1. Open browser
2. Go to website:
http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
3. Enter username: “Tester”
4. Enter password: “test”
5. Click on Login button
6. Click on Order
7. Select familyAlbum from product, set quantity to 2
8. Click to “Calculate” button
9. Fill address Info with JavaFaker
• Generate: name, street, city, state, zip code
10. Click on “visa” radio button
11. Generate card number using JavaFaker
12. Click on “Process”
13. Verify success message “New order has been successfully added.”


 */