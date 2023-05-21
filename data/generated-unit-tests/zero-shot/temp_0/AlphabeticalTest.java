
import org.junit.Test;
import static org.junit.Assert.*;

public class AlphabeticalTest {

    @Test
    public void testIsAlphabetical() {
        assertTrue(Alphabetical.isAlphabetical("abc"));
        assertTrue(Alphabetical.isAlphabetical("abcdefghijklmnopqrstuvwxyz"));
        assertFalse(Alphabetical.isAlphabetical("cba"));
        assertFalse(Alphabetical.isAlphabetical("abc123"));
        assertFalse(Alphabetical.isAlphabetical("Abc"));
        assertFalse(Alphabetical.isAlphabetical("abc!"));
    }

    @Test
    public void testIsAlphabeticalEmptyString() {
        assertTrue(Alphabetical.isAlphabetical(""));
    }

    @Test
    public void testIsAlphabeticalSingleChar() {
        assertTrue(Alphabetical.isAlphabetical("a"));
        assertTrue(Alphabetical.isAlphabetical("z"));
        assertFalse(Alphabetical.isAlphabetical("1"));
        assertFalse(Alphabetical.isAlphabetical("!"));
    }

    @Test
    public void testIsAlphabeticalMixedCase() {
        assertTrue(Alphabetical.isAlphabetical("abcDEF"));
        assertFalse(Alphabetical.isAlphabetical("abcDEFg"));
    }

    @Test
    public void testIsAlphabeticalRepeatedChars() {
        assertTrue(Alphabetical.isAlphabetical("aaa"));
        assertTrue(Alphabetical.isAlphabetical("zzz"));
        assertFalse(Alphabetical.isAlphabetical("aaab"));
        assertFalse(Alphabetical.isAlphabetical("zzzy"));
    }
}