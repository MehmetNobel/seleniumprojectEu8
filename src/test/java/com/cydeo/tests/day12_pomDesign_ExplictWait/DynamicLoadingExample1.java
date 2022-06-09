package com.cydeo.tests.day12_pomDesign_ExplictWait;

import com.cydeo.pages_Lecture.DynamicLoadingExample1Page;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicLoadingExample1 {

    DynamicLoadingExample1Page dynamicLoadingExample1Page;


    @BeforeMethod
    public void setup(){

        dynamicLoadingExample1Page=new DynamicLoadingExample1Page();

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");
    }

    @Test
    public void test1(){

        dynamicLoadingExample1Page.startButton.click();

        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);

        wait.until(ExpectedConditions.elementToBeClickable(dynamicLoadingExample1Page.signInButton));

        Assert.assertTrue(dynamicLoadingExample1Page.inputUserNameArea.isDisplayed());
        Assert.assertTrue(dynamicLoadingExample1Page.passwordArea.isDisplayed());
        Assert.assertTrue(dynamicLoadingExample1Page.signInButton.isDisplayed());

        dynamicLoadingExample1Page.inputUserNameArea.sendKeys("tomsmith");
        dynamicLoadingExample1Page.passwordArea.sendKeys("12345");
        dynamicLoadingExample1Page.signInButton.click();

        Assert.assertTrue(dynamicLoadingExample1Page.message.isDisplayed());





    }



}
