package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void testFullBranchCoverage() {
        CountLetters cl = new CountLetters();

        // Cubre Branch #1: last == 'r' es true (en medio y al final)
        // "mar|" activa el if interno con 'r'. "ver" activa el if final con 'r'.
        Assertions.assertEquals(2, cl.count("mar|ver"));

        Assertions.assertEquals(1, cl.count("bus"));

        // Cubre Branch #3 y #4: last no es ni 'r' ni 's'
        // Caso 1: Carácter no letra pero el anterior no es r/s (ej: "a|")
        // Caso 2: El string termina en una letra que no es r/s (ej: "abc")
        Assertions.assertEquals(0, cl.count("abc|def"));
        
        // Caso extra: String vacío para cubrir la inicialización y el salto del bucle
        Assertions.assertEquals(0, cl.count(""));
    }

    @Test
    public void mixedCharacters() {
        // Combinación de r y s con diferentes separadores
        Assertions.assertEquals(3, new CountLetters().count("mar, sus y dar"));
    }
}