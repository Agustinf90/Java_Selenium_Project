package agustin.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiPage {

    private String baseUrl;

    public ApiPage(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public Response get(String endpoint) {
        return RestAssured.get(baseUrl + endpoint);
    }
    
    public Response sendMessage(String apiKey, String apiToken, String route, String from, String to, String text) {
        String endpoint = String.format("ionikAPI?type=whatsapp&sendMessage&apikey=%s&apitoken=%s&route=%s&from=%s&to=%s&text=%s",
                apiKey, apiToken, route, from, to, text);
        return RestAssured.post(baseUrl + endpoint);
    }
}
