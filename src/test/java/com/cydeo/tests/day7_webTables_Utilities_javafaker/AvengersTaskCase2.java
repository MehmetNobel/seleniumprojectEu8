package com.cydeo.tests.day7_webTables_Utilities_javafaker;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AvengersTaskCase2 {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @Test
    public void test1() {

        driver.get("https://www.automationexercise.com");

        driver.findElement(By.partialLinkText("Signup")).click();

        String name = "mhmt";

        String email = "mhmt@mhmt.com";

        WebElement newUser = driver.findElement(By.xpath("//h2[.='New User Signup!']"));

        // Assert.assertEquals();

    }

    @Test
    public void signInTestCorrect() {

        /*
        1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'Login to your account' is visible
6. Enter correct email address and password
7. Click 'login' button
8. Verify that 'Logged in as username' is visible
9. Click 'Delete Account' button
10. Verify that 'ACCOUNT DELETED!' is visible
         */

        driver.get("https://www.automationexercise.com");

        driver.findElement(By.partialLinkText("Signup")).click();

        WebElement elementLoginToYourAccount = driver.findElement(By.xpath("//h2[.='Login to your account']"));

        System.out.println("elementLoginToYourAccount.isDisplayed() = " + elementLoginToYourAccount.isDisplayed());

        WebElement elementEmailAddress = driver.findElement(By.xpath("//input[@data-qa='login-email']"));

        elementEmailAddress.sendKeys("mehmetnobel26@gmail.com");

        WebElement elementPassword = driver.findElement(By.xpath("//input[@data-qa='login-password']"));

        elementPassword.sendKeys("98569856");

        WebElement elementLoginButton = driver.findElement(By.xpath("//button[@data-qa='login-button']"));

        elementLoginButton.click();

        WebElement elementLogOut = driver.findElement(By.xpath("//a[@href='/logout']"));

        System.out.println("elementLogOut.isDisplayed() = " + elementLogOut.isDisplayed());

        WebElement elementDeleteAccountButton = driver.findElement(By.xpath("//a[@href='/delete_account']"));

        elementDeleteAccountButton.click();

        WebElement elementDeleteAccountBttn = driver.findElement(By.xpath("//a[@href='/delete_account']"));

        elementDeleteAccountBttn.click();

        WebElement elementBttnSureDelete = driver.findElement(By.xpath("//button[.='Delete']"));

        elementBttnSureDelete.click();


    }

    @Test
    public void signInTestIncorrect() {

        driver.get("https://www.automationexercise.com");

        driver.findElement(By.partialLinkText("Signup")).click();

        WebElement elementLoginToYourAccount = driver.findElement(By.xpath("//h2[.='Login to your account']"));

        System.out.println("elementLoginToYourAccount.isDisplayed() = " + elementLoginToYourAccount.isDisplayed());

        WebElement elementEmailAddress = driver.findElement(By.xpath("//input[@data-qa='login-email']"));

        elementEmailAddress.sendKeys("mehmetnobel266@gmail.com");

        WebElement elementPassword = driver.findElement(By.xpath("//input[@data-qa='login-password']"));

        elementPassword.sendKeys("98569856");

        WebElement elementLoginButton = driver.findElement(By.xpath("//button[@data-qa='login-button']"));

        elementLoginButton.click();

        WebElement elementIncorrectMailMessage = driver.findElement(By.xpath("//p[.='Your email or password is incorrect!']"));

        System.out.println("elementIncorrectMailMessage.getText() = " + elementIncorrectMailMessage.getText());

        System.out.println("elementIncorrectMailMessage.isDisplayed() = " + elementIncorrectMailMessage.isDisplayed());


    }

    @Test
    public void logoutTest() {

        driver.get("https://www.automationexercise.com");

        driver.findElement(By.partialLinkText("Signup")).click();

        WebElement elementLoginToYourAccount = driver.findElement(By.xpath("//h2[.='Login to your account']"));

        System.out.println("elementLoginToYourAccount.isDisplayed() = " + elementLoginToYourAccount.isDisplayed());

        WebElement elementEmailAddress = driver.findElement(By.xpath("//input[@data-qa='login-email']"));

        elementEmailAddress.sendKeys("mehmetnobel26@gmail.com");

        WebElement elementPassword = driver.findElement(By.xpath("//input[@data-qa='login-password']"));

        elementPassword.sendKeys("98569856");

        WebElement elementLoginButton = driver.findElement(By.xpath("//button[@data-qa='login-button']"));

        elementLoginButton.click();

        WebElement elementLogOutButton = driver.findElement(By.xpath("//a[@href='/logout']"));

        System.out.println("elementLogOutButton.isDisplayed() = " + elementLogOutButton.isDisplayed());

        elementLogOutButton.click();

        WebElement elementSignInButton = driver.findElement(By.xpath("//a[@href='/login']"));

        elementSignInButton.isDisplayed();

        System.out.println("elementSignInButton.getText() = " + elementSignInButton.getText());


    }
}