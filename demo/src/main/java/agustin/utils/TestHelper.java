package agustin.utils;

public class TestHelper {
    // URL base
    public static final String BASE_URL = "https://sagitario90.ionikcorp.com/";

    // Credenciales de inicio de sesión
    public static final String VALID_EMAIL = "directv@ioniksend.com";
    public static final String VALID_PASSWORD = "Hola2023";
    public static final String INVALID_EMAIL = "directv@ioniksend.com1";
    public static final String INVALID_PASSWORD = "Hola2023";

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
}
