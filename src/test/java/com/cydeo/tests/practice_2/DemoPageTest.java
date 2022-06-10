package com.cydeo.tests.practice_2;

import com.cydeo.pages_Practice_2.DemoCirclePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoPageTest {

    @Test
    public void test1(){

        DemoCirclePage demoCirclePage=new DemoCirclePage();

        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        BrowserUtils.sleep(2);

        Driver.getDriver().findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();

        Actions actions=new Actions(Driver.getDriver());

        actions.moveToElement(demoCirclePage.smallCircle).perform();

        actions.dragAndDrop(demoCirclePage.smallCircle, demoCirclePage.bigCircle).perform();

        String expectedText="did great";

        System.out.println("demoCirclePage.bigCircle.getText() = " + demoCirclePage.bigCircle.getText());

        Assert.assertTrue(demoCirclePage.bigCircle.getText().contains(expectedText));




    }




}
