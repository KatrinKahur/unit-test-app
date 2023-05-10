
import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseStringTest {

    // test for reverse method with regular string input
    @Test
    public void testReverseRegular() {
        String original = "hello";
        String expected = "olleh";
        String actual = ReverseString.reverse(original);
        assertEquals(expected, actual);
    }

    // test for reverse method with empty string input
    @Test
    public void testReverseEmptyString() {
        String original = "";
        String expected = "";
        String actual = ReverseString.reverse(original);
        assertEquals(expected, actual);
    }

    // test for reverse method with null input
    @Test
    public void testReverseNull() {
        String original = null;
        String expected = null;
        String actual = ReverseString.reverse(original);
        assertEquals(expected, actual);
    }

    // test for reverse method with single character input
    @Test
    public void testReverseSingleChar() {
        String original = "a";
        String expected = "a";
        String actual = ReverseString.reverse(original);
        assertEquals(expected, actual);
    }

    // test for reverse2 method with regular string input
    @Test
    public void testReverse2Regular() {
        String original = "hello";
        String expected = "olleh";
        String actual = ReverseString.reverse2(original);
        assertEquals(expected, actual);
    }

    // test for reverse2 method with empty string input
    @Test
    public void testReverse2EmptyString() {
        String original = "";
        String expected = "";
        String actual = ReverseString.reverse2(original);
        assertEquals(expected, actual);
    }

    // test for reverse2 method with null input
    @Test
    public void testReverse2Null() {
        String original = null;
        String expected = null;
        String actual = ReverseString.reverse2(original);
        assertEquals(expected, actual);
    }

    // test for reverse2 method with single character input
    @Test
    public void testReverse2SingleChar() {
        String original = "a";
        String expected = "a";
        String actual = ReverseString.reverse2(original);
        assertEquals(expected, actual);
    }

    // test for reverse2 method with multi-character symbol in input
    @Test
    public void testReverse2UnicodeSurrogate() {
        String original = "a𝄞c";
        String expected = "c𝄞a";
        String actual = ReverseString.reverse2(original);
        assertEquals(expected, actual);
    }
}