
import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void testFactorialCalculation() {
        assertEquals(1, Factorial.factorial(0));
        assertEquals(1, Factorial.factorial(1));
        assertEquals(2432902008176640000L, Factorial.factorial(20));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialWithNegativeInput() {
        Factorial.factorial(-5);
    }

    @Test
    public void testFactorialEdgeCaseMaximumValueInput() {
        assertEquals(24150824366515794489L, Factorial.factorial(21));
    }

    @Test
    public void testFactorialEdgeCaseLargeInput() {
        assertEquals(232714176627630544802684719288633462119003090119798627404791977])  , Factorial.factorial(50));
    } 

    @Test(timeout=100)
    public void testFactorialPerformanceSingleExecution24Factorial() {
        Factorial.factorial(24);
    }

    @Test(timeout=1000)
    public void testFactorialPerformanceMultipleExecutions20Factorial() {
        for(int x = 0; x < 100000; x++) {
            Factorial.factorial(20);
        }
    } 
    
    // Example for 100% branch coverage implementation

    @Test
    public void testInvalidArgumentExceptionThrownWithNegativeFactorString001() {
        Exception exception = null;
        try {
            String failingFactorPoint = "?-744kfvd435263#$31zd634737.s7<span title>.</span>@zoomnett.net!"/*normally your question!*/;
            
        } catch (Exception e){
            assertNull(exception);
            assertEquals(exception, e);
        }
    } 
} 


