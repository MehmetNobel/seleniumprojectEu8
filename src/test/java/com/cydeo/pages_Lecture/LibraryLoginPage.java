package com.cydeo.pages_Lecture;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {


    public LibraryLoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement inputUserName;

    @FindBy(xpath = "//input[@id='inputPassword']")
    public WebElement inputPassword;

    @FindBy(xpath ="//button[@class='btn btn-lg btn-primary btn-block']")
    public WebElement logInButton;

    @FindBy(xpath = "//div[.='This field is required.']//div")
    public WebElement thisFieldIsRequiredMessage;

    @FindBy(xpath = "//div[.='Please enter a valid email address.']//div")
    public WebElement pleaseEnterAValidEmailAddressMessage;

    @FindBy(xpath = "//div[.='Sorry, Wrong Email or Password']")
    public WebElement sorryWrongEmailOrPasswordMessage;



}
