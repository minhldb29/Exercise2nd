package pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class SubcriptionPage extends BasePage {
    public SubcriptionPage(WebDriver d){super(d);}

    @FindBy(xpath = "//h1[contains(text(),'Subscription')]")
    private WebElement subcriptionTitle;

    @FindBy(xpath = "//p[@class='gds-typography gds-text gds-text-medium _description_1sfw3_17']")
    private WebElement describeText;

    public void verifySubcriptionTitleDisplayed(){
        getWebDriverWait().until(ExpectedConditions.visibilityOf(subcriptionTitle));
        Assert.assertTrue(subcriptionTitle.isDisplayed());
    }

    public void verifyDescribeTextDisplayed(){
        Assert.assertTrue(describeText.isDisplayed());
    }
}
