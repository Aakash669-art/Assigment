package com.WebAutomation.pages.pageObjectModel.orangeHRM;

import com.WebAutomation.base.CommonToAllPage;
import com.WebAutomation.utils.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIM extends CommonToAllPage {
    WebDriver driver;

    public PIM(WebDriver driver) {
        this.driver = driver;
    }
    By pim = By.xpath("//span[normalize-space()='PIM']");
    By employee_Name = By.xpath("(//input[@placeholder='Type for hints...'])[1]");
    By employee_Id = By.xpath("(//input[@class='oxd-input oxd-input--active'])[last()]");
    By supervisename = By.xpath("(//input[@placeholder='Type for hints...'])[2]");
    By employement_status =By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]");

    public void PIM1(String employementStatus){
        By text = By.xpath("//span[text()='"+employementStatus+"']");
        clickElement(pim);
        WaitHelper.checkVisibility(driver , employee_Name);
        enterInput(employee_Name ,"Aakash" );
        enterInput(employee_Id , "11");
        clickElement(employement_status);
        WaitHelper.checkVisibility(driver , text);
        clickElement(text);
        }
}
