package test;

import core.BaseTest;
import io.qameta.allure.Epic;
import net.bytebuddy.build.CachedReturnPlugin;
import org.testng.annotations.Test;
import pages.*;

public class verifySettingPage extends BaseTest {
    @Test
    @Epic("Verify Elements on Setting Page")
    public void verifySettingPage(){
        InitPage initPage = new InitPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());
        SettingPage settingPage = new SettingPage(getDriver());
        initPage.navigateToInitPage("https://www.grammarly.com/");
        initPage.clickToLogin();
        loginPage.inputEmail();
        loginPage.clickConinueButton();
        loginPage.inputPassword();
        loginPage.clickToLogin();
        dashboardPage.clickToAccountScreen();
        profilePage.navigateToSettingScreen();
        settingPage.navigateToFeatureCustomScreen();
        settingPage.verifyFeatureCustomTitleDisplayed();
    }
}
