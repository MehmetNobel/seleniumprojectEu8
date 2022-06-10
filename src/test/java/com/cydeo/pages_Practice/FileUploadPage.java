package com.cydeo.pages_Practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUploadPage {
    
    public FileUploadPage(String url){

        PageFactory.initElements(Driver.getDriver(),this);

        Driver.getDriver().get(url);
                
    }
    
    @FindBy(css = ".nav-link")
    public WebElement homeLink;

    @FindBy(id = "file-upload")
    public WebElement fileUploadLink;

    @FindBy(id = "file-submit")
    public WebElement filesubmitnput;
    
}
