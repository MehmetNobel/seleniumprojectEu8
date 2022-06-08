package com.cydeo.tests.day12_pomDesign_ExplictWait;

import com.cydeo.pages.DynamicLoadingExample7Page;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicLoadingExample7 {

    DynamicLoadingExample7Page dynamicLoadingExample7Page;


    @BeforeMethod
    public void setup(){

        dynamicLoadingExample7Page=new DynamicLoadingExample7Page();

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");

    }

    @Test
    public void test1(){

        //here we create object of wait.
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);

        //here we say wait until title turns to the Dynamic

        wait.until(ExpectedConditions.titleContains("Dynamic"));

        Assert.assertTrue(dynamicLoadingExample7Page.doneText.isDisplayed());

        Assert.assertTrue(dynamicLoadingExample7Page.image.isDisplayed());







    }


}
