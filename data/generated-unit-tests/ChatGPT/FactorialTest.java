package maths;  
import org.junit.Test; 
import static org.junit.Assert.*;  
public class FactorialTest {      
    @Test     
    public void testFactorialZero() {         
        assertEquals(1, Factorial.factorial(0));     
        
    }      
    @Test     
    public void testFactorialPositive() {         
        assertEquals(1, Factorial.factorial(1));         
        assertEquals(2, Factorial.factorial(2));         
        assertEquals(6, Factorial.factorial(3));         
        assertEquals(24, Factorial.factorial(4));         
        assertEquals(120, Factorial.factorial(5));     
        
    }      
    @Test(expected = IllegalArgumentException.class)     
    public void testFactorialNegative() {         
        Factorial.factorial(-1);     
        
    } 
    
}
