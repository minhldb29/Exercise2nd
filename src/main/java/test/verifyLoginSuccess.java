package test;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.InitPage;
import pages.LoginPage;

public class verifyLoginSuccess extends BaseTest {
    @Test
    public void verifyLoginSuccessfully(){
        InitPage initPage = new InitPage(getDriver());
        initPage.navigateToInitPage("https://www.grammarly.com/");
        initPage.clickToLogin();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.verifyEmailDisplayed();
        loginPage.verifyContinueButtonDisplayed();
        loginPage.inputEmail();
        loginPage.clickConinueButton();
        loginPage.verifyPasswordDisplayed();
        loginPage.verifyLoginDisplayed();
        loginPage.inputPassword();
        loginPage.clickToLogin();
    }
}
