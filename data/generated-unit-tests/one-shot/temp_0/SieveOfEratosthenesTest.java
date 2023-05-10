
public class SieveOfEratosthenesTest {
    @Test
    public void testFindPrimesTill() {
        int[] expected = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        int[] actual = SieveOfEratosthenes.findPrimesTill(30);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindPrimesTillWithNegativeInput() {
        int[] expected = {};
        int[] actual = SieveOfEratosthenes.findPrimesTill(-10);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindPrimesTillWithZeroInput() {
        int[] expected = {};
        int[] actual = SieveOfEratosthenes.findPrimesTill(0);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindPrimesTillWithOneInput() {
        int[] expected = {};
        int[] actual = SieveOfEratosthenes.findPrimesTill(1);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindPrimesTillWithLargeInput() {
        int[] expected = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int[] actual = SieveOfEratosthenes.findPrimesTill(100);
        Assert.assertArrayEquals(expected, actual);
    }
}