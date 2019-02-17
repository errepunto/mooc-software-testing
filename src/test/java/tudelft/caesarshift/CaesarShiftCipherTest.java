package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {
    private CaesarShiftCipher instance;

    @BeforeEach
    public void initialize() {
        this.instance = new CaesarShiftCipher();
    }

    @Test
    public void nullMessage() {
        final String result = instance.CaesarShiftCipher(null, 1);
        Assertions.assertEquals(null, result);
    }

    @Test
    public void emptyMessage() {
        final String result = instance.CaesarShiftCipher("", 5);
        Assertions.assertEquals("", result);
    }

    @ParameterizedTest
    @CsvSource({"abc,3,def", "abc,1,bcd", "abc,0,abc", "abc,-1,zab", "abc def,2,cde fgh", "abc def,26,abc def", "aBc,1,invalid"})
    public void testValues(final String msg, final int shift, final String expected) {
        final String result = instance.CaesarShiftCipher(msg, shift);

        Assertions.assertEquals(expected, result);
    }
}
