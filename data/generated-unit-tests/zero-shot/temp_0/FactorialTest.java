
package maths;

import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void testFactorialZero() {
        long result = Factorial.factorial(0);
        assertEquals(1, result);
    }

    @Test
    public void testFactorialPositive() {
        long result = Factorial.factorial(5);
        assertEquals(120, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        Factorial.factorial(-5);
    }

    @Test
    public void testFactorialMaxValue() {
        long result = Factorial.factorial(Integer.MAX_VALUE);
        assertTrue(result > 0);
    }

    @Test(timeout = 1000)
    public void testFactorialPerformance() {
        Factorial.factorial(10000);
    }
}