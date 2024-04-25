package agustin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import agustin.utils.TestHelper;

public abstract class BasePage {
    // Variables:
    protected WebDriver driver;

    // Constructor:
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods:
     public String getBaseUrl() {
        return TestHelper.getBaseUrl();
    }
    
    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }

    protected void click(By locator) {
        find(locator).click();
    }

    protected void type(By locator, String text) {
        WebElement element = find(locator);
        element.clear();
        element.sendKeys(text);
    }

    protected boolean elementIsDisplayed(By locator) {
        try {
            return find(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    protected String getText(By locator) {
        return find(locator).getText();
    }
}
