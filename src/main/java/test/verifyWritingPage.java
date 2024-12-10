package test;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.*;

public class verifyWritingPage extends BaseTest {
    @Test
    public void verifyWritingPage(){
        InitPage initPage = new InitPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());
        WritingPage writingPage = new WritingPage(getDriver());
        initPage.navigateToInitPage("https://www.grammarly.com/");
        initPage.clickToLogin();
        loginPage.inputEmail();
        loginPage.clickConinueButton();
        loginPage.inputPassword();
        loginPage.clickToLogin();
        dashboardPage.clickToAccountScreen();
        profilePage.navigateToWritingScreen();
        writingPage.navigateToYourdictionaryScreen();
        writingPage.verifyPersonDictionnaryDescribeTextDisplayed();
    }
}
