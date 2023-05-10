
package strings;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseStringTest {

    @Test
    public void testReverse() {
        String input = "hello";
        String expectedOutput = "olleh";
        String actualOutput = ReverseString.reverse(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testReverse2() {
        String input = "hello";
        String expectedOutput = "olleh";
        String actualOutput = ReverseString.reverse2(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testReverseNull() {
        String input = null;
        String expectedOutput = null;
        String actualOutput = ReverseString.reverse2(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testReverseEmpty() {
        String input = "";
        String expectedOutput = "";
        String actualOutput = ReverseString.reverse2(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testReverse2Null() {
        String input = null;
        String expectedOutput = null;
        String actualOutput = ReverseString.reverse2(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testReverse2Empty() {
        String input = "";
        String expectedOutput = "";
        String actualOutput = ReverseString.reverse2(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testReverseLongString() {
        String input = "abcdefghijklmnopqrstuvwxyz".repeat(1000);
        String expectedOutput = new StringBuilder(input).reverse().toString();
        String actualOutput = ReverseString.reverse(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testReverse2LongString() {
        String input = "abcdefghijklmnopqrstuvwxyz".repeat(1000);
        String expectedOutput = new StringBuilder(input).reverse().toString();
        String actualOutput = ReverseString.reverse2(input);
        assertEquals(expectedOutput, actualOutput);
    }
}