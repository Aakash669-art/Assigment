package com.WebAutomation.test.pom;

import com.WebAutomation.base.CommonToAllTestCase;
import com.WebAutomation.drivers.DriverManager;
import com.WebAutomation.pages.pageObjectModel.orangeHRM.Dashboard;
import com.WebAutomation.pages.pageObjectModel.orangeHRM.LoginPage;
import com.WebAutomation.pages.pageObjectModel.orangeHRM.PIM;
import com.WebAutomation.utils.PropertiesReader;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.WebAutomation.drivers.DriverManager.driver;
import static com.WebAutomation.drivers.DriverManager.getDriver;
import static org.assertj.core.api.Assertions.*;

public class TestOrangeHRMDashboard extends CommonToAllTestCase {


    @Description("Verify the  username and password")
    @Test
    public  void logvalidCredentail() throws  Exception{

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.loginToOrangeHRMLoginValidCreds(PropertiesReader.readkey("username"), PropertiesReader.readkey("password"));
        Dashboard dashboard = new Dashboard(getDriver());
        String userNameLoggesIN = dashboard.logInUserName();

        assertThat(userNameLoggesIN).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(userNameLoggesIN , PropertiesReader.readkey("ohr_expectedTitle"));

        PIM pim = new PIM(getDriver());
        pim.PIM1(PropertiesReader.readkey("employementStatus"));

        LoginPage logout1 = new LoginPage(getDriver());
        logout1.logout();
        getDriver().quit();
    }

}
