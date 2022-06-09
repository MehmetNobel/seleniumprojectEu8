package com.cydeo.pages_Lecture;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoadingExample1Page {

    public DynamicLoadingExample1Page(){

        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy (xpath = "//button[.='Start']")
    public WebElement startButton;

    @FindBy (xpath = "//div[@id='finish']/h4")
    public WebElement helloWorldText;

    @FindBy(xpath = "//input[@type='username']")
    public WebElement inputUserNameArea;

    @FindBy (xpath = "//input[@type='password']")
    public WebElement passwordArea;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy (id = "flash-messages")
    public WebElement message;












}
