
public class AlphabeticalTest {
    @Test
    public void testAlphabeticalString() {
        assertTrue(Alphabetical.isAlphabetical("abcde"));
    }

    @Test
    public void testNonAlphabeticalString() {
        assertFalse(Alphabetical.isAlphabetical("xbzut"));
    }

    @Test
    public void testOneLetterString() {
        assertTrue(Alphabetical.isAlphabetical("s"));
    }

    @Test
    public void testEmptyString() {
        assertTrue(Alphabetical.isAlphabetical(""));
    }

    @Test
    public void testSpacesInString() {
        assertTrue(Alphabetical.isAlphabetical("abc def"));
        assertFalse(Alphabetical.isAlphabetical("nurS eat"));
        assertTrue(Alphabetical.isAlphabetical("aaduikkodxwn!!yptpxgf1*l\"?!/_lm.vbklzc ' 'oi@d`"));
    }

}