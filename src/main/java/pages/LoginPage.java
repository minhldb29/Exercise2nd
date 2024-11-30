package pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//input[@name='email']")
    private WebElement email;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement continueBtn;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginBtn;

    public LoginPage (WebDriver d){
        super(d);
    }

    public void verifyEmailDisplayed(){
        boolean emailDisplayed = email.isDisplayed();

        if (emailDisplayed) {
            System.out.println("Email is displayed!");
        } else {
            System.out.println("Email is not displayed!");
        }
    }

    public void verifyContinueButtonDisplayed(){
        boolean submitBtnDisplayed = continueBtn.isDisplayed();

        if (submitBtnDisplayed) {
            System.out.println("Continue button is displayed!");
        } else {
            System.out.println("Continue button is not displayed!");
        }
    }

    public void clickConinueButton(){
        continueBtn.click();
    }

    public void verifyPasswordDisplayed(){
        getWebDriverWait().until(ExpectedConditions.visibilityOf(password));
        boolean passwordDisplayed = password.isDisplayed();

        if (passwordDisplayed) {
            System.out.println("Password is displayed!");
        } else {
            System.out.println("Password is not displayed!");
        }
    }

    public void verifyLoginDisplayed(){
        boolean loginBtnDisplayed = loginBtn.isDisplayed();

        if (loginBtnDisplayed) {
            System.out.println("Login button is displayed!");
        } else {
            System.out.println("Login button is not displayed!");
        }
    }

    public void inputEmail(){
        email.clear();
        email.sendKeys("binhminh9631@gmail.com");
    }

    public void inputPassword(){
        password.clear();
        password.sendKeys("Binhminh294.");
    }

    public void clickToLogin(){
        loginBtn.click();
    }
}
