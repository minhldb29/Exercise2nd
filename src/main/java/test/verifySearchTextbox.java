package test;

import core.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Step;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.InitPage;
import pages.LoginPage;

public class verifySearchTextbox extends BaseTest {
    @Test
    @Epic("Verify Search Textbox is Displayed on Dashboard")
    public void verifySearchTextboxDisplayed() {
        InitPage initPage = new InitPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        initPage.navigateToInitPage("https://www.grammarly.com/");
        initPage.clickToLogin();
        loginPage.inputEmail();
        loginPage.clickConinueButton();
        loginPage.inputPassword();
        loginPage.clickToLogin();
        dashboardPage.verifySearchTextboxDisplayed();
    }
}
