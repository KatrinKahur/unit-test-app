
package others;

import org.junit.Test;
import static org.junit.Assert.*;

public class EulersFunctionTest {
    
    @Test
    public void testGetEulerPrime() {
        int result = EulersFunction.getEuler(7);
        assertEquals(6, result);
    }
    
    @Test
    public void testGetEulerComposite() {
        int result = EulersFunction.getEuler(15);
        assertEquals(8, result);
    }
    
    @Test
    public void testGetEulerOne() {
        int result = EulersFunction.getEuler(1);
        assertEquals(0, result);
    }
    
    @Test
    public void testGetEulerTwo() {
        int result = EulersFunction.getEuler(2);
        assertEquals(1, result);
    }
    
    @Test
    public void testGetEulerLarge() {
        int result = EulersFunction.getEuler(123456789);
        assertEquals(82276800, result);
    }
    
    @Test
    public void testGetEulerNegative() {
        int result = EulersFunction.getEuler(-10);
        assertEquals(-1, result);
    }
    
    @Test
    public void testGetEulerZero() {
        int result = EulersFunction.getEuler(0);
        assertEquals(0, result);
    }
    
}