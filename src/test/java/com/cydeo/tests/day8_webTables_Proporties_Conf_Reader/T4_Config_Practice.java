package com.cydeo.tests.day8_webTables_Proporties_Conf_Reader;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_Config_Practice {

  /*  public WebDriver driver;

    @BeforeMethod
    public void setup() {

        //we are getting the browsertype dynamically from the conf.reader class. to be more flexible.

        String browserType= ConfigurationReader.getProperty("browser");

        driver = WebDriverFactory.getDriver(browserType);

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



    }

   */



        // we are now using the utility method of Driver.
    // to set the driver we write as Driver.getDriver();

    @Test
    public void googleSearchTest(){

        Driver.getDriver().get("https://www.google.com");

        WebElement elementSearchBox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));

        elementSearchBox.sendKeys("apple"+ Keys.ENTER);

        String expectedTitle="apple - Google'da Ara";

        BrowserUtils.sleep(2);

        Assert.assertEquals(Driver.getDriver().getTitle(),expectedTitle);


    }



}
