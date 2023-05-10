import org.junit.Test; 
import static org.junit.Assert.assertEquals;  
public class EulersFunctionTest {      
    @Test     
    public void testGetEulerForZero() {         
        assertEquals(0, EulersFunction.getEuler(0));     
        
    }      
    @Test     
    public void testGetEulerForOne() {         
        assertEquals(1, EulersFunction.getEuler(1));     
        
    }      
    @Test     
    public void testGetEulerForPrimeNumber() {         
        assertEquals(6, EulersFunction.getEuler(7));     
        
    }      
    @Test     
    public void testGetEulerForCompositeNumber() {         
        assertEquals(24, EulersFunction.getEuler(30));     
        
    }      
    @Test     
    public void testGetEulerForNegativeNumber() {         
        assertEquals(0, EulersFunction.getEuler(-10));     
        
    }  
    
}
