package com.cydeo.tests.practice_2;

import com.cydeo.pages_Practice_2.AutoExerReviewProductPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutoExerReviewProductPageText {

    @Test
    public void test() {

        AutoExerReviewProductPage autoExerReviewProductPage = new AutoExerReviewProductPage();

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        autoExerReviewProductPage.productsButton.click();

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        js.executeScript("window.scrollBy(0,750)");

        autoExerReviewProductPage.viewProductButton.click();

        autoExerReviewProductPage.nameInput.sendKeys("mehmet");
        BrowserUtils.sleep(1);
        autoExerReviewProductPage.emailInput.sendKeys("mehmet@gmail.com");
        BrowserUtils.sleep(1);
        autoExerReviewProductPage.reviewInput.sendKeys("thank you");

        BrowserUtils.sleep(1);

        autoExerReviewProductPage.submitButton.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        wait.until(ExpectedConditions.visibilityOf(autoExerReviewProductPage.message));

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='alert-success alert']")));

        Assert.assertTrue(autoExerReviewProductPage.message.isDisplayed());

        System.out.println("autoExerReviewProductPage.message.getText() = " + autoExerReviewProductPage.message.getText());


    }


}
