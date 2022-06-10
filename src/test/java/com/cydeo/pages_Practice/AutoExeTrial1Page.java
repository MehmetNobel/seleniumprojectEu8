package com.cydeo.pages_Practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoExeTrial1Page {

    public AutoExeTrial1Page(String url){

        PageFactory.initElements(Driver.getDriver(),this);

        Driver.getDriver().get(url);

    }
    
    @FindBy(css = "a[href='/contact_us']")
    public WebElement contactUsLink;

    @FindBy(name = "name")
    public WebElement nameinput;

    @FindBy(name = "email")
    public WebElement emailinput;

    @FindBy(name = "subject")
    public WebElement subjectinput;

    @FindBy(id = "message")
    public WebElement messageTextarea;

    @FindBy(name = "submit")
    public WebElement submitButton;

    @FindBy(xpath = "//div[.='Success! Your details have been submitted successfully.']")
    public WebElement successMessage;

    @FindBy (xpath = "//i[@class='fa fa-angle-double-left']")
    public WebElement homeButton;






}
