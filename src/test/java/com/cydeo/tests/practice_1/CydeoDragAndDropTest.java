package com.cydeo.tests.practice_1;

import com.cydeo.pages_Practice.CydeoDragAndDropPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CydeoDragAndDropTest {

    @Test
    public void test1(){

        CydeoDragAndDropPage cydeoDragAndDropPage=new
                CydeoDragAndDropPage("https://practice.cydeo.com/drag_and_drop");

        Actions actions=new Actions(Driver.getDriver());

        WebElement aBox = cydeoDragAndDropPage.columna;
        WebElement bBox = cydeoDragAndDropPage.columnb;

        //actions.dragAndDrop(cydeoDragAndDropPage.columnb, cydeoDragAndDropPage.columna).perform();

       // actions.moveToElement(aBox).pause(2000).clickAndHold().release(bBox).perform();

        actions.dragAndDrop(aBox,bBox).perform();




    }



}
