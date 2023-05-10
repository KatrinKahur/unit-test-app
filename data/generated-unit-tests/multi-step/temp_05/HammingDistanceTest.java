
import org.junit.Test;
import static org.junit.Assert.*;

public class HammingDistanceTest {

    @Test
    public void testCalculateHammingDistance() throws Exception {
        // test case 1: equal strings
        String s1 = "abcde";
        String s2 = "abcde";
        int expected1 = 0;
        int actual1 = HammingDistance.calculateHammingDistance(s1, s2);
        assertEquals(expected1, actual1);

        // test case 2: strings with one difference
        String s3 = "abcde";
        String s4 = "abfde";
        int expected2 = 1;
        int actual2 = HammingDistance.calculateHammingDistance(s3, s4);
        assertEquals(expected2, actual2);

        // test case 3: strings with multiple differences
        String s5 = "abcde";
        String s6 = "fghij";
        int expected3 = 5;
        int actual3 = HammingDistance.calculateHammingDistance(s5, s6);
        assertEquals(expected3, actual3);

        // test case 4: empty strings
        String s7 = "";
        String s8 = "";
        int expected4 = 0;
        int actual4 = HammingDistance.calculateHammingDistance(s7, s8);
        assertEquals(expected4, actual4);

        // test case 5: strings of different lengths
        String s9 = "abcde";
        String s10 = "abcd";
        try {
            HammingDistance.calculateHammingDistance(s9, s10);
            fail("Expected an Exception to be thrown");
        } catch (Exception e) {
            assertEquals("String lengths must be equal", e.getMessage());
        }

        // test case 6: special characters
        String s11 = "a!bc$";
        String s12 = "a@bc^";
        int expected6 = 3;
        int actual6 = HammingDistance.calculateHammingDistance(s11, s12);
        assertEquals(expected6, actual6);
    }
}