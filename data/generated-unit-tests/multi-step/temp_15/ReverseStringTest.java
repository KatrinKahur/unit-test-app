
CODE:
```
package strings;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseStringTest {

    @Test
    public void reverse_handlesNull(){
        assertNull(ReverseString.reverse(null));
    }
    
    @Test
    public void reverse_handlesEmptyString() {
        assertEquals("", ReverseString.reverse(""));
    }
    
    @Test
    public void reverse_reversesString1() {
        String input = "test123";
        String expectedOutput = new StringBuilder("test123").reverse().toString();
        String actualOutput = ReverseString.reverse(input);
        assertEquals(expectedOutput, actualOutput)
    }
    
    @Test
    public void reverse_reversesString2() {
        String input = "abcd";
        String expectedOutput = new StringBuilder("abcd").reverse().toString();
        String actualOutput = ReverseString.reverse(input);
        assertEquals(expectedOutput, actualOutput)
    }
    
    @Test
    public void reverse2_handlesNull() {
        assertNull(ReverseString.reverse2(null));
    }
    
    @Test
    public void reverse2_handlesEmptyString() {
        assertEquals("", ReverseString.reverse2(""));
    }
    
    @Test
    public void reverse2_reversesString1() {
        String input = "test456";
        String expectedOutput = new StringBuilder("test456").reverse().toString();
        String actualOutput = ReverseString.reverse2(input);
        assertEquals(expectedOutput, actualOutput)
    }
    
    @Test
    public void reverse2_reversesString2() {
        String input = "efgh";
        String expectedOutput = new StringBuilder("efgh").reverse().toString();
        String actualIsValidOutpututput = ReverseString.reverse2(input);
        assertEquals(expectedOutput, actualOutput);
    }
}
```