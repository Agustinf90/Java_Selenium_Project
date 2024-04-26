package agustin.utils;

import io.github.cdimascio.dotenv.Dotenv;

public class TestHelper {
    // Variables de entorno
    private static final Dotenv dotenv = Dotenv.configure().load();
    public static final String BASE_URL = dotenv.get("BASE_URL");
    public static final String VALID_EMAIL = dotenv.get("VALID_EMAIL");
    public static final String VALID_PASSWORD = dotenv.get("VALID_PASSWORD");
    public static final String INVALID_EMAIL = dotenv.get("INVALID_EMAIL");
    public static final String INVALID_PASSWORD = dotenv.get("INVALID_PASSWORD");
    public static final String API_KEY = dotenv.get("API_KEY");
    public static final String API_TOKEN = dotenv.get("API_TOKEN");
    public static final String ROUTE = dotenv.get("ROUTE");
    public static final String FROM = dotenv.get("FROM");
    public static final String TO = dotenv.get("TO");

    // Métodos para obtener URL y credenciales
    public static String getBaseUrl() {
        return BASE_URL;
    }

    public static String getValidEmail() {
        return VALID_EMAIL;
    }

    public static String getValidPassword() {
        return VALID_PASSWORD;
    }

    public static String getInvalidEmail() {
        return INVALID_EMAIL;
    }

    public static String getInvalidPassword() {
        return INVALID_PASSWORD;
    }

    // Métodos para obtener valores del dotenv
    public static String getApiKey() {
        return API_KEY;
    }

    public static String getApiToken() {
        return API_TOKEN;
    }

    public static String getRoute() {
        return ROUTE;
    }

    public static String getFrom() {
        return FROM;
    }

    public static String getTo() {
        return TO;
    }
}
