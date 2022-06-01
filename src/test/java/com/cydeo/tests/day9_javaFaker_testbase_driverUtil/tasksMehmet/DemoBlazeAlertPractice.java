package com.cydeo.tests.day9_javaFaker_testbase_driverUtil.tasksMehmet;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DemoBlazeAlertPractice {


    @Test
    public void demoBlazeTest1(){

        Driver.getDriver().get("https://www.demoblaze.com/");

        Driver.getDriver().findElement(By.xpath("//a[.='Samsung galaxy s6']")).click();

        Driver.getDriver().findElement(By.xpath("//a[.='Add to cart']")).click();

        BrowserUtils.sleep(2);

        Alert alert=Driver.getDriver().switchTo().alert();

        alert.accept();







    }



}
