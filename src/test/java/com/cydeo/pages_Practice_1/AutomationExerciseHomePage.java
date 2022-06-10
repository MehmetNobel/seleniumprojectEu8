package com.cydeo.pages_Practice_1;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationExerciseHomePage {

    public AutomationExerciseHomePage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//h2[.='Subscription']")
    public WebElement subscriptionButton;

    @FindBy (xpath = "//i[@class='fa fa-angle-up']")
    public WebElement bottomArrow;

    @FindBy(xpath = "//h2[.='Full-Fledged practice website for Automation Engineers']")
    public WebElement fullFledgedText;











}
