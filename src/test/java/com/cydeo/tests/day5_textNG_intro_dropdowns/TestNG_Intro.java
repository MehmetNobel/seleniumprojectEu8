package com.cydeo.tests.day5_textNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass   // before the execution of all the methods of this class automatially this runs.
    public void setUpMethod(){
        System.out.println("------>  before class method is running");
    }
    @AfterClass   // before the execution of all the methods automatially this runs.
    public void teardownMethod(){
        System.out.println("------>  after class is running");
    }

    @BeforeMethod    // before the execution of all the methods automatially this runs.
    public void setupMethod(){
        System.out.println("------>  before method is running");
    }
    @AfterMethod
    public void tearDownMethod(){
        System.out.println("------>  After method is running");
    }

    @Test (priority = 1)   // priority can be negative or we can write like 2+2
    public void Test1(){

        System.out.println("test 1 is running");

        String actual="apple";
        String expected="apple";

        Assert.assertEquals(actual,expected);
    }
    @Test (priority = 2)
    public void Test2(){
        System.out.println("test 2 is running");

        String actual="apple";
        String expected="apple";
        Assert.assertEquals(actual,expected,"did not match");

    }

}
