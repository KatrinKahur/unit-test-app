
public class SieveOfEratosthenesTest {
    @Test
    public void testFindPrimesTill() {
        int[] expected = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        int[] actual = SieveOfEratosthenes.findPrimesTill(30);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindPrimesTillWithNegativeNumber() {
        int[] expected = {};
        int[] actual = SieveOfEratosthenes.findPrimesTill(-10);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindPrimesTillWithOne() {
        int[] expected = {};
        int[] actual = SieveOfEratosthenes.findPrimesTill(1);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindPrimesTillWithTwo() {
        int[] expected = {2};
        int[] actual = SieveOfEratosthenes.findPrimesTill(2);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindPrimesTillWithLargeNumber() {
        int[] actual = SieveOfEratosthenes.findPrimesTill(1000000);
        Assert.assertTrue(actual.length > 0);
    }
}