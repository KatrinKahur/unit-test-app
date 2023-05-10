
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EulersFunctionTest {

    @Test
    public void testGetEuler() {
        // Test case for n = 1
        assertEquals(1, EulersFunction.getEuler(1));
        
        // Test case for n = 2
        assertEquals(1, EulersFunction.getEuler(2));
        
        // Test case for n = 3
        assertEquals(2, EulersFunction.getEuler(3));
        
        // Test case for n = 4
        assertEquals(2, EulersFunction.getEuler(4));
        
        // Test case for n = 5
        assertEquals(4, EulersFunction.getEuler(5));
        
        // Test case for n = 6
        assertEquals(2, EulersFunction.getEuler(6));
        
        // Test case for n = 7
        assertEquals(6, EulersFunction.getEuler(7));
        
        // Test case for n = 8
        assertEquals(4, EulersFunction.getEuler(8));
        
        // Test case for n = 9
        assertEquals(6, EulersFunction.getEuler(9));
        
        // Test case for n = 10
        assertEquals(4, EulersFunction.getEuler(10));
        
        // Test case for n = 11
        assertEquals(10, EulersFunction.getEuler(11));
        
        // Test case for n = 12
        assertEquals(4, EulersFunction.getEuler(12));
        
        // Test case for n = 13
        assertEquals(12, EulersFunction.getEuler(13));
        
        // Test case for n = 14
        assertEquals(6, EulersFunction.getEuler(14));
        
        // Test case for n = 15
        assertEquals(8, EulersFunction.getEuler(15));
        
        // Test case for n = 16
        assertEquals(8, EulersFunction.getEuler(16));
        
        // Test case for n = 17
        assertEquals(16, EulersFunction.getEuler(17));
        
        // Test case for n = 18
        assertEquals(6, EulersFunction.getEuler(18));
        
        // Test case for n = 19
        assertEquals(18, EulersFunction.getEuler(19));
        
        // Test case for n = 20
        assertEquals(8, EulersFunction.getEuler(20));
        
        // Test case for n = 21
        assertEquals(12, EulersFunction.getEuler(21));
        
        // Test case for n = 22
        assertEquals(10, EulersFunction.getEuler(22));
        
        // Test case for n = 23
        assertEquals(22, EulersFunction.getEuler(23));
        
        // Test case for n = 24
        assertEquals(8, EulersFunction.getEuler(24));
        
        // Test case for n = 25
        assertEquals(20, EulersFunction.getEuler(25));
        
        // Test case for n = 26
        assertEquals(12, EulersFunction.getEuler(26));
        
        // Test case for n = 27
        assertEquals(18, EulersFunction.getEuler(27));
        
        // Test case for n = 28
        assertEquals(12, EulersFunction.getEuler(28));
        
        // Test case for n = 29
        assertEquals(28, EulersFunction.getEuler(29));
        
        // Test case for n = 30
        assertEquals(8, EulersFunction.getEuler(30));
    }

}