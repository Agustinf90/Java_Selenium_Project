package agustin.utils;
import io.github.cdimascio.dotenv.Dotenv;

public class TestHelper {
    private static final Dotenv dotenv = Dotenv.configure().load();
    
    public static final String BASE_URL = getConfigValue("BASE_URL");
    public static final String VALID_EMAIL = getConfigValue("VALID_EMAIL");
    public static final String VALID_EMAIL_RESTORE_PASS = getConfigValue("VALID_EMAIL_RESTORE_PASS");
    public static final String VALID_PASSWORD = getConfigValue("VALID_PASSWORD");
    public static final String INVALID_EMAIL = getConfigValue("INVALID_EMAIL");
    public static final String INVALID_PASSWORD = getConfigValue("INVALID_PASSWORD");
    public static final String API_KEY = getConfigValue("API_KEY");
    public static final String API_TOKEN = getConfigValue("API_TOKEN");
    public static final String ROUTE = getConfigValue("ROUTE");
    public static final String FROM = getConfigValue("FROM");
    public static final String TO = getConfigValue("TO");

    private static String getConfigValue(String key) {
        // First, try to get the value from environment variables
        String value = System.getenv(key);
        if (value != null) {
            return value;
        }
        
        // If not found, try to get the value from .env file
        return dotenv.get(key);
    }

    public static String getBaseUrl() {
        return BASE_URL;
    }

    public static String getValidEmail() {
        return VALID_EMAIL;
    }

        public static String getValidEmailToRestore() {
        return VALID_EMAIL_RESTORE_PASS;
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
