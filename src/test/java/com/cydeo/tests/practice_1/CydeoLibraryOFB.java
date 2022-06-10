package com.cydeo.tests.practice_1;

import com.cydeo.pages_Practice_1.CydeoLibraryHomePageOFB;
import com.cydeo.utilities.BrowserUtils;
import org.testng.annotations.Test;

public class CydeoLibraryOFB {

    @Test
    public void testOFB(){

        CydeoLibraryHomePageOFB cydeoLibraryHomePageOFB=new CydeoLibraryHomePageOFB("https://library2.cybertekschool.com/login.html");

        BrowserUtils.sleep(2);

        cydeoLibraryHomePageOFB.elementEmail.sendKeys("mehmet@gmail.com");

        cydeoLibraryHomePageOFB.elementPassword.sendKeys("123");

        cydeoLibraryHomePageOFB.btnButton.click();




    }




}
