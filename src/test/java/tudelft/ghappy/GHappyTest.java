package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    @ParameterizedTest
    @CsvSource({"xxggxx,true", "xxgxx,false", "xxggyygxx,false", "g,false", "gg,true"})
    public void testHappinest(final String input, final boolean expected) {
        GHappy gh = new GHappy();
        final boolean result = gh.gHappy(input);
        Assertions.assertEquals(expected, result);
    }
}
