
package strings;

import org.junit.Test;
import static org.junit.Assert.*;

public class HammingDistanceTest {

    @Test
    public void testCalculateHammingDistance() throws Exception {
        // Test case 1: Equal strings
        String s1 = "abcd";
        String s2 = "abcd";
        int expected = 0;
        int actual = HammingDistance.calculateHammingDistance(s1, s2);
        assertEquals(expected, actual);

        // Test case 2: Different strings
        s1 = "abcd";
        s2 = "abce";
        expected = 1;
        actual = HammingDistance.calculateHammingDistance(s1, s2);
        assertEquals(expected, actual);

        // Test case 3: Empty strings
        s1 = "";
        s2 = "";
        expected = 0;
        actual = HammingDistance.calculateHammingDistance(s1, s2);
        assertEquals(expected, actual);

        // Test case 4: Null strings
        s1 = null;
        s2 = null;
        try {
            HammingDistance.calculateHammingDistance(s1, s2);
            fail("Expected an Exception to be thrown");
        } catch (Exception e) {
            assertEquals("String lengths must be equal", e.getMessage());
        }

        // Test case 5: Strings of different lengths
        s1 = "abcd";
        s2 = "abc";
        try {
            HammingDistance.calculateHammingDistance(s1, s2);
            fail("Expected an Exception to be thrown");
        } catch (Exception e) {
            assertEquals("String lengths must be equal", e.getMessage());
        }
    }
}