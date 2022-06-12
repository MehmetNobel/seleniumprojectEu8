package com.cydeo.reviewOscar;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class WebstaurantTask {


    @Test
    public void test(){

        Driver.getDriver().get("https://www.webstaurantstore.com/");

        WebElement searchBox = Driver.getDriver().findElement(By.cssSelector("#searchval"));

        searchBox.sendKeys("stainless work table"+ Keys.ENTER);

        List<WebElement> tables = Driver.getDriver().findElements(By.xpath("//p[contains(text(),'Table')]"));



        for (WebElement table : tables) {

            System.out.println("table.getText() = " + table.getText());

            if(table.getText().contains("Table")) {
                System.out.println("which contains Table :  " + table.getText());
            }

        }


    }




}
