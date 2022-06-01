package com.cydeo.tests.day8_webTables_Proporties_Conf_Reader;

import org.testng.annotations.Test;

public class LearningProporties {

    @Test
    public void java_properties_reading_test(){

        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));

        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));


    }


}
