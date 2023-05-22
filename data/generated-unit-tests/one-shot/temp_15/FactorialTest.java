
public class FactorialTest {
    @Test
    public void testFactorialWhenNDoNotAllowNegative() {
        Assert.assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
    }

    @Test
    public void testFactorialWhenNIsZero() {
        Assert.assertEquals(1, Factorial.factorial(0));
    }

    @Test
    public void testFactorialWhenNIsGreaterThanZero() {
        Assert.assertEquals(6, Factorial.factorial(3));
        Assert.assertEquals(479001600, Factorial.factorial(12));
    }
}