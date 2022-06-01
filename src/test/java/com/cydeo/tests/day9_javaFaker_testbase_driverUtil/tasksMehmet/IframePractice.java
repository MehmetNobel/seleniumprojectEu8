package com.cydeo.tests.day9_javaFaker_testbase_driverUtil.tasksMehmet;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class IframePractice {


    @Test
    public void test1(){

        Driver.getDriver().get("https://practice.cydeo.com/iframe");
        // 1.way
        // Driver.getDriver().switchTo().frame("mce_0_ifr");
        //2.way by index number ..  write //iframe and see how many are there in the page.


        Driver.getDriver().switchTo().frame(0);

        System.out.println("Driver.getDriver().findElement(By.xpath(\"//p[.='Your content goes here.']\")).getText() = "
                + Driver.getDriver().findElement(By.xpath("//p[.='Your content goes here.']")).getText());

        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");

        Driver.getDriver().switchTo().frame(0);

        System.out.println("Driver.getDriver().findElement(By.xpath(\"//h1[.='The iframe element']\")).getText() = " + Driver.getDriver().findElement(By.xpath("//h1[.='The iframe element']")).getText());


    }
}
