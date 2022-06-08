package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CydeoDynamicControlsPage {

    public CydeoDynamicControlsPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//button[.='Remove']")
    public WebElement removeButton;

    @FindBy(css = "#checkbox")
    public WebElement checkBox;

   @FindBy(css = "#message")
    public WebElement message;

   @FindBy (xpath = "//img[@src='/img/ajax-loader.gif']")
    public WebElement loaderimage;

   @FindBy (xpath = "//button[.='Enable']")
    public WebElement enableButton;

   @FindBy(css = "#message")
    public WebElement disabledMessage;

   @FindBy (xpath = "//input[@type='text']")
    public WebElement textArea;

   @FindBy (xpath = "//div[@id='loading']")
    public WebElement loadingBar2;





}
