
import org.junit.Test;
import static org.junit.Assert.*;

public class AlphabeticalTest {

    @Test
    public void testIsAlphabetical_ValidInput_ReturnsTrue() {
        assertTrue(Alphabetical.isAlphabetical("abcd"));
        assertTrue(Alphabetical.isAlphabetical("abcde"));
        assertTrue(Alphabetical.isAlphabetical("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void testIsAlphabetical_InvalidInput_ReturnsFalse() {
        assertFalse(Alphabetical.isAlphabetical("cba"));
        assertFalse(Alphabetical.isAlphabetical("bcda"));
        assertFalse(Alphabetical.isAlphabetical("!#$"));
    }

    @Test
    public void testIsAlphabetical_MixedCase_ReturnsTrue() {
        assertTrue(Alphabetical.isAlphabetical("AbCdEf"));
        assertTrue(Alphabetical.isAlphabetical("aBcDeFgHiJk"));
    }

    @Test
    public void testIsAlphabetical_EmptyString_ReturnsTrue() {
        assertTrue(Alphabetical.isAlphabetical(""));
    }

    @Test
    public void testIsAlphabetical_SingleCharacter_ReturnsTrue() {
        assertTrue(Alphabetical.isAlphabetical("a"));
        assertTrue(Alphabetical.isAlphabetical("z"));
        assertTrue(Alphabetical.isAlphabetical("A"));
        assertTrue(Alphabetical.isAlphabetical("Z"));
    }

    @Test
    public void testIsAlphabetical_StringWithNumbers_ReturnsFalse() {
        assertFalse(Alphabetical.isAlphabetical("ab1c2d"));
        assertFalse(Alphabetical.isAlphabetical("12345"));
    }

    @Test
    public void testIsAlphabetical_StringWithSpecialCharacters_ReturnsFalse() {
        assertFalse(Alphabetical.isAlphabetical("!@#$%^&*()"));
    }
}