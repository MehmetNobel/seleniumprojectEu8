package com.cydeo.tests.day9_javaFaker_testbase_driverUtil.tasksMehmet;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WindowHandle;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GetWindowPractice {

    @Test
    public void test1(){

        Driver.getDriver().get("https://www.shino.de/parkcalc/");

        Driver.getDriver().findElement(By.xpath("(//img[@src='cal.gif'])[1]")).click();

        //we are using utility wndw method

        WindowHandle.windowHandle(Driver.getDriver(), "Pick");

        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());

        Driver.getDriver().findElement(By.xpath("//a[.='23']")).click();

        WindowHandle.windowHandle(Driver.getDriver(), "Park");

        Driver.getDriver().findElement(By.xpath("(//input[@name='StartingTimeAMPM'])[2]")).click();




    }




}
