package com.cydeo.pages_Lecture;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoadingExample7Page {

    public DynamicLoadingExample7Page(){

        PageFactory.initElements(Driver.getDriver(),this);

    }



    @FindBy (id = "alert")
    public WebElement doneText;

    @FindBy(xpath = "//img[@src='/img/a-few-moments.jpg']")
    public WebElement image;







}
