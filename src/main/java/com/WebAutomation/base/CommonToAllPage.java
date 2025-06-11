package com.WebAutomation.base;

import com.WebAutomation.utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.WebAutomation.drivers.DriverManager.getDriver;

public class CommonToAllPage {
    public void CommonToAll() {
        // If you want to call something before every Page Object Class call, Put your Code here");
        // Open File, Open Data Base Connection You can write code here
    }
    public void openOrangeHRMUrl(){
        getDriver().get(PropertiesReader.readkey("current_url"));
    }

    public void clickElement(By by) {
        getDriver().findElement(by).click();
    }
    public void clickElement(WebElement by) {
        by.click();
    }

    public void enterInput(By by, String key) {
        getDriver().findElement(by).sendKeys(key);
    }

    public void enterInput(WebElement by, String key) {
        by.sendKeys(key);
    }

    public String getText(By by){
        return getDriver().findElement(by).getText();
    }

    public String getText(WebElement by){
        return by.getText();
    }

}
