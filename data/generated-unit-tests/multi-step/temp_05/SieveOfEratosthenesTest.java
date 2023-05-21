
package others;

import org.junit.Test;
import static org.junit.Assert.*;

public class SieveOfEratosthenesTest {

    @Test
    public void testFindPrimesTill() {
        int[] expected = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        assertArrayEquals(expected, SieveOfEratosthenes.findPrimesTill(100));
    }

    @Test
    public void testFindPrimesTillEdgeCases() {
        int[] expected1 = {};
        assertArrayEquals(expected1, SieveOfEratosthenes.findPrimesTill(1));

        int[] expected2 = {2, 3, 5, 7};
        assertArrayEquals(expected2, SieveOfEratosthenes.findPrimesTill(8));
    }

    @Test
    public void testFindPrimesTillLargeNumber() {
        int[] primes = SieveOfEratosthenes.findPrimesTill(1000000);
        assertTrue(primes.length > 0);
        assertTrue(primes[primes.length - 1] == 999983);
    }
}