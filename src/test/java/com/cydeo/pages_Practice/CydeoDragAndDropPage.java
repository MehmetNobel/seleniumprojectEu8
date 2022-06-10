package com.cydeo.pages_Practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CydeoDragAndDropPage {
    
    
    public CydeoDragAndDropPage(String url){

        PageFactory.initElements(Driver.getDriver(),this);

        Driver.getDriver().get(url);
        
        
    }
    
    
    @FindBy(css = "#column-a")
    public WebElement columna;

    @FindBy(css = "#column-b")
    public WebElement columnb;
    
    
    
    
}
