package com.cydeo.tests.day9_javaFaker_testbase_driverUtil;

public class Singleton {

    //since we dont wanna create any objects from that cons. then we make it private.

    private Singleton() {

    }

    //we defined as static to ensure to access by class name.
    private static String word;

    // we  provide getter method for that
    public static String getWord() {

        if (word == null) {
            System.out.println("word is null. " +
                    "Assigning a value to it now");
            word = "something";
        } else {
            System.out.println("word has already a value");
        }

        return word;

    }
}
