
import org.junit.Test;
import static org.junit.Assert.*;

public class EulersFunctionTest {

    @Test
    public void testGetEulerWithPrimeNumber() {
        assertEquals(4, EulersFunction.getEuler(7));
    }

    @Test
    public void testGetEulerWithCompositeNumber() {
        assertEquals(16, EulersFunction.getEuler(21));
    }

    @Test
    public void testGetEulerWithOne() {
        assertEquals(1, EulersFunction.getEuler(1));
    }

    @Test
    public void testGetEulerWithTwo() {
        assertEquals(1, EulersFunction.getEuler(2));
    }

    @Test
    public void testGetEulerWithLargeNumber() {
        assertEquals(32000000, EulersFunction.getEuler(100000000));
    }

}