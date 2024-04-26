package agustin.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import agustin.utils.TestHelper;
// import agustin.api.ApiPage;
import io.restassured.response.Response;

public class ApiPageTest {

    private ApiPage apiPage;

    @BeforeEach
    public void setUp() {

        String baseUrl = "https://sagitario90.ionikcorp.com/";
        apiPage = new ApiPage(baseUrl);
    }

    @Test
    public void testSendMessage() {
        // Obteniendo los valores del dotenv utilizando TestHelper
        String apiKey = TestHelper.getApiKey();
        String apiToken = TestHelper.getApiToken();
        String route = TestHelper.getRoute();
        String from = TestHelper.getFrom();
        String to = TestHelper.getTo();
        String text = "Mensaje+desde+API+Selenium";

        // Llama al método sendMessage del ApiPage
        Response response = apiPage.sendMessage(apiKey, apiToken, route, from, to, text);

        // Verifica el código de estado de la respuesta
        assertEquals(200, response.getStatusCode(), "El código de estado no es el esperado");

    }
}
