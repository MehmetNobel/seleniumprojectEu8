package com.cydeo.tests.day5_textNG_intro_dropdowns.tasksGurhan;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task8 {

    WebDriver driver;

    @BeforeMethod
    public void setup(){

        driver= WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/dropdown");

    }
    @Test
    public void test1(){

        Select selectDropDown=new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        selectDropDown.selectByIndex(0);

        System.out.println("*********************");

        List<WebElement> simpleDropDownOptions = selectDropDown.getOptions();

        for (WebElement simpleDropDownOption : simpleDropDownOptions) {

            System.out.println("simpleDropDownOption.getText() = " + simpleDropDownOption.getText());

            simpleDropDownOption.click();

        }

        for (WebElement simpleDropDownOption : simpleDropDownOptions) {

            System.out.println("simpleDropDownOption.getText() = " + simpleDropDownOption.getText());

            System.out.println("simpleDropDownOption.isSelected() = " + simpleDropDownOption.isSelected());
        }

    }

    @Test
    public void test2(){

        Select selectStateDropDown=new Select(driver.findElement(By.cssSelector("select[id='state']")));

        System.out.println("selectStateDropDown.getFirstSelectedOption().getText() = " + selectStateDropDown.getFirstSelectedOption().getText());

        selectStateDropDown.selectByVisibleText("Indiana");

        System.out.println("selectStateDropDown.getOptions().size() = " + selectStateDropDown.getOptions().size());

        List<WebElement> stateDropDownOptions = selectStateDropDown.getOptions();

        for (WebElement stateDropDownOption : stateDropDownOptions) {

            System.out.println("stateDropDownOption.getText() = " + stateDropDownOption.getText());

            System.out.println("stateDropDownOption.isSelected() = " + stateDropDownOption.isSelected());

        }


    }

    @AfterMethod
    public void tearDown(){

        //driver.close();


    }



}
