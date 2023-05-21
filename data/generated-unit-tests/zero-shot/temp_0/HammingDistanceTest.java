
import org.junit.Test;
import static org.junit.Assert.*;

public class HammingDistanceTest {

    @Test
    public void testCalculateHammingDistance() throws Exception {
        // Test case 1: Equal strings
        String s1 = "abc";
        String s2 = "abc";
        int expected = 0;
        int actual = HammingDistance.calculateHammingDistance(s1, s2);
        assertEquals(expected, actual);

        // Test case 2: Different strings
        s1 = "abc";
        s2 = "def";
        expected = 3;
        actual = HammingDistance.calculateHammingDistance(s1, s2);
        assertEquals(expected, actual);

        // Test case 3: Strings with different lengths
        s1 = "abc";
        s2 = "abcd";
        try {
            HammingDistance.calculateHammingDistance(s1, s2);
            fail("Expected an Exception to be thrown");
        } catch (Exception e) {
            assertEquals("String lengths must be equal", e.getMessage());
        }
    }
}