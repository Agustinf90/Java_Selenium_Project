package agustin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import agustin.utils.TestHelper;

import org.testng.annotations.BeforeClass;
// package agustin.test.pages.HomePage;

public abstract class BaseTest {
    protected WebDriver driver;
    protected static HomePage homePage;
    protected String getBaseUrl() {
        return TestHelper.getBaseUrl();
    }
    @BeforeClass
    public void setupClass() {

    }

    @BeforeMethod
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
         // options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
             //  driver.quit();
        }
    }
}
