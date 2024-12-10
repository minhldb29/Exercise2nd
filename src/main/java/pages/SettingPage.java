package pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SettingPage extends BasePage {
    public SettingPage (WebDriver d){
        super(d);
    }

    @FindBy(xpath = "//a[contains(text(),'Feature customization')]")
    private WebElement featureCustom;

    @FindBy(xpath = "//h1[contains(text(),'Feature customization')]")
    private WebElement featureCustomTitle;

    public void navigateToFeatureCustomScreen(){
        getWebDriverWait().until(ExpectedConditions.visibilityOf(featureCustom));
        featureCustom.click();
    }

    public void verifyFeatureCustomTitleDisplayed(){
        boolean DialectDisplayed = featureCustomTitle.isDisplayed();

        if (DialectDisplayed) {
            System.out.println("Dialect tilte is displayed!");
        } else {
            System.out.println("Dialect title is not displayed!");
        }
    }
}
