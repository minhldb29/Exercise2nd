package core;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected WebDriver driver;

    @BeforeTest
    @Parameters({"browser"})
    public void beforeTest(@Optional("chrome") String browser) {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setPlatform(Platform.WINDOWS);

        if (browser.equals("chrome")) {
            ChromeOptions chromeOptions = new ChromeOptions();
            // Uncomment the next line if you want to run Chrome in headless mode
            // chromeOptions.addArguments("--headless");
            desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
            driver = new ChromeDriver(chromeOptions);
        }

        if (browser.contains("firefox")) {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
            desiredCapabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, firefoxOptions);
            driver = new FirefoxDriver(firefoxOptions);
        }
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}
