package com.cydeo.tests.day5_textNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_SimpleDropdowns {

    WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/dropdown");

    }

    @AfterMethod
    public void tearDownMethod() {

        //driver.close();
    }



    @Test
    public void simpleDropDownTest(){

        Select simpleDropDown=new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        WebElement firstSelectedOption = simpleDropDown.getFirstSelectedOption();

        String expectedText="Please select an option";

        System.out.println("firstSelectedOption.getText() = " + firstSelectedOption.getText());

        Assert.assertEquals(firstSelectedOption.getText(),expectedText);

        Select selectState=new Select(driver.findElement(By.cssSelector("select[id='state']")));

        System.out.println("selectState.getFirstSelectedOption().getText() = " + selectState.getFirstSelectedOption().getText());
        String actualstateText = selectState.getFirstSelectedOption().getText();

        String expectedStateText="Select a State";

        Assert.assertEquals(actualstateText, expectedStateText);
    }



}
