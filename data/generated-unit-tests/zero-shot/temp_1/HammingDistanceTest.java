
import org.junit.Test;
import static org.junit.Assert.*;

public class HammingDistanceTest {

    @Test
    public void testCalculateHammingDistanceSameString() throws Exception {
        String s1 = "hello";
        String s2 = "hello";
        int expected = 0;
        int actual = HammingDistance.calculateHammingDistance(s1, s2);
        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateHammingDistanceDifferentString() throws Exception {
        String s1 = "hello";
        String s2 = "world";
        int expected = 4;
        int actual = HammingDistance.calculateHammingDistance(s1, s2);
        assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void testCalculateHammingDistanceDifferentLengthStrings() throws Exception {
        String s1 = "hello";
        String s2 = "worlds";
        HammingDistance.calculateHammingDistance(s1, s2);
    }

}