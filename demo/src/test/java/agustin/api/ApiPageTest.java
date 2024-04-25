package agustin.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        String apiKey = "Ykuuml1MJyzptuPQ3s6aTP2LOBNO8tur";
        String apiToken = "H0KO1710181426";
        String route = "226";
        String from = "directv-2agus";
        String to = "5491140843674";
        String text = "Mensaje+desde+API+Selenium+putito";

        // Llama al método sendMessage del ApiPage
        Response response = apiPage.sendMessage(apiKey, apiToken, route, from, to, text);

        // Verifica el código de estado de la respuesta
        assertEquals(200, response.getStatusCode(), "El código de estado no es el esperado");

    }
}
