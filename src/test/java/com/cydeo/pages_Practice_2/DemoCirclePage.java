package com.cydeo.pages_Practice_2;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoCirclePage {

    public DemoCirclePage(){

        PageFactory.initElements(Driver.getDriver(),this);


    }

    @FindBy (xpath = "//div[@id='draggable']")
    public WebElement smallCircle;

    @FindBy (xpath = "//div[@id='droptarget']")
    public WebElement bigCircle;



}
