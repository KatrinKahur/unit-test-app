
package test;

import org.junit.Assert;
import org.junit.Test;
import others.SieveOfEratosthenes;

public class SieveOfEratosthenesTest {

    @Test
    public void testWithInvalidInput() {
        Assert.assertArrayEquals(new int[0], SieveOfEratosthenes.findPrimesTill(1));
    }

    @Test(expected = RuntimeException.class)
    public void testNegativeInput() {
        SieveOfEratosthenes.findPrimesTill(-10);
    }

    @Test
    public void testOne() {
        Assert.assertArrayEquals(new int[0], SieveOfEratosthenes.findPrimesTill(1));
    }

    @Test
    public void testTwo() {
        Assert.assertArrayEquals(new int[]{2}, SieveOfEratosthenes.findPrimesTill(2));
    }

    @Test
    public void testOneThousandAndOne() {
        int[] expectedPrimes =
            new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 
                        61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 
                        137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 
                        211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 
                        293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 
                        389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 
                        479 
            };

        Assert.assertArrayEquals(expectedPrimes, SieveOfEratosthenes.findPrimesTill(1001));
    }
}