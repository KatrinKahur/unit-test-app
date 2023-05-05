package strings;
import org.junit.Test;
import static org.junit.Assert.*;

public class AlphabeticalTest {

    @Test
    public void testIsAlphabetical() {
        assertTrue(Alphabetical.isAlphabetical("abcde"));
        assertTrue(Alphabetical.isAlphabetical("aAbBcCdDeEfF"));
        assertFalse(Alphabetical.isAlphabetical("abcdeF"));
        assertFalse(Alphabetical.isAlphabetical("123"));
        assertFalse(Alphabetical.isAlphabetical("02"));
    }
}