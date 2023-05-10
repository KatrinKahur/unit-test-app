
package maths;

import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void testFactorialZero() {
        long expected = 1;
        long actual = Factorial.factorial(0);
        assertEquals(expected, actual);
    }

    @Test
    public void testFactorialOne() {
        long expected = 1;
        long actual = Factorial.factorial(1);
        assertEquals(expected, actual);
    }

    @Test
    public void testFactorialPositive() {
        long expected = 120;
        long actual = Factorial.factorial(5);
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        Factorial.factorial(-1);
    }
}