
public class ReverseStringTest {

    @Test
    public void testReverse() {
        String str = "hello world";
        String reversed = ReverseString.reverse(str);
        Assert.assertEquals("dlrow olleh", reversed);
    }

    @Test
    public void testReverseEmptyString() {
        String str = "";
        String reversed = ReverseString.reverse(str);
        Assert.assertEquals("", reversed);
    }

    @Test
    public void testReverseNullString() {
        String str = null;
        String reversed = ReverseString.reverse(str);
        Assert.assertNull(reversed);
    }

    @Test
    public void testReverse2() {
        String str = "hello world";
        String reversed = ReverseString.reverse2(str);
        Assert.assertEquals("dlrow olleh", reversed);
    }

    @Test
    public void testReverse2EmptyString() {
        String str = "";
        String reversed = ReverseString.reverse2(str);
        Assert.assertEquals("", reversed);
    }

    @Test
    public void testReverse2NullString() {
        String str = null;
        String reversed = ReverseString.reverse2(str);
        Assert.assertNull(reversed);
    }
}