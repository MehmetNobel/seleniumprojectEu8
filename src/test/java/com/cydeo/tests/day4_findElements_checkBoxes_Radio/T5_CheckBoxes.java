package com.cydeo.tests.day4_findElements_checkBoxes_Radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_CheckBoxes {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("Chrome");

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/checkboxes");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement elementCheckBox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement elementCheckBox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));

        System.out.println("elementCheckBox1.isSelected() = " + elementCheckBox1.isSelected());

        System.out.println("elementCheckBox2.isSelected() = " + elementCheckBox2.isSelected());

       try {

           Thread.sleep(2000);
       }catch (InterruptedException e){

       }
        elementCheckBox1.click();

        try {

            Thread.sleep(2000);
        }catch (InterruptedException e){

        }
        elementCheckBox2.click();


        System.out.println("elementCheckBox1.isSelected() = " + elementCheckBox1.isSelected());
        System.out.println("elementCheckBox2.isSelected() = " + elementCheckBox2.isSelected());




    }
}
