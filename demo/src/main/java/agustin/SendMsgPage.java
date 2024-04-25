package agustin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.support.ui.ExpectedConditions;
// import org.openqa.selenium.support.ui.WebDriverWait;

public class SendMsgPage extends BasePage {
    private By composeLink = By.xpath("//a[contains(@href, 'compose-new') and contains(@class, 'btn-icon-vertical') and contains(@class, 'btn-transition')]");
    
    public SendMsgPage(WebDriver driver) {
        super(driver);
    }

    public void clickCompose() {
        click(composeLink);
    }
}
