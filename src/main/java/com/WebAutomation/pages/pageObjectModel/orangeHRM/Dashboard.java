package com.WebAutomation.pages.pageObjectModel.orangeHRM;

import com.WebAutomation.base.CommonToAllPage;
import com.WebAutomation.utils.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard extends CommonToAllPage {
    WebDriver driver;

    public Dashboard(WebDriver driver) {
        this.driver = driver;
    }
    private By dashboard = By.xpath("//h6[normalize-space()='Dashboard']");


    public  String logInUserName(){

        WaitHelper.checkVisibility(driver , dashboard);
        return getText(dashboard);
    }
}
