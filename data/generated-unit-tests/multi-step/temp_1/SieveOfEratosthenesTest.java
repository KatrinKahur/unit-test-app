
package others;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SieveOfEratosthenesTest {

    @Test
    public void testFindPrimesTill() {
        // edge cases
        int[] expected = {};
        Assert.assertArrayEquals(expected, SieveOfEratosthenes.findPrimesTill(0));

        expected = new int[]{2};
        Assert.assertArrayEquals(expected, SieveOfEratosthenes.findPrimesTill(2));

        // regular cases
        expected = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
        Assert.assertArrayEquals(expected, SieveOfEratosthenes.findPrimesTill(50));

        expected = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        Assert.assertArrayEquals(expected, SieveOfEratosthenes.findPrimesTill(100));

        expected = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};
        Assert.assertArrayEquals(expected, SieveOfEratosthenes.findPrimesTill(200));
    }

    @Test
    public void testFindPrimesTillMaxInt() {
        // test for maximum integer value
        int max = Integer.MAX_VALUE;
        int[] primes = SieveOfEratosthenes.findPrimesTill(max);
        Assert.assertTrue(primes.length > 0);
        Assert.assertEquals(105097565, primes.length); // expected number of primes in the range 0 to max
        for (int prime : primes) {
            Assert.assertTrue(SieveOfEratosthenes.isPrime(prime));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindPrimesTillInvalidInput() {
        SieveOfEratosthenes.findPrimesTill(1);
    }

    @Test
    public void testIsPrime() {
        Assert.assertTrue(SieveOfEratosthenes.isPrime(2));
        Assert.assertTrue(SieveOfEratosthenes.isPrime(3));
        Assert.assertTrue(SieveOfEratosthenes.isPrime(5));
        Assert.assertTrue(SieveOfEratosthenes.isPrime(7));
        Assert.assertTrue(SieveOfEratosthenes.isPrime(11));
        Assert.assertTrue(SieveOfEratosthenes.isPrime(13));
        Assert.assertFalse(SieveOfEratosthenes.isPrime(4));
        Assert.assertFalse(SieveOfEratosthenes.isPrime(6));
        Assert.assertFalse(SieveOfEratosthenes.isPrime(8));
        Assert.assertFalse(SieveOfEratosthenes.isPrime(9));
        Assert.assertFalse(SieveOfEratosthenes.isPrime(10));
        Assert.assertFalse(SieveOfEratosthenes.isPrime(12));
    }
}