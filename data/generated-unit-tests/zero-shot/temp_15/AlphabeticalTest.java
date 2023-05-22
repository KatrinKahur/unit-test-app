
@RunWith(JUnit4.class)
public class AlphabeticalTest {

    @Test
    public void testIsAlphabeticalWithBlankString() {
        Assert.assertTrue(Alphabetical.isAlphabetical(""));
    }

    @Test
    public void testIsAlphabeticalWithStringYes() {
        Assert.assertTrue(Alphabetical.isAlphabetical("yes"));
    }

    @Test
    public void testIsAlphabeticalWithStringabcab() {
        Assert.assertFalse(Alphabetical.isAlphabetical("abcab"));
    }

    @Test
    public void testIsAlphabeticalWithStringzoTIkjPYQrexporAtukoIKVIbHAGNcjyhLDvlFDaMUfsMnegwS() {
        Assert.assertTrue(
                Alphabetical.isAlphabetical("zoTIkjPYQrexporAtukoIKVIbHAGNcjyhLDvlFDaMUfsMnegwS"));
    }

    @Test
    public void testIsAlphabeticalWithCharactersAndNumberString() {
        Assert.assertFalse(Alphabetical.isAlphabetical("aAb2c"));
    }

    @Test
    public void testIsAlphabeticalWithStringCapital() {
        Assert.assertTrue(Alphabetical.isAlphabetical("GFMBADHSSI"));
    }
}