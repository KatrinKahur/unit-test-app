
public class SieveOfEratosthenesTest {
    @Test
    public void testFindPrimesTill() {
        int[] expectedPrimes = {2, 3, 5, 7, 11, 13, 17, 19};
        Assert.assertArrayEquals(expectedPrimes, SieveOfEratosthenes.findPrimesTill(20));
    }

    @Test
    public void testFindPrimesTillWithZero() {
        int[] expectedPrimes = {};
        Assert.assertArrayEquals(expectedPrimes, SieveOfEratosthenes.findPrimesTill(0));
    }

    @Test
    public void testFindPrimesTillWithOne() {
        int[] expectedPrimes = {};
        Assert.assertArrayEquals(expectedPrimes, SieveOfEratosthenes.findPrimesTill(1));
    }

    @Test
    public void testFindPrimesTillLargeInput() {
        int[] expectedPrimes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        Assert.assertArrayEquals(expectedPrimes, SieveOfEratosthenes.findPrimesTill(100));
    }
}