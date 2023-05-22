
import org.junit.Assert;
import org.junit.Test;

public class SieveOfEratosthenesTest {

    @Test
    public void testFindPrimesTill5() {
        int[] primes = SieveOfEratosthenes.findPrimesTill(5);
        Assert.assertArrayEquals(new int[]{2,3,5}, primes);
    }

    @Test
    public void testFindPrimesTill10() {
        int[] primes = SieveOfEratosthenes.findPrimesTill(10);
        Assert.assertArrayEquals(new int[]{2,3,5,7}, primes);
    }

    @Test
    public void testFindPrimesTill100() {
        int[] primes = SieveOfEratosthenes.findPrimesTill(100);
        Assert.assertEquals(25, primes.length);
    }

    @Test
    public void testFindPrimesTill2() {
        int[] primes = SieveOfEratosthenes.findPrimesTill(2);
        Assert.assertArrayEquals(new int[]{2}, primes);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindPrimesTillThrowsIllegalArgumentException() {
        SieveOfEratosthenes.findPrimesTill(0)
    }
}