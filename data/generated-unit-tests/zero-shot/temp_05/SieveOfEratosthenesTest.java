
import org.junit.Test;
import static org.junit.Assert.*;

public class SieveOfEratosthenesTest {

    @Test
    public void testFindPrimesTill() {
        int[] expected = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        assertArrayEquals(expected, SieveOfEratosthenes.findPrimesTill(30));
    }

    @Test
    public void testFindPrimesTillWithSmallN() {
        int[] expected = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41};
        assertArrayEquals(expected, SieveOfEratosthenes.findPrimesTill(42));
    }

    @Test
    public void testFindPrimesTillWithNegativeN() {
        int[] expected = new int[0];
        assertArrayEquals(expected, SieveOfEratosthenes.findPrimesTill(-5));
    }

    @Test
    public void testFindPrimesTillWithNLessThan2() {
        int[] expected = new int[0];
        assertArrayEquals(expected, SieveOfEratosthenes.findPrimesTill(1));
    }

    @Test
    public void testFindPrimesTillWithLargeN() {
        int[] primes = SieveOfEratosthenes.findPrimesTill(100000);
        assertTrue(primes.length > 0);
        assertTrue(primes[primes.length - 1] < 100000);
    }
}