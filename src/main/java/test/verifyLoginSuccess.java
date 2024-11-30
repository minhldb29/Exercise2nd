package test;

import config.ConfigRead;
import core.BaseTest;
import org.testng.annotations.Test;
import pages.InitPage;
import pages.LoginPage;

import java.io.IOException;

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
