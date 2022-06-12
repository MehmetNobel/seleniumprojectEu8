package com.cydeo.reviewOscar;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    // first step of POM is constructor
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // second step common locators and methods for the application
    @FindBy(xpath = "//a[.=' Contact us']") // can NOT pass a variable name
    public WebElement contactUs;



    // Can I use findElements method with @FindBy
    @FindBy(tagName = "a")
    public List<WebElement> links;


    public WebElement getElement(String str){
        return Driver.getDriver().findElement(By.partialLinkText(str));
    }













}


/*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Contact Us' button
5. Verify 'GET IN TOUCH' is visible
6. Enter name, email, subject and message
7. Upload file
8. Click 'Submit' button
9. Click OK button
10. Verify success message 'Success! Your details have been submitted successfully.' is visible
11. Click 'Home' button and verify that landed to home page successfully

 */