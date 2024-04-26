package agustin;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginHelper extends BasePage {
    //locators:
    private By emailInput = By.xpath("//input[@id='emails']");
    private By passInput = By.xpath("//input[@id='password']");
    private By loginSbmt = By.xpath("//button[@id='login-button']");

    // Constructor:
    public LoginHelper(WebDriver driver) {
        super(driver);
        this.driver = driver; // Almacena el WebDriver recibido
    }
    // Methods:
    public void login(String email, String password) {
        type(emailInput, email);
        type(passInput, password);
        click(loginSbmt);
    }
}
