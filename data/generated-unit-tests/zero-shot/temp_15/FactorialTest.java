
```
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class FactorialTest {

  	@Test
  	public void testFactorial() {
    		assertEquals(1, Factorial.factorial(0));
    		assertEquals(1, Factorial.factorial(1));
    		assertEquals(2, Factorial.factorial(2));
    		assertEquals(6, Factorial.factorial(3));
    		assertEquals(24, Factorial.factorial(4));
    		assertEquals(720, Factorial.factorial(6));
  	}

  	@Test
  	public void testNegativeInput() {
    		assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
    		assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-20));
  	}
}
```