
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class SieveOfEratosthenesTest {

    @Test
    public void testFindPrimesTill() {
        int[] expectedPrimes = {2, 3, 5, 7, 11, 13, 17, 19};
        int[] actualPrimes = SieveOfEratosthenes.findPrimesTill(20);
        Arrays.sort(actualPrimes);
        assertArrayEquals(expectedPrimes, actualPrimes);
    }

    @Test
    public void testFindPrimesTillWithNegativeInput() {
        int[] expectedPrimes = {};
        int[] actualPrimes = SieveOfEratosthenes.findPrimesTill(-5);
        assertArrayEquals(expectedPrimes, actualPrimes);
    }

    @Test
    public void testFindPrimesTillWithInputLessThan2() {
        int[] expectedPrimes = {};
        int[] actualPrimes = SieveOfEratosthenes.findPrimesTill(1);
        assertArrayEquals(expectedPrimes, actualPrimes);
    }

    @Test
    public void testFindPrimesTillWithLargeInput() {
        int[] actualPrimes = SieveOfEratosthenes.findPrimesTill(1000);
        assertTrue(actualPrimes.length > 0);
    }
}