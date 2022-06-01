package com.cydeo.tests.day2_locators_getText_getAttribute.tasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TaskLecture1 {

    public static void main(String[] args) {

       // WebDriverManager.chromedriver().setup();

        // WebDriver driver=new ChromeDriver();

        WebDriver driver= WebDriverFactory.getDriver("firefox");

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        WebElement userName=driver.findElement(By.name("USER_LOGIN"));

        userName.sendKeys("incorrect");

        WebElement password=driver.findElement(By.name("USER_PASSWORD"));

        password.sendKeys("incorrect");

        WebElement loginButton=driver.findElement(By.className("login-btn"));

        loginButton.click();

        WebElement errorText = driver.findElement(By.className("errortext"));

        String errorTextString=errorText.getText();

        String errorExpectedText="Incorrect login or password";

        if(errorTextString.equals(errorExpectedText))
            System.out.println("passed");
        else
            System.out.println("failed");








    }
}
