package com.cydeo.pages_Practice_2;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoExerReviewProductPage {

    public AutoExerReviewProductPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(partialLinkText = " Products")
    public WebElement productsButton;

    @FindBy(xpath = "//a[@href='/product_details/2']")
    public WebElement viewProductButton;

    @FindBy(css = "#name")
    public WebElement nameInput;

    @FindBy(css = "#email")
    public WebElement emailInput;

    @FindBy(css = "#review")
    public WebElement reviewInput;

     @FindBy(css = "#button-review")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class='alert-success alert']")
    public WebElement message;




}
