package pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class ProfilePage extends BasePage {
    public ProfilePage(WebDriver d){super(d);}

    @FindBy(xpath = "//h1[contains(text(),'Profile')]")
    private WebElement profileTxt;

    @FindBy(xpath = "//p[@data-qa='Name-Value']")
    private WebElement nameValue;

    @FindBy(xpath = "//p[@data-qa='Email-Value']")
    private WebElement emailValue;

    @FindBy(xpath = "//span[contains(text(),'Subscription')]")
    private WebElement subcriptionBtn;

    @FindBy(xpath = "//span[contains(text(),'Writing')]")
    private WebElement writingBtn;

    @FindBy(xpath = "//span[contains(text(),'Settings')]")
    private WebElement settingBtn;

    public void verifyProfileDisplayed(){
        getWebDriverWait().until(ExpectedConditions.visibilityOf(profileTxt));
        Assert.assertTrue(profileTxt.isDisplayed());
    }

    public void verifyNameValueIsCorrect(){
        String NameValue = nameValue.getText();
        try{
            Assert.assertEquals(NameValue, "MinhLDB");
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public void verifyEmailValueIsCorrect(){
        String EmailValue = emailValue.getText();
        try{
            Assert.assertEquals(EmailValue, "binhminh9631@gmail.com");
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public void navigateToSubcriptionScreen(){
        getWebDriverWait().until(ExpectedConditions.visibilityOf(subcriptionBtn));
        subcriptionBtn.click();
    }

    public void navigateToWritingScreen(){
        writingBtn.click();
    }

    public void navigateToSettingScreen(){
        settingBtn.click();
    }
}
