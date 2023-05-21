
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
    public void testFactorialOne() {
        long result = Factorial.factorial(1);
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

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialVeryNegative() {
        Factorial.factorial(-100000);
    }

    @Test
    public void testFactorialLargeNumber() {
        long result = Factorial.factorial(20);
        assertEquals(2432902008176640000L, result);
    }
}