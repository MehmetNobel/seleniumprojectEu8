package com.cydeo.tests.practice_1;

import com.cydeo.pages_Practice_1.FileUploadPage;
import org.testng.annotations.Test;

public class FileUpload {

    @Test
    public void test(){

        FileUploadPage fileUploadPage=new FileUploadPage("https://practice.cydeo.com/upload");

        fileUploadPage.fileUploadLink.sendKeys("C:\\Users\\ev\\Desktop\\metin.txt");

        fileUploadPage.filesubmitnput.click();



    }




}
