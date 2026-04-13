package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {

    @Test
    public void shiftLettersByPositiveValue() {
        Assertions.assertEquals("def", new CaesarShiftCipher().CaesarShiftCipher("abc", 3));
    }

    @Test
    public void shiftWrapsAroundFromZToA() {
        Assertions.assertEquals("abc", new CaesarShiftCipher().CaesarShiftCipher("xyz", 3));
    }

    @Test
    public void preserveSpacesAndShiftLetters() {
        Assertions.assertEquals("ebiil tloia", new CaesarShiftCipher().CaesarShiftCipher("hello world", -3));
    }

    @Test
    public void invalidCharactersReturnInvalid() {
        Assertions.assertEquals("invalid", new CaesarShiftCipher().CaesarShiftCipher("hello!", 5));
    }
}
