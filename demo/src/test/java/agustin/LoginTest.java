package agustin;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import agustin.utils.TestHelper;

public class LoginTest extends BaseTest {

    private LoginPage loginPage;

    @DataProvider(name = "invalidLoginCredentials")
    public Object[][] getInvalidLoginCredentials() {
        return new Object[][] {
            {TestHelper.getInvalidEmail(), TestHelper.getInvalidPassword()}
        };
    }
    // Escenario Login
// Test 01 Login con credenciales invalidas
    @Test(dataProvider = "invalidLoginCredentials")
    public void testInvalidLogin(String email, String password) {
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
        
        // Verifica que se muestre el mensaje de error adecuado
        divText = loginPage.waitForDivStart().getText();
                Assert.assertTrue(divText.contains("Sus detalles de registro no están asociados con ningún usuario aquí."),
            "Por favor cheque sus datos");
        
        // String pageTitle2 = driver.getTitle();
        // System.out.println("Page title: " + pageTitle2);

         
    }

    @DataProvider(name = "validLoginCredentials")
    public Object[][] getValidLoginCredentials() {
        return new Object[][] {
            {TestHelper.getValidEmail(), TestHelper.getValidPassword(), TestHelper.getValidEmailToRestore()}
        };
    }
// Test 02 login con credenciales validas
    @Test(dataProvider = "validLoginCredentials")
    public void testValidLogin(String email, String password, String emailToRestore) {
        driver.get(getBaseUrl());
        loginPage = new LoginPage(driver);
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
        loginPage.clickLogin();

        loginPage.waitForDivStart();
        // Espera a que el usuario se haya autenticado correctamente
        loginPage.waitForPageTitle();

        
    }
    // Escenario Restarar password
// Test 03 restaurar password con credenciales validas
    @Test(dataProvider = "validLoginCredentials")
    public void restorePassworrdInvalidCredentials(String email, String password, String emailToRestore) {
        driver.get(getBaseUrl());
        loginPage = new LoginPage(driver);

        loginPage.click(LoginPage.forgotPasswordLink);
        loginPage.waitForPasswordDiv();
        loginPage.typeEmailRestore(emailToRestore);
        loginPage.click(LoginPage.resetPasswordButton);
        WebElement divElement = loginPage.waitForDivStart();
        String divText = divElement.getText();
       Assert.assertTrue(divText.contains("Hemos enviado una nueva contraseña a su correo electrónico."),
            "Úselo para iniciar sesión y establecer una nueva contraseña");
 
    }
   
// Test 04 restaurar password con credenciales invalidas
@Test(dataProvider = "invalidLoginCredentials")
    public void restorePasswordInvalidCredentials(String email, String password) {
    driver.get(getBaseUrl());
    loginPage = new LoginPage(driver);

    loginPage.click(LoginPage.forgotPasswordLink);
    loginPage.waitForPasswordDiv();
    loginPage.typeEmailRestore(email);
    loginPage.click(LoginPage.resetPasswordButton);

    WebElement divElement = loginPage.waitForDivStart();
    String divText = divElement.getText();
    
    // Verificamos si el mensaje de restablecimiento de contraseña es el esperado
    Assert.assertTrue(divText.contains("Este correo electrónico no está asociado con ningún usuario aquí."),
            "El mensaje de restablecimiento de contraseña esperado no coincide");
}
    } 