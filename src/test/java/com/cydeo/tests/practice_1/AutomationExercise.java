package com.cydeo.tests.practice_1;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class AutomationExercise {


    @Test
    public void test(){

        Driver.getDriver().get("https://www.automationexercise.com/products?search=");

        WebElement searchBox = Driver.getDriver().findElement(By.cssSelector("input[name='search']"));

        Actions actions=new Actions(Driver.getDriver());

        actions.moveToElement(searchBox).perform();

        searchBox.sendKeys("Blue");

        WebElement searchButton = Driver.getDriver().findElement(By.cssSelector("#submit_search"));

        searchButton.click();

        WebElement menShirtPıcture = Driver.getDriver().findElement(By.cssSelector("img[src='/get_product_picture/43']"));

        actions.moveToElement(menShirtPıcture).perform();

        List<WebElement> p = Driver.getDriver().findElements(By.tagName("p"));

        for (WebElement element : p) {

            if(element.getText().toLowerCase().contains("lue"))
                System.out.println(element.getText());
        }

        WebElement homeButton = Driver.getDriver().findElement(By.linkText("Home"));

        homeButton.click();

        List<WebElement> allProducts = Driver.getDriver().findElements(By.xpath("//img[contains(@src,'product_')]/..//p"));

        System.out.println("allProducts.size() = " + allProducts.size());

        for (WebElement each : allProducts) {

            System.out.println("each.getText() = " + each.getText());
        }

    }



}
