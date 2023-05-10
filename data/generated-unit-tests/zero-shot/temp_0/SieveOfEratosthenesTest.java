
import org.junit.Test;
import static org.junit.Assert.*;

public class SieveOfEratosthenesTest {

    @Test
    public void testFindPrimesTill() {
        int[] expected = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        assertArrayEquals(expected, SieveOfEratosthenes.findPrimesTill(30));
    }

    @Test
    public void testFindPrimesTillWithNegativeInput() {
        int[] expected = {};
        assertArrayEquals(expected, SieveOfEratosthenes.findPrimesTill(-10));
    }

    @Test
    public void testFindPrimesTillWithZeroInput() {
        int[] expected = {};
        assertArrayEquals(expected, SieveOfEratosthenes.findPrimesTill(0));
    }

    @Test
    public void testFindPrimesTillWithOneInput() {
        int[] expected = {};
        assertArrayEquals(expected, SieveOfEratosthenes.findPrimesTill(1));
    }

    @Test
    public void testFindPrimesTillWithLargeInput() {
        int[] expected = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        assertArrayEquals(expected, SieveOfEratosthenes.findPrimesTill(100));
    }
}