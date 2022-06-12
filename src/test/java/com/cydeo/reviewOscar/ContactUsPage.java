package com.cydeo.reviewOscar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage{

    @FindBy(name = "name")
    public WebElement name;

    @FindBy(name = "email")
    public WebElement email;

    @FindBy(name = "subject")
    public WebElement subject;

    @FindBy(id = "message")
    public WebElement message;

    @FindBy(name = "upload_file")
    public WebElement uploadFile;

    @FindBy(name = "submit")
    public WebElement submit;

    @FindBy(xpath = "//div[.='Success! Your details have been submitted successfully.']")
    public WebElement successMessage;








}
