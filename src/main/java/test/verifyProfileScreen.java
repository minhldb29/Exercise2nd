package test;

import core.BaseTest;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.InitPage;
import pages.LoginPage;
import pages.ProfilePage;

public class verifyProfileScreen extends BaseTest {
    @Test
    @Description("Verify Elements on Profile Screen")
    public void verifyProfileScreen() {
        InitPage initPage = new InitPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());
        initPage.navigateToInitPage("https://www.grammarly.com/");
        initPage.clickToLogin();
        loginPage.inputEmail();
        loginPage.clickConinueButton();
        loginPage.inputPassword();
        loginPage.clickToLogin();
        dashboardPage.clickToAccountScreen();
        profilePage.verifyProfileDisplayed();
        profilePage.verifyNameValueIsCorrect();
        profilePage.verifyEmailValueIsCorrect();
    }
}
