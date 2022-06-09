package com.cydeo.tests.practice;

import com.cydeo.pages_Practice.AutomationExerciseHomePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomationExercise2 {

    @Test
    public void test1(){

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        AutomationExerciseHomePage automationExerciseHomePage=new AutomationExerciseHomePage();

        String actualTitle = Driver.getDriver().getTitle();

        String expectedTitle="Automation";

        Assert.assertTrue(actualTitle.contains(expectedTitle));

        Actions actions=new Actions(Driver.getDriver());

        actions.moveToElement(automationExerciseHomePage.subscriptionButton).perform();

        BrowserUtils.sleep(2);

        Assert.assertTrue(automationExerciseHomePage.subscriptionButton.isDisplayed());

        automationExerciseHomePage.bottomArrow.click();

        System.out.println("automationExerciseHomePage.fullFledgedText.getText() = " + automationExerciseHomePage.fullFledgedText.getText());

        Assert.assertTrue(automationExerciseHomePage.fullFledgedText.isDisplayed());

        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();

        BrowserUtils.sleep(2);

        js.executeScript("window.scrollBy(0,1500)");

        WebElement babyPicture = Driver.getDriver().findElement(By.xpath("//img[@src='/get_product_picture/11']"));

        BrowserUtils.sleep(2);

        js.executeScript("arguments[0].scrollIntoView(true)",babyPicture);




    }









}
