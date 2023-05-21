
package strings;

import org.junit.Test;
import static org.junit.Assert.*;

public class AlphabeticalTest {

    @Test
    public void testIsAlphabetical() {
        // Test empty string
        assertFalse(Alphabetical.isAlphabetical(""));

        // Test single character string
        assertTrue(Alphabetical.isAlphabetical("a"));

        // Test string with non-letter characters
        assertFalse(Alphabetical.isAlphabetical("abc1"));

        // Test string with upper case letters
        assertTrue(Alphabetical.isAlphabetical("Abc"));

        // Test string in alphabetical order
        assertTrue(Alphabetical.isAlphabetical("abcdefg"));

        // Test string not in alphabetical order
        assertFalse(Alphabetical.isAlphabetical("dcba"));

        // Test string with repeated characters
        assertTrue(Alphabetical.isAlphabetical("aabbcc"));

        // Test string with spaces
        assertTrue(Alphabetical.isAlphabetical("a b c d e f g"));

        // Test string with special characters
        assertFalse(Alphabetical.isAlphabetical("a!b@c#"));
    }
}