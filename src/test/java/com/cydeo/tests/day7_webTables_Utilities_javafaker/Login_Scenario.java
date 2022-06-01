package com.cydeo.tests.day7_webTables_Utilities_javafaker;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login_Scenario extends TestBase {


    @Test
    public void test1() {

        driver.get("http://login1.nextbasecrm.com/");

        WebElement elementUserName = driver.findElement(By.xpath("//input[@type='text']"));

        elementUserName.sendKeys("helpdesk1@cybertekschool.com");

        WebElement elementPassword=driver.findElement(By.cssSelector("input[placeholder='Password']"));

        elementPassword.sendKeys("UserUser");

        WebElement loginButton=driver.findElement(By.cssSelector("input[type='submit']"));

        loginButton.click();

        System.out.println("driver.getTitle() = " + driver.getTitle());

        BrowserUtils.verifyTitle(driver,"(1) Portal");


    }

    @Test
    public void test2() {

        driver.get("http://login1.nextbasecrm.com/");

        CRM_Utilities.crm_login(driver);

        System.out.println("driver.getTitle() = " + driver.getTitle());

        BrowserUtils.verifyTitle(driver,"(1) Portal");

    }

    @Test
    public void test3() {

        driver.get("http://login1.nextbasecrm.com/");

        CRM_Utilities.crm_login(driver,"helpdesk1@cybertekschool.com","UserUser");

        System.out.println("driver.getTitle() = " + driver.getTitle());

        BrowserUtils.verifyTitle(driver,"(1) Portal");

    }


}