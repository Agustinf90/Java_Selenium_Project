package agustin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.support.ui.ExpectedConditions;
// import org.openqa.selenium.support.ui.WebDriverWait;

// import agustin.utils.TestHelper;

public class LoginHelper extends BasePage {
 
    private By emailInput = By.xpath("//input[@id='emails']");
    private By passInput = By.xpath("//input[@id='password']");
    private By loginSbmt = By.xpath("//button[@id='login-button']");
 
    // Constructor:
    private WebDriver driver; // Agrega esta variable de instancia

    // Constructor:
    public LoginHelper(WebDriver driver) {
        super(driver);
        this.driver = driver; // Almacena el WebDriver recibido
    }
    // Methods:
    // public String getBaseUrl() {
    //     return TestHelper.getBaseUrl();
    // }
    public void login(String email, String password) {
        type(emailInput, email);
        type(passInput, password);
        click(loginSbmt);
    }
}
