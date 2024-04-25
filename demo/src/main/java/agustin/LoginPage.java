package agustin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import agustin.utils.TestHelper;

public class LoginPage extends BasePage {

    // Locators:
    private By loginIonik = By.xpath("//div[text()='Iniciar sesi\u00F3n']");
    private By emailInput = By.xpath("//input[@id='emails']");
    private By passInput = By.xpath("//input[@id='password']");
    private By loginSbmt = By.xpath("//button[@id='login-button']");
    private By whatsappBot = By.xpath("//a[@href='module-whatsappchatbot-new']");
    private By invalidCredentialsMsg = By.xpath("//p[normalize-space(text())='Your email or password is incorrect!']");
    private By divPageTitle = By.xpath("//div[@id='page-title']");
    private By divStartPage = By.xpath("//div[@id='toast-container']");
    // Constructor:
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Methods:
    public String getBaseUrl() {
        return TestHelper.getBaseUrl();
    }
    
    public String getInvalidCredentialsMsg() {
        return getText(invalidCredentialsMsg);
    }

    public void typeEmail(String text) {
        type(emailInput, text);
    }

    public void typePassword(String text) {
        type(passInput, text);
    }

    public void clickLogin() {
        click(loginSbmt);
    }

    public void clickWsp() {
        click(whatsappBot);
    }
    public WebElement waitForDivStart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(divStartPage));
    }

    public WebElement waitForPageTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(divPageTitle));
    }
}
