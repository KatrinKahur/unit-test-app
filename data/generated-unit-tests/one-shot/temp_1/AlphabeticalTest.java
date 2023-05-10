
public class AlphabeticalTest {
    @Test
    public void testIsAlphabetical_OrderedString_ReturnsTrue() {
        boolean result = Alphabetical.isAlphabetical("abcde");
        Assert.assertTrue(result);
    }

    @Test
    public void testIsAlphabetical_UnorderedString_ReturnsFalse() {
        boolean result = Alphabetical.isAlphabetical("edcba");
        Assert.assertFalse(result);
    }

    @Test
    public void testIsAlphabetical_BlankString_ReturnsTrue() {
        boolean result = Alphabetical.isAlphabetical("");
        Assert.assertTrue(result);
    }

    @Test
    public void testIsAlphabetical_StringWithDigits_ReturnsFalse() {
        boolean result = Alphabetical.isAlphabetical("ab1cde");
        Assert.assertFalse(result);
    }

    @Test
    public void testIsAlphabetical_StringWithSpecialCharacters_ReturnsFalse() {
        boolean result = Alphabetical.isAlphabetical("ab#cde");
        Assert.assertFalse(result);
    }

    @Test
    public void testIsAlphabetical_StringWithSpaces_ReturnsTrue() {
        boolean result = Alphabetical.isAlphabetical("a b c d e");
        Assert.assertTrue(result);
    }
}