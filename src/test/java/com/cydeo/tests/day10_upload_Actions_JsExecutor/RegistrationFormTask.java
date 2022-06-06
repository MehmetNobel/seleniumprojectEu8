package com.cydeo.tests.day10_upload_Actions_JsExecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationFormTask {

    static WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = Driver.getDriver();

        driver.get("https://practice.cydeo.com/registration_form");

        //driver.get(ConfigurationReader.getProperty("env"));

    }

    @Test
    public void test1() {

        // ==>>     CONTAINS METHOD  //tagname[contains(@name,'first')]

        // ==>>  STARTS WITH ==>>   //tagname[starts-with(@name,'first')]
        // ==>>  ENDS WITH ==>>   //tagname[ends-with(@name,'first')]


        Faker faker = new Faker();

        WebElement firstNameArea = driver.findElement(By.xpath("//input[starts-with(@name,'first')]"));

        firstNameArea.sendKeys(faker.name().firstName());

        WebElement lastNameArea = driver.findElement(By.xpath("//input[@name='lastname']"));

        lastNameArea.sendKeys(faker.name().lastName());

        WebElement userNameTextArea = driver.findElement(By.xpath("//input[@name='username']"));

        userNameTextArea.sendKeys(faker.bothify("???##??####???"));  // #: gives us numbers; ? : gives us letters

        String attribute = driver.findElement(By.xpath("//input[contains(@placeholder,'user')]")).getAttribute("class");

        System.out.println("attribute = " + attribute);

        WebElement emailTextArea = driver.findElement(By.xpath("//input[@name='email']"));

        emailTextArea.sendKeys(faker.internet().emailAddress());

        WebElement passwordTextArea = driver.findElement(By.xpath("//input[@name='password']"));

        passwordTextArea.sendKeys(faker.internet().password());

       // or we can write like that : generate 8 digits ==>> passwordTextArea.sendKeys(faker.numerify("########"));

        WebElement phoneTextArea = driver.findElement(By.xpath("//input[@name='phone']"));

        phoneTextArea.sendKeys("987-655-6145");

        WebElement genderRadioButton = driver.findElement(By.xpath("//input[@name='gender']"));

        genderRadioButton.click();

        WebElement birthdayTextArea = driver.findElement(By.xpath("//input[@name='birthday']"));

        birthdayTextArea.sendKeys("11/05/1981");

        WebElement dropdownDepartment = driver.findElement(By.xpath("//select[@name='department']"));

        Select dropdown = new Select(dropdownDepartment);

        dropdown.selectByVisibleText("Department of Engineering");

        WebElement jobTitle = driver.findElement(By.xpath("//select[@name='job_title']"));

        Select dropdown2 = new Select(jobTitle);

        dropdown2.selectByVisibleText("QA");

        WebElement dropdownProgramLanguage = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

        dropdownProgramLanguage.click();

        WebElement signInButton = driver.findElement(By.id("wooden_spoon"));

        signInButton.click();

        BrowserUtils.sleep(2);

        String actual = driver.findElement(By.tagName("p")).getText();

        String expected="You've successfully completed registration!";

        Assert.assertEquals(actual,expected,"actual and expected did not match");




    }


}
