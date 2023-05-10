
public class AlphabeticalTest {
    @Test
    public void testIsAlphabetical() {
        Assert.assertTrue(Alphabetical.isAlphabetical("abc"));
        Assert.assertTrue(Alphabetical.isAlphabetical("abcdefghijklmnopqrstuvwxyz"));
        Assert.assertFalse(Alphabetical.isAlphabetical("cba"));
        Assert.assertFalse(Alphabetical.isAlphabetical("abc123"));
        Assert.assertFalse(Alphabetical.isAlphabetical("Abc"));
    }
}