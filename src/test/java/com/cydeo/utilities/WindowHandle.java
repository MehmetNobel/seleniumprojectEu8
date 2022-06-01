package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;

public class WindowHandle {


    public static void windowHandle(WebDriver driver, String expectedWebTitle){

        for (String each : driver.getWindowHandles()) {

            driver.switchTo().window(each);

            if(driver.getTitle().contains(expectedWebTitle)) {
                break;
            }

        }


    }




}
