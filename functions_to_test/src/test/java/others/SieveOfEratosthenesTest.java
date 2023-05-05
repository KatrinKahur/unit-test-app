package others;
import org.junit.Test;
import static org.junit.Assert.*;

public class SieveOfEratosthenesTest {

    @Test
    public void testFindPrimesTill() {
        // Test for n=10
        int[] expectedPrimes = {2, 3, 5, 7};
        int[] actualPrimes = SieveOfEratosthenes.findPrimesTill(10);
        assertArrayEquals(expectedPrimes, actualPrimes);

        // Test for n=20
        expectedPrimes = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
        actualPrimes = SieveOfEratosthenes.findPrimesTill(20);
        assertArrayEquals(expectedPrimes, actualPrimes);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindPrimesTillWithInvalidInput() {
        SieveOfEratosthenes.findPrimesTill(1);
    }
}