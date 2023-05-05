package strings;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class HammingDistanceTest {

    @Test
    public void testCalculateHammingDistanceWithEqualStrings() {
        try {
            assertEquals(0, HammingDistance.calculateHammingDistance("abc", "abc"));
            assertEquals(3, HammingDistance.calculateHammingDistance("abc", "def"));
            assertEquals(2, HammingDistance.calculateHammingDistance("abc", "adc"));
        } catch (Exception e) {
            fail("calculateHammingDistance threw an exception: " + e.getMessage());
        }
    }

    @Test
    public void testCalculateHammingDistanceWithUnequalStrings() {
        try {
            HammingDistance.calculateHammingDistance("abcd", "abc");
            fail("calculateHammingDistance did not throw an exception for unequal strings");
        } catch (Exception e) {
            assertEquals("String lengths must be equal", e.getMessage());
        }
    }
}