package strings;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValidParenthesesTest {

    @Test
    public void testValidString() {
        assertTrue(ValidParentheses.isValid("()"));
        assertTrue(ValidParentheses.isValid("()[]{}"));
        assertTrue(ValidParentheses.isValid("{[()]}"));
    }

    @Test
    public void testInvalidString() {
        assertFalse(ValidParentheses.isValid("(]"));
        assertFalse(ValidParentheses.isValid("([)]"));
        assertFalse(ValidParentheses.isValid("{{{{}}}]"));
        assertFalse(ValidParentheses.isValid("([)]"));
    }

    @Test
    public void testEmptyString() {
        assertTrue(ValidParentheses.isValid(""));
    }

    @Test
    public void testSingleCharacterString() {
        assertFalse(ValidParentheses.isValid("("));
        assertFalse(ValidParentheses.isValid(")"));
        assertFalse(ValidParentheses.isValid("["));
        assertFalse(ValidParentheses.isValid("]"));
        assertFalse(ValidParentheses.isValid("{"));
        assertFalse(ValidParentheses.isValid("}"));
    }

    @Test
    public void testMixedValidString() {
        assertTrue(ValidParentheses.isValid("a(b[c{d}e]f)g"));
        assertTrue(ValidParentheses.isValid("a{b[c(d)e]f}g"));
        assertTrue(ValidParentheses.isValid("a[b{c(d)]e}f]g"));
    }

    @Test
    public void testMixedInvalidString() {
        assertFalse(ValidParentheses.isValid("a(b[c{d)]e}f)g"));
        assertFalse(ValidParentheses.isValid("a{b[c)d}e]f(g"));
        assertFalse(ValidParentheses.isValid("a[b{c(d)e}f}g"));
    }

}