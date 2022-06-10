package com.cydeo.pages_Practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CydeoLibraryHomePageOFB {

    public CydeoLibraryHomePageOFB(String url) {

        PageFactory.initElements(Driver.getDriver(), this);

        Driver.getDriver().get(url);

    }


    @FindBy(css = "input[type='email']")
    public WebElement elementEmail;

    @FindBy(css = "input[type='password']")
    public WebElement elementPassword;

    @FindBy(css = "button")
    public WebElement btnButton;

}
