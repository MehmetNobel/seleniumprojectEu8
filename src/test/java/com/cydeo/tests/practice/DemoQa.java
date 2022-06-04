package com.cydeo.tests.practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoQa {

    static WebDriver driver;

    @BeforeMethod
    public void setup(){

        driver= Driver.getDriver();

        driver.get("https://demoqa.com/checkbox");

    }

    @Test
    public void test1(){




        try{

           // System.out.println("driver.findElement(By.xpath(\"//div[@class='pattern-backgound playgound-header']\")).isEnabled() = " + driver.findElement(By.xpath("//div[@class='pattern-backgound playgound-header']")).isEnabled());

            // driver.findElement(By.xpath("//div[@class='pattern-backgound playgound-header']")).click();


            System.out.println("entered try block");

            System.out.println("driver.findElement(By.xpath(\"//span[.='© 2013-2020 TOOLSQA.COM | ALL RIGHTS RESERVED.']\")).isEnabled() = " + driver.findElement(By.xpath("//span[.='© 2013-2020 TOOLSQA.COM | ALL RIGHTS RESERVED.']")).isEnabled());

            driver.findElement(By.xpath("//span[.='© 2013-2020 TOOLSQA.COM | ALL RIGHTS RESERVED.']")).click();

            driver.findElement(By.xpath("//label[@for='tree-node-home']")).click();

        }catch (RuntimeException e){

            System.out.println("entered catch block");

            WebElement homeCheckBox = driver.findElement(By.xpath("//span[@class='rct-checkbox']"));

            System.out.println("homeCheckBox.isEnabled() = " + homeCheckBox.isEnabled());

            homeCheckBox.click();

        }

        System.out.println("this is just for control");





        //System.out.println("homeCheckBox.isDisplayed() = " + homeCheckBox.isDisplayed());

       // System.out.println("homeCheckBox.isEnabled() = " + homeCheckBox.isEnabled());



    }





}
