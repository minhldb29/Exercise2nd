package pages;

import core.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InitPage extends BasePage {
    @FindBy(xpath = "//a[contains(text(),'Log in')][1]")
    private WebElement loginBtn1;

    public InitPage(WebDriver d){super(d);}

    @Step("Click To Login")
    public void clickToLogin(){
        getWebDriverWait().until(ExpectedConditions.visibilityOf(loginBtn1));
        loginBtn1.click();
    }

    @Step("Navigate To Init Page")
    public void navigateToInitPage(String url) {
        getDriver().get(url);
        getDriver().manage().window().maximize();
        getWebDriverWait().until(ExpectedConditions.visibilityOf(loginBtn1));
    }
}
