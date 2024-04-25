package agustin;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import agustin.utils.TestHelper;

public class LoginTest extends BaseTest {

    private LoginPage loginPage;

    @DataProvider(name = "loginCredentials")
    public Object[][] getLoginCredentials() {
        return new Object[][] {
            // Invalid credentials
            {TestHelper.getInvalidEmail(), TestHelper.getInvalidPassword(), false},
            // Valid Credentials
            {TestHelper.getValidEmail(), TestHelper.getValidPassword(), true}
        };
    }

    @Test(dataProvider = "loginCredentials")
    public void testLoginPage(String email, String password, boolean expectSuccess) {
        driver.get(getBaseUrl());
        loginPage = new LoginPage(driver);
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
        loginPage.clickLogin();

        WebElement divElement = loginPage.waitForDivStart();
        String divText = divElement.getText();
        System.out.println(divText);

        String pageTitle = driver.getTitle();
        System.out.println("Page title: " + pageTitle);

        if (expectSuccess) {
            // Espera a que el usuario se haya autenticado correctamente
            WebElement divElement1 = loginPage.waitForPageTitle();
            String divText1 = divElement1.getText();
            System.out.println(divText1);
        } else {
            // Verifica que se muestre el mensaje de error adecuado
            divText = loginPage.waitForDivStart().getText();
            System.out.println(divText);
        }
        
        String pageTitle2 = driver.getTitle();
        System.out.println("Page title: " + pageTitle2);
    }
}
