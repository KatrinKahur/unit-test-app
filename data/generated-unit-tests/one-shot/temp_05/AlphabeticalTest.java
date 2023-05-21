
public class AlphabeticalTest {
    @Test
    public void testIsAlphabetical() {
        assertTrue(Alphabetical.isAlphabetical("abcd"));
        assertTrue(Alphabetical.isAlphabetical("abCdeF"));
        assertFalse(Alphabetical.isAlphabetical("abdc"));
        assertFalse(Alphabetical.isAlphabetical("abc1"));
        assertFalse(Alphabetical.isAlphabetical("abCdeFgHiJkLmNoPqRsTuVwXyZ"));
    }
    
    @Test
    public void testIsAlphabeticalWithEmptyString() {
        assertTrue(Alphabetical.isAlphabetical(""));
    }
    
    @Test
    public void testIsAlphabeticalWithOneCharacter() {
        assertTrue(Alphabetical.isAlphabetical("a"));
    }
    
    @Test
    public void testIsAlphabeticalWithNonLetterCharacters() {
        assertFalse(Alphabetical.isAlphabetical("ab,cd"));
        assertFalse(Alphabetical.isAlphabetical("ab!cd"));
        assertFalse(Alphabetical.isAlphabetical("ab@cd"));
        assertFalse(Alphabetical.isAlphabetical("ab#cd"));
    }
}