package com.WebAutomation.base;

import com.WebAutomation.drivers.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonToAllTestCase {
    @BeforeMethod
    public void setUp(){
        DriverManager.init();
    }}

//    @AfterMethod
//    public void tearDown(){
//        DriverManager.down();
//    }
//}
