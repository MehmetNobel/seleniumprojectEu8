package com.cydeo.tests.day8_webTables_Proporties_Conf_Reader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_test() throws IOException {

        //1-we should first create the object of Properties

        Properties properties=new Properties();

        //2-WE NEED to open the file in java memory: FileInputStream
        FileInputStream file=new FileInputStream("configuration.properties");

        //3-load the proporties object using FILEINPUTSTREAM object
        properties.load(file);

        //4-use  "proporties" object to read  the value
        
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));

        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));

        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));

      //  System.out.println("properties.getProperty(\"usernam\") = " + properties.getProperty("usernam"));
        // this will give us null value "usernam" : because we did not define in conf.proporties like that
    }




}
