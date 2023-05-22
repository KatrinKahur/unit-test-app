
package strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    @Test
    public void testReverse_withNullInput_returnEmptyString() {
        String str = null;
        assertEquals("", ReverseString.reverse(str));
    }

    @Test
    public void testReverse_withEmptyInput_returnEmptyString() {
        String str = "";
        assertEquals("", ReverseString.reverse(str));
    }

    @Test
    public void testReverse_reverseInput_returnReversedString() {
        String str = "hello world";
        String reversed = "dlrow olleh";
        assertEquals(reversed, ReverseString.reverse(str));
    }

    @Test
    public void testReverse2_withNullInput_returnEmptyString() {
        String str = null;
        assertEquals("", ReverseString.reverse2(str));
    }

    @Test
    public void testReverse2_withEmptyInput_returnEmptyString() {
        String str = "";
        assertEquals("", ReverseString.reverse2(str));
    }

    @Test
    public void testReverse2_reverseInput_returnReversedString() {
        String str = "hello world";
        String reversed = "dlrow olleh";
        assertEquals(reversed, ReverseString.reverse2(str));
    }

}