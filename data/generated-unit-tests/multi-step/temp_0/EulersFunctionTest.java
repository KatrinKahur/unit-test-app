
package others;

import org.junit.Test;
import static org.junit.Assert.*;

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
    }
}