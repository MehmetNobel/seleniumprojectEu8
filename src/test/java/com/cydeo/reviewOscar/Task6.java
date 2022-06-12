package com.cydeo.reviewOscar;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task6 {

    @Test
    public void test(){

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        //creat object so that we can use elements and methods.

        ContactUsPage contactUsPage=new ContactUsPage();

        //click contac us

        Actions actions=new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN);

        BrowserUtils.sleep(2);

        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP);

        BrowserUtils.sleep(2);

        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();

        js.executeScript("window.scrollBy(0,750)");

        BrowserUtils.sleep(2);

        contactUsPage.contactUs.click();

        Faker faker=new Faker();

        contactUsPage.name.sendKeys(faker.name().firstName());

        contactUsPage.email.sendKeys(faker.internet().emailAddress());

        contactUsPage.subject.sendKeys(faker.chuckNorris().fact());

        contactUsPage.message.sendKeys(faker.chuckNorris().fact());

        contactUsPage.uploadFile.sendKeys("C:/Users/ev/Desktop/metin.txt");

        contactUsPage.submit.click();

        Alert alert= Driver.getDriver().switchTo().alert();

        alert.accept();

        String successText = contactUsPage.successMessage.getText();

        String expectedSuccessText="Success";

        Assert.assertTrue(successText.contains(expectedSuccessText));


    }







}
