
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ReverseStringTest {

    @Test
    public void testReverse() {
        String reversed = ReverseString.reverse("hello");
        assertEquals("olleh", reversed);
    }

    @Test
    public void testReverse2() {
        String reversed = ReverseString.reverse2("world");
        assertEquals("dlrow", reversed);
    }

    @Test
    public void testReverse_NullInput() {
        String reversed = ReverseString.reverse(null);
        assertEquals(null, reversed);
    }

    @Test
    public void testReverse2_EmptyString() {
        String reversed = ReverseString.reverse2("");
        assertEquals("", reversed);
    }

    @Test
    public void testReverse2_OneCharacterString() {
        String reversed = ReverseString.reverse2("a");
        assertEquals("a", reversed);
    }

}