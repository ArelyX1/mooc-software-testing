package tudelft.sandbox;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RomanToDecimalTest {
    private final RomanToDecimal converter = new RomanToDecimal();

    @ParameterizedTest
    @CsvSource({
        "X, 10"
    })
    void testCasosComplejos(String roman, int expected) {
        assertEquals(expected, converter.convert(roman));
    }
    /*
    @Test
    void testExcepcionesTecnicas() {
        // Test de valores prohibidos (Reglas de repetición y sustracción)
        assertThrows(IllegalArgumentException.class, () -> converter.convert("IIII")); // Máximo 3
        assertThrows(IllegalArgumentException.class, () -> converter.convert("VV"));   // Prohibido repetir V
        assertThrows(IllegalArgumentException.class, () -> converter.convert("IC"));   // Sustracción inválida
        assertThrows(IllegalArgumentException.class, () -> converter.convert("ABC"));  // Caracteres no romanos
    }    
    */
}
