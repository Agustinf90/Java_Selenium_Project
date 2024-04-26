package agustin;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import agustin.utils.TestHelper;

public class TestHelperTest {

    @Test
    public void testGetValidEmail() {
        // Arrange: Configura el entorno de prueba
        String expectedValidEmail = "directv@ioniksend.com";
        
        // Act: Llama al método que quieres probar
        String actualValidEmail = TestHelper.getValidEmail();
        
        // Assert: Verifica si el resultado es el esperado
        assertEquals(expectedValidEmail, actualValidEmail);
    }
}