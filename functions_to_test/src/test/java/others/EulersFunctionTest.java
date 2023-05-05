package others;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EulersFunctionTest {

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
    public void testGetEulerFive() {
        int result = EulersFunction.getEuler(5);
        assertEquals(4, result);
    }

    @Test
    public void testGetEulerSix() {
        int result = EulersFunction.getEuler(6);
        assertEquals(2, result);
    }

    @Test
    public void testGetEulerNine() {
        int result = EulersFunction.getEuler(9);
        assertEquals(6, result);
    }

    @Test
    public void testGetEulerTwelve() {
        int result = EulersFunction.getEuler(12);
        assertEquals(4, result);
    }

    @Test
    public void testGetEulerPrime() {
        int result = EulersFunction.getEuler(13);
        assertEquals(12, result);
    }

    @Test
    public void testGetEulerLarge() {
        int result = EulersFunction.getEuler(101);
        assertEquals(100, result);
    }
}