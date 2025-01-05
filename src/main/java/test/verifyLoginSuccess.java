package test;

import core.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import pages.InitPage;
import pages.LoginPage;

public class verifyLoginSuccess extends BaseTest {
    @Test
    @Epic("Verify Login successfully")
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
