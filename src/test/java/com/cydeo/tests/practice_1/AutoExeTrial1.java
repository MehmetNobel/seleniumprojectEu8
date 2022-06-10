package com.cydeo.tests.practice_1;

import com.cydeo.pages_Practice_1.AutoExeTrial1Page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutoExeTrial1 {

    @Test
    public void test(){


        AutoExeTrial1Page autoExeTrial1Page=new AutoExeTrial1Page("https://www.automationexercise.com/");

        autoExeTrial1Page.contactUsLink.click();

        autoExeTrial1Page.nameinput.sendKeys("mehmet");

        autoExeTrial1Page.emailinput.sendKeys("mehmet@nobel.com");

        autoExeTrial1Page.subjectinput.sendKeys("congratulations");

        autoExeTrial1Page.messageTextarea.sendKeys("you are doing great actually!!");

        autoExeTrial1Page.submitButton.click();

        Alert alert= Driver.getDriver().switchTo().alert();

        alert.accept();

        String actualmessageText = autoExeTrial1Page.successMessage.getText();

        System.out.println("actualmessageText = " + actualmessageText);

        String expectedMessageText="Success";

        Assert.assertTrue(actualmessageText.contains(expectedMessageText));

        BrowserUtils.sleep(2);

        autoExeTrial1Page.homeButton.click();


    }




}
