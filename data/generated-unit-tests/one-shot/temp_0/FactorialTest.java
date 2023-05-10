
public class FactorialTest {
    @Test
    public void testFactorialWithPositiveNumber() {
        long result = Factorial.factorial(5);
        Assert.assertEquals(120, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialWithNegativeNumber() {
        Factorial.factorial(-5);
    }

    @Test
    public void testFactorialWithZero() {
        long result = Factorial.factorial(0);
        Assert.assertEquals(1, result);
    }
}