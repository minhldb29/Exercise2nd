package test;

import core.BaseTest;
import org.testng.annotations.Test;
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
    @Test
    public void debug(){
        String environment = "stage";
        ConfigRead configRead = new ConfigRead(environment);
        String url = configRead.getUrl(environment);
        String email = configRead.getEmail(environment);
        String password = configRead.getPassword(environment);

        try{
            driver.get(url);
            System.out.println("Test on: " +url);
            System.out.println("Using email: " +email);
        }
        finally {
            driver.quit();
        }
    }
}
