package com.cydeo.tests.day4_findElements_checkBoxes_Radio.tasksGurhan;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1 {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("Chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.cydeo.com/multiple_buttons");

        WebElement elementButton1 = driver.findElement(By.xpath("//button[.='Button 1']"));

        elementButton1.click();

        WebElement elementButtonText = driver.findElement(By.xpath("//p[.='Clicked on button one!']"));

        String buttonText = elementButtonText.getText();

        if(buttonText.equals("Clicked on button one!"))
            System.out.println("passed");
        else
            System.out.println("failed");


    }
}
