package strings;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class ReverseStringTest {
    @Test
    public void testReverse() {
        String input = "hello";
        String expectedOutput = "olleh";
        String actualOutput = ReverseString.reverse(input);
        assertEquals(expectedOutput, actualOutput);

        input = "a man a plan a canal panama";
        expectedOutput = "amanap lanac a nalp a nam a";
        actualOutput = ReverseString.reverse(input);
        assertEquals(expectedOutput, actualOutput);

        input = "";
        expectedOutput = "";
        actualOutput = ReverseString.reverse(input);
        assertEquals(expectedOutput, actualOutput);

        input = null;
        assertNull(ReverseString.reverse(input));
    }

    @Test
    public void testReverse2() {
        String input = "hello";
        String expectedOutput = "olleh";
        String actualOutput = ReverseString.reverse2(input);
        assertEquals(expectedOutput, actualOutput);

        input = "a man a plan a canal panama";
        expectedOutput = "amanap lanac a nalp a nam a";
        actualOutput = ReverseString.reverse2(input);
        assertEquals(expectedOutput, actualOutput);

        input = "";
        expectedOutput = "";
        actualOutput = ReverseString.reverse2(input);
        assertEquals(expectedOutput, actualOutput);

        input = null;
        assertNull(ReverseString.reverse2(input));
    }

}