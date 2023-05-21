
package strings;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseStringTest {

    // Test reverse method with a non-empty string
    @Test
    public void testReverse() {
        String input = "hello";
        String expectedOutput = "olleh";
        assertEquals(expectedOutput, ReverseString.reverse(input));
    }

    // Test reverse method with an empty string
    @Test
    public void testReverseWithEmptyString() {
        String input = "";
        String expectedOutput = "";
        assertEquals(expectedOutput, ReverseString.reverse(input));
    }

    // Test reverse method with a null string
    @Test
    public void testReverseWithNullString() {
        String input = null;
        assertNull(ReverseString.reverse(input));
    }

    // Test reverse2 method with a non-empty string
    @Test
    public void testReverse2() {
        String input = "hello";
        String expectedOutput = "olleh";
        assertEquals(expectedOutput, ReverseString.reverse2(input));
    }

    // Test reverse2 method with an empty string
    @Test
    public void testReverse2WithEmptyString() {
        String input = "";
        String expectedOutput = "";
        assertEquals(expectedOutput, ReverseString.reverse2(input));
    }

    // Test reverse2 method with a null string
    @Test
    public void testReverse2WithNullString() {
        String input = null;
        assertNull(ReverseString.reverse2(input));
    }

    // Test reverse2 method with a one-character string
    @Test
    public void testReverse2WithOneCharacterString() {
        String input = "a";
        String expectedOutput = "a";
        assertEquals(expectedOutput, ReverseString.reverse2(input));
    }

    // Test reverse2 method with a string containing special characters
    @Test
    public void testReverse2WithSpecialCharactersString() {
        String input = "h@llo!";
        String expectedOutput = "!oll@h";
        assertEquals(expectedOutput, ReverseString.reverse2(input));
    }

    // Test reverse2 method with a string containing non-ASCII characters
    @Test
    public void testReverse2WithNonASCIICharactersString() {
        String input = "héllo";
        String expectedOutput = "olléh";
        assertEquals(expectedOutput, ReverseString.reverse2(input));
    }
}