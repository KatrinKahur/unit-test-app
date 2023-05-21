
import org.junit.Test;
import static org.junit.Assert.*;

public class EulersFunctionTest {

    @Test
    public void testGetEulerPrimeNumber() {
        int result = EulersFunction.getEuler(17);
        assertEquals(16, result);
    }

    @Test
    public void testGetEulerSmallCompositeNumber() {
        int result = EulersFunction.getEuler(15);
        assertEquals(8, result);
    }

    @Test
    public void testGetEulerLargeCompositeNumber() {
        int result = EulersFunction.getEuler(12345);
        assertEquals(4032, result);
    }

    @Test
    public void testGetEulerOne() {
        int result = EulersFunction.getEuler(1);
        assertEquals(1, result);
    }

    @Test
    public void testGetEulerZero() {
        int result = EulersFunction.getEuler(0);
        assertEquals(0, result);
    }

    @Test
    public void testGetEulerNegative() {
        int result = EulersFunction.getEuler(-10);
        assertEquals(0, result);
    }

}