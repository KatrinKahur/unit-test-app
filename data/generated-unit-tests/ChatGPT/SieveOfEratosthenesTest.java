import org.junit.Test; 
import static org.junit.Assert.assertArrayEquals;  
public class SieveOfEratosthenesTest {      
    @Test     
    public void testFindPrimesTill() {         
        // Test finding primes till 10         
        int[] expectedPrimes = {2, 3, 5, 7};         
        int[] actualPrimes = SieveOfEratosthenes.findPrimesTill(10);         
        assertArrayEquals(expectedPrimes, actualPrimes);          
        // Test finding primes till 20         
        expectedPrimes = new int[]{2, 3, 5, 7, 11, 13, 17, 19};         
        actualPrimes = SieveOfEratosthenes.findPrimesTill(20);         
        assertArrayEquals(expectedPrimes, actualPrimes);          
        // Test finding primes till 50         
        expectedPrimes = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47}
        actualPrimes = SieveOfEratosthenes.findPrimesTill(50);         
        assertArrayEquals(expectedPrimes, actualPrimes);     
        
    } 
    
}
