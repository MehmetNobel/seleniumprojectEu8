package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {



    public static String returnOrderDate(WebDriver driver, String customerName){

        //driver=WebDriverFactory.getDriver("chrome");
        WebElement customerOrderDate =
                driver.findElement(By.xpath("//table//table//td[.='"+customerName+"']/following-sibling::td[3]"));

        return customerOrderDate.getText();

    }

    public static void orderVerify(WebDriver driver, String customerName, String expectedOrderDate){

        String actualOrderDate = driver.findElement(By.xpath("//table//table//td[.='" + customerName + "']/following-sibling::td[3]")).getText();

        Assert.assertEquals(actualOrderDate,expectedOrderDate);

    }






}
