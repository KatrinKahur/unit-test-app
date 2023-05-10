
import org.junit.Test;
import static org.junit.Assert.*;

public class EulersFunctionTest {

    @Test
    public void testGetEuler() {
        assertEquals(1, EulersFunction.getEuler(1));
        assertEquals(1, EulersFunction.getEuler(2));
        assertEquals(2, EulersFunction.getEuler(3));
        assertEquals(2, EulersFunction.getEuler(4));
        assertEquals(4, EulersFunction.getEuler(10));
        assertEquals(6, EulersFunction.getEuler(12));
        assertEquals(12, EulersFunction.getEuler(24));
        assertEquals(24, EulersFunction.getEuler(30));
        assertEquals(40, EulersFunction.getEuler(50));
        assertEquals(72, EulersFunction.getEuler(100));
    }
}