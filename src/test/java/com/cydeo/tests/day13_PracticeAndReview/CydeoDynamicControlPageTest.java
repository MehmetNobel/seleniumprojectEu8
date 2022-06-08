package com.cydeo.tests.day13_PracticeAndReview;

import com.cydeo.pages.CydeoDynamicControlsPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CydeoDynamicControlPageTest {

    @Test
    public void test() {

        CydeoDynamicControlsPage cydeoDynamicControlsPage = new CydeoDynamicControlsPage();

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");

        cydeoDynamicControlsPage.removeButton.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        // message visible olana kadar bekle diyoruz.

        //wait.until(ExpectedConditions.visibilityOf(cydeoDynamicControlsPage.message));

        wait.until(ExpectedConditions.invisibilityOf(cydeoDynamicControlsPage.loaderimage));

        Assert.assertTrue(cydeoDynamicControlsPage.message.isDisplayed());

        // Checkbox silindiği için try catch e alıyoruz.

        try {
            // Since the element is deleted then we can write like that.no implict but just expilict wait
            Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            Assert.assertTrue(cydeoDynamicControlsPage.checkBox.isDisplayed());
        } catch (Exception e) {

            Assert.assertTrue(true);
            System.out.println("checkbox is deleted from the page");
        }
    }

    @Test
    public void test2() {

        CydeoDynamicControlsPage cydeoDynamicControlsPage = new CydeoDynamicControlsPage();

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        cydeoDynamicControlsPage.enableButton.click();

        //wait.until(ExpectedConditions.visibilityOf(cydeoDynamicControlsPage.disabledMessage));

        wait.until(ExpectedConditions.invisibilityOf(cydeoDynamicControlsPage.loadingBar2));

        Assert.assertTrue(cydeoDynamicControlsPage.textArea.isEnabled());

        Assert.assertTrue(cydeoDynamicControlsPage.disabledMessage.isDisplayed());


    }


}






