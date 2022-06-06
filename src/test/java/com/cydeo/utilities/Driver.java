package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver(){

    }

    private static WebDriver driver;

    public static WebDriver getDriver(){

        if(driver==null){

            String browserType=ConfigurationReader.getProperty("browser");

            switch (browserType){

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;


                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

            }

        }

        return driver;

    }

    public static void closeDriver(){
        if(driver!=null){
            driver.quit();  // will close all the tabs; we destroy the current driver.But current driver is not null.
            driver=null;  // in here we assign the driver as null to able to create new driver in following tabs/sessions.
        }

    }




}
