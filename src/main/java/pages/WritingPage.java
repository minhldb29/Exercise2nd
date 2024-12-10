package pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class WritingPage extends BasePage {
    public WritingPage(WebDriver d){
        super(d);
    }

    @FindBy(xpath = "//a[contains(text(),'Your dictionary')]")
    private WebElement yourdictionary;

    @FindBy(xpath = "//p[contains(text(),'Improve your Grammarly experience by adding words to your personal dictionary.')]")
    private WebElement dictionaryDescribeTxt;

    public void navigateToYourdictionaryScreen(){
        getWebDriverWait().until(ExpectedConditions.visibilityOf(yourdictionary));
        yourdictionary.click();
    }

    public void verifyPersonDictionnaryDescribeTextDisplayed(){
        getWebDriverWait().until(ExpectedConditions.visibilityOf(dictionaryDescribeTxt));
        Assert.assertTrue(dictionaryDescribeTxt.isDisplayed());
    }
}
