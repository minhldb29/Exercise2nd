package pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DashboardPage extends BasePage {

    @FindBy(id = "doc-search-input")
    private WebElement searchTxb;

    @FindBy(xpath = "//span[contains(text(),'Account')]")
    private WebElement account;

    public DashboardPage(WebDriver d){
        super(d);
    }

    public void verifySearchTextboxDisplayed(){
        getWebDriverWait().until(ExpectedConditions.visibilityOf(searchTxb));
        boolean searchTxbDisplayed = searchTxb.isDisplayed();

        if (searchTxbDisplayed) {
            System.out.println("Search textbox is displayed!");
        } else {
            System.out.println("Search textbox is not displayed!");
        }
    }

    public void clickToAccountScreen(){
        getWebDriverWait().until(ExpectedConditions.visibilityOf(account));
        account.click();
    }
}
