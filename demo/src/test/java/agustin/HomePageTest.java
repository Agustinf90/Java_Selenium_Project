// package agustin;

// import org.openqa.selenium.WebElement;
// import org.testng.annotations.Test;

// import agustin.LoginPage;

// import org.testng.Assert;

// public class HomePageTest extends BaseTest {

//     private static String homeUrl = "https://sagitario90.ionikcorp.com/";

//     @Test
//     public void testHomePageNavigation() {
//         driver.get(homeUrl);

//         // Crear una instancia de LoginPage
//         LoginPage loginPage = new LoginPage(driver);
        
//         // Utilizar el locator definido en la clase LoginPage
//         WebElement loginElement = driver.findElement(loginPage.loginIonik);
        
//         // Verificar que el elemento fue encontrado
//         Assert.assertNotNull(loginElement, "No se encontró ningún elemento de inicio de sesión.");
//     }
// }
// // package agustin.test;
// // import java.time.Duration;

// // import org.openqa.selenium.By;
// // import org.openqa.selenium.WebElement;
// // import org.openqa.selenium.support.ui.ExpectedConditions;
// // import org.openqa.selenium.support.ui.WebDriverWait;
// // import org.testng.annotations.DataProvider;
// // import org.testng.annotations.Test;

// // // import agustin.test.HomePage;
// // // import agustin.test.LoginPage;

// // public class LoginTest extends BaseTest {

// //     private static String homeUrl = "https://sagitario90.ionikcorp.com/";

// //     private LoginPage loginPage;
// //     @DataProvider(name = "loginCredentials")
// //     public Object[][] getLoginCredentials() {
// //         return new Object[][] {
// //             // Datos para credenciales incorrectas
// //             {"directv@ioniksend.com1", "Hola2023", false},
// //             // Datos para credenciales correctas
// //             {"directv@ioniksend.com", "Hola2023", true}
// //         };
// //     }

// //     @Test(dataProvider = "loginCredentials")
// //     public void testLoginPage(String email, String password, boolean expectSuccess) {
// //         homePage = new HomePage(driver);
// //         loginPage = new LoginPage(driver);
// //         driver.get(homeUrl);

// //         loginPage.typeEmail(email);
// //         loginPage.typePassword(password);
// //         loginPage.clickLogin();

// //         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
// //         WebElement divElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='toast-container']")));
// //         String divText = divElement.getText();
// //         System.out.println(divText);
// //         String pageTitle = driver.getTitle();
// //         System.out.println("Page title: " + pageTitle);

// //         if(expectSuccess) {
// //             // Espera a que el usuario se haya autenticado correctamente
// //         WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
// //         WebElement divElement1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='page-title']")));
// //         // Get the text content of the <div> element
// //         String divText1 = divElement1.getText();

// //         // Print the text content
// //         System.out.println(divText1);
// //         String pageTitle1 = driver.getTitle();
// //         System.out.println("Page title: " + pageTitle1);
// //         } else {
// //             // Verifica que se muestre el mensaje de error adecuado
// //             WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
// //         WebElement divElement2 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='toast-container']")));
// //         // Get the text content of the <div> element
// //         String divText2 = divElement2.getText();

// //         // Print the text content
// //         System.out.println(divText2);
// //         String pageTitle2 = driver.getTitle();
// //         System.out.println("Page title: " + pageTitle2);
// //         }
// //     }
// // }
