
package maths;

import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {
    
    // Test if factorial of 0 is 1
    @Test
    public void testFactorialOfZero() {
        assertEquals(1, Factorial.factorial(0));
    }
    
    // Test if factorial of a positive integer is calculated correctly
    @Test
    public void testFactorialOfPositiveInteger() {
        assertEquals(24, Factorial.factorial(4));
    }
    
    // Test if IllegalArgumentException is thrown for a negative number
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeNumber() {
        Factorial.factorial(-1);
    }
    
    // Test if factorial of a large positive number is calculated correctly
    @Test
    public void testFactorialOfLargeNumber() {
        assertEquals(39916800, Factorial.factorial(11));
    }
}