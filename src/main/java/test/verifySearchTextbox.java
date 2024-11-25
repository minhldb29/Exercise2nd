package test;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.InitPage;
import pages.LoginPage;

public class verifySearchTextbox extends BaseTest {
    @Test
    public void verifySearchTextboxDisplayed() {
        InitPage initPage = new InitPage(getDriver());
        initPage.navigateToInitPage("https://www.grammarly.com/");
        initPage.clickToLogin();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.inputEmail();
        loginPage.clickConinueButton();
        loginPage.inputPassword();
        loginPage.clickToLogin();
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        dashboardPage.verifySearchTextboxDisplayed();
    }
}
