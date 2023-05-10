
public class FactorialTest {
    @Test
    public void testFactorialOfZero() {
        long fact = Factorial.factorial(0);
        Assert.assertEquals(1, fact);
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        long fact = Factorial.factorial(5);
        Assert.assertEquals(120, fact);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber() {
        Factorial.factorial(-5);
    }
}