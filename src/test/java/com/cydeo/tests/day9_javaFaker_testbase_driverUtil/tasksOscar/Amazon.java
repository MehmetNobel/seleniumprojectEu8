package com.cydeo.tests.day9_javaFaker_testbase_driverUtil.tasksOscar;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazon {

    static WebDriver driver;
    
    @BeforeMethod
    public void setup(){
        
        driver=Driver.getDriver();
        driver.get(ConfigurationReader.getProperty("env"));
    }


    @Test
    public void test1(){

        WebElement searchButtonTextArea = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        searchButtonTextArea.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);

        WebElement elementFirstItem = driver.findElement(By.xpath("//h2//a[1]"));

        elementFirstItem.click();

        WebElement elementPrice = driver.findElement(By.xpath("(//span[@class='_p13n-desktop-sims-fbt_price_p13n-sc-price__bCZQt'])[1]"));

        String perPriceWithDollar = elementPrice.getText();

        System.out.println("perPriceWithDollar = " + perPriceWithDollar);

        Double perPrice = Double.parseDouble((perPriceWithDollar.substring(1)));

        System.out.println("perPrice = " + perPrice);

        Select select = new Select(driver.findElement(By.xpath("//select[@name='quantity']")));

        select.selectByVisibleText("2");

        WebElement addToCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));

        addToCart.click();

        WebElement go_to_cart = driver.findElement(By.partialLinkText("Go to Cart"));

        go_to_cart.click();

        BrowserUtils.sleep(3);

        WebElement twoItemPriceWithDollar = driver.findElement(By.xpath("(//span[@class='a-offscreen'])[4]"));

        String twoItemPriceWithDollarText = twoItemPriceWithDollar.getText();

        System.out.println("twoItemPriceWithDollarText = " + twoItemPriceWithDollarText);

        double twoItemPriceWithoutDollar = Double.parseDouble(twoItemPriceWithDollarText.substring(1));

        System.out.println("twoItemPriceWithoutDollar = " + twoItemPriceWithoutDollar);

        Assert.assertEquals(twoItemPriceWithoutDollar,(perPrice*2));

        WebElement elementSubTotal = driver.findElement(By.xpath("//span[@id='sc-subtotal-label-activecart']"));

        System.out.println("elementSubTotal.isDisplayed() = " + elementSubTotal.isDisplayed());

        Select select1=new Select(driver.findElement(By.xpath("//select[@name='quantity']")));

        select1.selectByVisibleText("1");

        BrowserUtils.sleep(1);

        WebElement elementTotalItem = driver.findElement(By.xpath("//span[@id='sc-subtotal-label-buybox']"));

        String elementTotalItemText = elementTotalItem.getText();

        String expectedText="1 item";

        System.out.println("elementTotalItemText = " + elementTotalItemText);

        WebElement totalPrice = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'])[1]"));

        String totalPriceTextWithDollar = totalPrice.getText();

        double totalPriceWithoutDollar = Double.parseDouble(totalPriceTextWithDollar.substring(1));

        System.out.println("totalPriceWithoutDollar = " + totalPriceWithoutDollar);

        System.out.println("perPrice = " + perPrice);

        Assert.assertEquals(perPrice,totalPriceWithoutDollar,"amount did not match");

        Assert.assertTrue(elementTotalItemText.contains(expectedText));







    }
}
