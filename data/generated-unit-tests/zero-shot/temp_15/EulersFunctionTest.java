
package others;

import org.junit.Test;

import static org.junit.Assert.*;

public class EulersFunctionTest {

    @Test
    public void testGetEuler() throws Exception {
 
        assertEquals(1, EulersFunction.getEuler(1));
        assertEquals(8, EulersFunction.getEuler(20));
        assertEquals(40, EulersFunction.getEuler(75));
        assertEquals(168, EulersFunction.getEuler(200));
      
    }
}