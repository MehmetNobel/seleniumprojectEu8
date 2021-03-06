package com.cydeo.tests.day11_Actions_Jsexecutor_practices;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {

    @Test
    public void test1(){

        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement madrid = Driver.getDriver().findElement(By.id("box7"));

        WebElement spain = Driver.getDriver().findElement(By.id("box107"));

        Actions actions=new Actions(Driver.getDriver());

        actions.dragAndDrop(madrid,spain).perform();

        Driver.closeDriver();


    }







    @Test
    public void test2() {

        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        Actions actions = new Actions(Driver.getDriver());

        WebElement rome = Driver.getDriver().findElement(By.cssSelector("#box6"));

        WebElement italy = Driver.getDriver().findElement(By.cssSelector("#box106"));

       // actions.dragAndDrop(rome, italy).perform();

        // second and long way for drag and drop

        //actions.clickAndHold(rome).moveToElement(italy).release().perform();

        //aralarında 2000 mlsaniye= 2 sn süre verilerek yapılmış hali:

        actions.clickAndHold(rome).pause(2000).moveToElement(italy).pause(2000).release().perform();

        WebElement washington = Driver.getDriver().findElement(By.id("box3"));

        WebElement unitedStates = Driver.getDriver().findElement(By.id("box103"));

        actions.dragAndDrop(washington,unitedStates).perform();

    }


    @Test
    public void test3(){

        Driver.getDriver().get("https://www.amazon.com/");

        BrowserUtils.sleep(2);

        WebElement toy = Driver.getDriver().findElement(By.xpath("(//span[@class='a-truncate-cut'])[4]"));

        Actions actions=new Actions(Driver.getDriver());

        actions.moveToElement(toy).perform();



    }

    @Test
    public void test4(){

        Driver.getDriver().get("https://www.hepsiburada.com/");

        BrowserUtils.sleep(2);

       /* Alert alert= Driver.getDriver().switchTo().alert();

        BrowserUtils.sleep(2);
        alert.accept();

        */

        WebElement car = Driver.getDriver().findElement(By.xpath("//li[@class='sf-MenuItems-WulWXvlfIAwNiOUGY7FP'][5]"));

        Actions actions=new Actions(Driver.getDriver());

        actions.moveToElement(car).perform();

        BrowserUtils.sleep(2);

        actions.contextClick(car).perform();




    }

    // int a='A';  => gives the A 's ASCİ TABLE VALUE


}