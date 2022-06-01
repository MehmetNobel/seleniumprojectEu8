package com.cydeo.tests.day6_Alerts_iframes_windows.tasks;

import com.cydeo.utilities.ReviewUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T2_Date_Selection {

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

        Select selectYear=new Select(driver.findElement(By.cssSelector("select[id='year']")));

        selectYear.selectByVisibleText("1923");

        ReviewUtils.staticWait(1);

        Select selectMonth=new Select(driver.findElement(By.cssSelector("select[id='month']")));

        ReviewUtils.staticWait(1);
        selectMonth.selectByValue("11");

        Select selectDay=new Select(driver.findElement(By.cssSelector("select[id='day']")));
        ReviewUtils.staticWait(1);

        selectDay.selectByIndex(0);

        String expectedYear="1923";
        String actualtextYear = selectYear.getFirstSelectedOption().getText();


        String expectedMonth="December";
        String actualtextMonth = selectMonth.getFirstSelectedOption().getText();


        String expectedDay="1";
        String actualtextDay = selectDay.getFirstSelectedOption().getText();

        Assert.assertTrue(actualtextDay.equals(expectedDay));
        Assert.assertEquals(actualtextMonth,expectedMonth);
        Assert.assertEquals(actualtextYear,expectedYear);

    }
    @Test
    public void test2() {

        driver.get("https://practice.cydeo.com/dropdown");

        Select selectState = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        List<WebElement> optionsStates = selectState.getOptions();

        selectState.selectByVisibleText("Illinois");
        ReviewUtils.staticWait(1);
        selectState.selectByValue("VA");
        ReviewUtils.staticWait(1);
        selectState.selectByIndex(5);
        ReviewUtils.staticWait(1);


        String expectedSelectedItemName = "California";
        String actualSelectedItemName = selectState.getFirstSelectedOption().getText();

        Assert.assertEquals(actualSelectedItemName, expectedSelectedItemName);


    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }





    }