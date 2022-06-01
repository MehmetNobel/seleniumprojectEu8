package com.cydeo.tests.day9_javafaker_testbase_driverUtil.tasksOscar;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ZeroAccount {

    public WebDriver driver;

    @BeforeMethod
    public void setup(){

        driver= Driver.getDriver();

        driver.get("http://zero.webappsecurity.com/");

    }

    @Test
    public void test1(){

        WebElement signInButton = driver.findElement(By.xpath("//button[@id='signin_button']"));

        signInButton.click();

        System.out.println("driver.getTitle() = " + driver.getTitle());

        WebElement userName = driver.findElement(By.xpath("//input[@id='user_login']"));

        userName.sendKeys("username");

        WebElement userPassword = driver.findElement(By.xpath("//input[@id='user_password']"));

        userPassword.sendKeys("password");

        WebElement signInButton2 = driver.findElement(By.xpath("//input[@type='submit']"));

        signInButton2.click();

        driver.navigate().back();

        String actualTitle1 = driver.getTitle();

        System.out.println("actualTitle1 = " + actualTitle1);

        String expectedTitle="Zero - Personal Banking";

        Assert.assertTrue(actualTitle1.contains("Personal"));

        WebElement onlineBankingButton= driver.findElement(By.xpath("//strong[.='Online Banking']"));

        onlineBankingButton.click();

        WebElement accountSummaryButton = driver.findElement(By.xpath("//span[.='Account Summary']"));

        accountSummaryButton.click();

        System.out.println("driver.getTitle() = " + driver.getTitle());

        WebElement cashAccountsButton = driver.findElement(By.xpath("//h2[.='Cash Accounts']"));

        System.out.println("cashAccountsButton.isDisplayed() = " + cashAccountsButton.isDisplayed());

        WebElement investmentAccountsButton = driver.findElement(By.xpath("//h2[.='Investment Accounts']"));

        System.out.println("investmentAccountsButton.isDisplayed() = " + investmentAccountsButton.isDisplayed());

        WebElement account_Activity_Button = driver.findElement(By.partialLinkText("Account Activity"));

        account_Activity_Button.click();

        String account_Activity_Button_Page_Title = driver.getTitle();

        System.out.println("account_Activity_Button_Page_Title = " + account_Activity_Button_Page_Title);

        String expectedPageTitle="Zero – Account Activity";

        //Assert.assertEquals(account_Activity_Button_Page_Title,expectedPageTitle,"title did not match");

        Assert.assertTrue(account_Activity_Button_Page_Title.contains("Account Activity"));

        Select select=new Select(driver.findElement(By.xpath("//select[@id='aa_accountId']")));

        List<WebElement> options = select.getOptions();

        for (WebElement option : options) {

            System.out.println("option.getText() = " + option.getText());

        }

        String dropDownFirstSelectedOption = select.getFirstSelectedOption().getText();

        String expectedDropDownSelectedOption="Savings";

        Assert.assertEquals(dropDownFirstSelectedOption,expectedDropDownSelectedOption,"did not match");

        select.selectByVisibleText("Loan");

        System.out.println("select.getFirstSelectedOption().getText() = " + select.getFirstSelectedOption().getText());


    }



}
