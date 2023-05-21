
package maths;

import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void testFactorialPositive() {
        assertEquals(1, Factorial.factorial(0));
        assertEquals(1, Factorial.factorial(1));
        assertEquals(2, Factorial.factorial(2));
        assertEquals(6, Factorial.factorial(3));
        assertEquals(24, Factorial.factorial(4));
        assertEquals(120, Factorial.factorial(5));
        assertEquals(3628800, Factorial.factorial(10));
        assertEquals(2432902008176640000L, Factorial.factorial(20));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        Factorial.factorial(-1);
    }

    @Test(expected = ArithmeticException.class)
    public void testFactorialOverflow() {
        Factorial.factorial(21);
    }
}