package com.cydeo.utilities;

public class ReviewUtils {

    public static void staticWait(int seconds){

        try {
            Thread.sleep(seconds*1000);
        }catch (InterruptedException e){

        }

    }
}
