
import org.junit.Test;
import static org.junit.Assert.*;

public class AlphabeticalTest {
    
    @Test
    public void testIsAlphabetical_emptyString() {
        assertTrue(Alphabetical.isAlphabetical(""));
    }
    
    @Test
    public void testIsAlphabetical_singleCharacter() {
        assertTrue(Alphabetical.isAlphabetical("a"));
    }
    
    @Test
    public void testIsAlphabetical_lowercase() {
        assertTrue(Alphabetical.isAlphabetical("abcde"));
        assertFalse(Alphabetical.isAlphabetical("edcba"));
        assertFalse(Alphabetical.isAlphabetical("abcdee"));
        assertFalse(Alphabetical.isAlphabetical("a1b2c3"));
    }
    
    @Test
    public void testIsAlphabetical_uppercase() {
        assertTrue(Alphabetical.isAlphabetical("ABCDE"));
        assertFalse(Alphabetical.isAlphabetical("EDCBA"));
        assertFalse(Alphabetical.isAlphabetical("ABCDEE"));
        assertFalse(Alphabetical.isAlphabetical("A1B2C3"));
    }
    
    @Test
    public void testIsAlphabetical_mixedCase() {
        assertTrue(Alphabetical.isAlphabetical("AbCdE"));
        assertFalse(Alphabetical.isAlphabetical("EdCbA"));
        assertFalse(Alphabetical.isAlphabetical("AbCdEE"));
        assertFalse(Alphabetical.isAlphabetical("A1b2C3"));
    }
    
    @Test
    public void testIsAlphabetical_nonLetter() {
        assertFalse(Alphabetical.isAlphabetical("abcde!"));
        assertFalse(Alphabetical.isAlphabetical("a1b2c3"));
    }
}