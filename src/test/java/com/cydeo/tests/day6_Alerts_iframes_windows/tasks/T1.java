package com.cydeo.tests.day6_Alerts_iframes_windows.tasks;

import com.cydeo.utilities.ReviewUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T1 {

    WebDriver driver;


    @BeforeMethod
    public void setup() {

        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void test1() {

        driver.get("https://practice.cydeo.com/dropdown");

        Select selectState = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        List<WebElement> optionsStates = selectState.getOptions();

       /* for (WebElement optionsState : optionsStates) {

            System.out.println("optionsState.getText() = " + optionsState.getText());

        }

        */
        selectState.selectByVisibleText("Illinois");
        ReviewUtils.staticWait(1);
        selectState.selectByValue("VA");
        ReviewUtils.staticWait(1);
        selectState.selectByIndex(5);
        ReviewUtils.staticWait(1);


        String expectedSelectedItemName="California";
        String actualSelectedItemName = selectState.getFirstSelectedOption().getText();

        Assert.assertEquals(actualSelectedItemName,expectedSelectedItemName);


       /* for (WebElement optionsState : optionsStates) {

            if (optionsState.isSelected()) {
                System.out.print("selected state: ");
                System.out.println("optionsState = " + optionsState.getText());
            }


        }

        */

    }
}