
package strings;

import org.junit.Test;
import static org.junit.Assert.*;

public class AlphabeticalTest {

    @Test
    public void testIsAlphabetical() {
        assertTrue(Alphabetical.isAlphabetical("abcde"));
        assertTrue(Alphabetical.isAlphabetical("AbCde"));
        assertFalse(Alphabetical.isAlphabetical("abcda"));
        assertFalse(Alphabetical.isAlphabetical("baaa"));
        assertFalse(Alphabetical.isAlphabetical("1abc"));
        assertFalse(Alphabetical.isAlphabetical(""));
    }

    @Test
    public void testIsAlphabeticalWithOneCharacter() {
        assertTrue(Alphabetical.isAlphabetical("a"));
        assertTrue(Alphabetical.isAlphabetical("A"));
    }

    @Test
    public void testIsAlphabeticalWithNonLetter() {
        assertFalse(Alphabetical.isAlphabetical("ab*cde"));
        assertFalse(Alphabetical.isAlphabetical("!bcd"));
    }

    @Test
    public void testIsAlphabeticalWithRepeatedLetters() {
        assertFalse(Alphabetical.isAlphabetical("abcca"));
        assertFalse(Alphabetical.isAlphabetical("bbcd"));
    }
}