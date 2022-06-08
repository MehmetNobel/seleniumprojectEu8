package com.cydeo.tests.day12_pomDesign_ExplictWait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMPractices {

    //we are putting this to the class level since access inside the methods.
    LibraryLoginPage libraryLoginPage;

    @BeforeMethod
    public void setup(){

        Driver.getDriver().get("https://library2.cybertekschool.com/login.html");

        libraryLoginPage=new LibraryLoginPage();

    }

    @Test
    public void requiredFieldErrorMessageTest(){

        libraryLoginPage.logInButton.click();

        BrowserUtils.sleep(2);

        Assert.assertTrue(libraryLoginPage.thisFieldIsRequiredMessage.isDisplayed());

        Driver.closeDriver();

    }

    @Test
    public void pleaseEnterValidEmailAddressTest(){

        libraryLoginPage.inputUserName.sendKeys("mehmet@");

        libraryLoginPage.logInButton.click();

        Assert.assertTrue(libraryLoginPage.pleaseEnterAValidEmailAddressMessage.isDisplayed());

        Driver.closeDriver();

    }

    @Test
    public void sorryWrongEmailOrPassword(){

        libraryLoginPage.inputUserName.sendKeys("mehmet@gmail.com");

        libraryLoginPage.inputPassword.sendKeys("12345");

        libraryLoginPage.logInButton.click();

        Assert.assertTrue(libraryLoginPage.sorryWrongEmailOrPasswordMessage.isDisplayed());


    }




}
