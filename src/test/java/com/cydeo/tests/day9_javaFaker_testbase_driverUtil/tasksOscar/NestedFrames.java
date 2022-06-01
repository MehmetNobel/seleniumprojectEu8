package com.cydeo.tests.day9_javaFaker_testbase_driverUtil.tasksOscar;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NestedFrames {

    static WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = Driver.getDriver();
        driver.get("https://practice.cydeo.com/nested_frames");
    }


    @Test
    public void test1() {

        //her bir frame in içindeki text i alabilmemiz için adım adım ona ulaşmamız gerekiyor.
        //bir adım eksik olursa ulaşamayız.
        //frame() ==>> name veya id ile çağrılabilir.


        // önce en üst frame gidiyoruz

        driver.switchTo().frame("frame-top");

        //üst frame in bir alt frame i olan alt frame e geciyoruz.

        driver.switchTo().frame("frame-middle");

        //text ini alıyoruz.

        String textMiddleFrame = driver.findElement(By.xpath("//div[@id='content']")).getText();

        System.out.println("textMiddleFrame = " + textMiddleFrame);

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame-bottom");

        WebElement bottomFrameInsideText = driver.findElement(By.tagName("body"));

        System.out.println("bottomFrameInsideText.getText() = " + bottomFrameInsideText.getText());

        // parent frame sadece bir üst parentına cıkar.

        driver.switchTo().parentFrame();

        // defaultcontent en üst html sayfasına çıkarır bizi.parent ile farkı budur.
        driver.switchTo().defaultContent();


    }
}