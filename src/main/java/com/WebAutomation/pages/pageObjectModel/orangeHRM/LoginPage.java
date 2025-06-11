package com.WebAutomation.pages.pageObjectModel.orangeHRM;

import com.WebAutomation.base.CommonToAllPage;
import com.WebAutomation.utils.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends CommonToAllPage {

    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver  = driver;
    }
    private By username = By.xpath("//input[@name ='username']");
    private By password = By.xpath("//input[@name ='password']");
    private By loginButton = By.xpath("//button[@type='submit']");
    private By userProfile = By.xpath("//span[@class = 'oxd-userdropdown-tab']");
    private By about = By.xpath("//a[text()='About']");
    private By close = By.xpath("//button[text()='×']");
    private By logout = By.xpath("//a[text()='Logout']");

    public void loginToOrangeHRMLoginValidCreds(String user, String pwd) {
            openOrangeHRMUrl();
            WaitHelper.checkVisibility(driver , username);
            enterInput(username,user);
            enterInput(password,pwd);
            clickElement(loginButton);
        }
    public  void popup(){
      clickElement(userProfile);
      clickElement(about);
      clickElement(close);

    }
        public void logout()
        {
        clickElement(userProfile);
        clickElement(logout);
        }

    }

