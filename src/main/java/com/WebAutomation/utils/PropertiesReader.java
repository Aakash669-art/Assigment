package com.WebAutomation.utils;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    //File - data.properties->key->value

    public static String readkey(String key){
        Properties p =null;

        try {
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/WebAutomation/resource/data.properties");
            p =new Properties();
            p.load(fileInputStream);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return p.getProperty(key);

    }
}
