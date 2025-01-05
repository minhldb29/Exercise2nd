package test;

import core.BaseTest;
import io.qameta.allure.Epic;
import org.testng.annotations.Test;
import pages.*;

public class verifySubcriptionPage extends BaseTest {
    @Test
    @Epic("Verify Elements on Subcription Page")
    public void verifySubcriptionPage(){
        InitPage initPage = new InitPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());
        SubcriptionPage subcriptionPage = new SubcriptionPage(getDriver());
        initPage.navigateToInitPage("https://www.grammarly.com/");
        initPage.clickToLogin();
        loginPage.inputEmail();
        loginPage.clickConinueButton();
        loginPage.inputPassword();
        loginPage.clickToLogin();
        dashboardPage.clickToAccountScreen();
        profilePage.navigateToSubcriptionScreen();
        subcriptionPage.verifySubcriptionTitleDisplayed();
        subcriptionPage.verifyDescribeTextDisplayed();
    }
}
