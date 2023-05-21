
package others;

import org.junit.Test;
import static org.junit.Assert.*;

public class SieveOfEratosthenesTest {

    @Test
    public void testFindPrimesTill() {
        // Test for n = 2
        int[] expected1 = {2};
        assertArrayEquals(expected1, SieveOfEratosthenes.findPrimesTill(2));

        // Test for n = 10
        int[] expected2 = {2, 3, 5, 7};
        assertArrayEquals(expected2, SieveOfEratosthenes.findPrimesTill(10));

        // Test for n = 20
        int[] expected3 = {2, 3, 5, 7, 11, 13, 17, 19};
        assertArrayEquals(expected3, SieveOfEratosthenes.findPrimesTill(20));

        // Test for n = 100
        int[] expected4 = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        assertArrayEquals(expected4, SieveOfEratosthenes.findPrimesTill(100));

        // Test for n = 1
        int[] expected5 = {};
        assertArrayEquals(expected5, SieveOfEratosthenes.findPrimesTill(1));
    }
}