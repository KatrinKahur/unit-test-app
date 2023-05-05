package maths;
import static org.junit.Assert.*;
import org.junit.Test;

public class ParseIntegerTest {

    @Test
    public void testPositiveNumber() {
        assertEquals(123, ParseInteger.parseInt("123"));
    }

    @Test
    public void testNegativeNumber() {
        assertEquals(-456, ParseInteger.parseInt("-456"));
    }

    @Test(expected = NumberFormatException.class)
    public void testEmptyString() {
        ParseInteger.parseInt("");
    }

    @Test(expected = NumberFormatException.class)
    public void testNullString() {
        ParseInteger.parseInt(null);
    }

    @Test(expected = NumberFormatException.class)
    public void testInvalidCharacter() {
        ParseInteger.parseInt("12a3");
    }

}
//         These tests cover all branches in the `parseInt` method, including null and empty strings, positive and
//        negative numbers, and strings with invalid characters.