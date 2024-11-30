package core;

import config.ConfigRead;
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

import java.io.IOException;

public class BaseTest {
    protected WebDriver driver;
    private ConfigRead configRead;

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
            desiredCapabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, firefoxOptions);
            driver = new FirefoxDriver(firefoxOptions);
        }
    }
        public void setUp() throws IOException {
        String environment = System.getProperty("prod", "stage");
        configRead = new ConfigRead(environment);
        String url = configRead.getUrl(environment);
        String email = configRead.getEmail(environment);
        String password = configRead.getPassword(environment);

        driver.get(url);
        System.out.println("Test on: " +url);
        System.out.println("Using email: " +email);
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
