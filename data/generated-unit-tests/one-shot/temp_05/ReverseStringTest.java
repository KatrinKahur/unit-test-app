
public class ReverseStringTest {
    @Test
    public void testReverse() {
        String str = "hello";
        String reversed = ReverseString.reverse(str);
        Assert.assertEquals("olleh", reversed);
    }

    @Test
    public void testReverse2() {
        String str = "world";
        String reversed = ReverseString.reverse2(str);
        Assert.assertEquals("dlrow", reversed);
    }

    @Test
    public void testReverseNull() {
        String str = null;
        String reversed = ReverseString.reverse(str);
        Assert.assertNull(reversed);
    }

    @Test
    public void testReverseEmpty() {
        String str = "";
        String reversed = ReverseString.reverse(str);
        Assert.assertEquals("", reversed);
    }

    @Test
    public void testReverse2Null() {
        String str = null;
        String reversed = ReverseString.reverse2(str);
        Assert.assertNull(reversed);
    }

    @Test
    public void testReverse2Empty() {
        String str = "";
        String reversed = ReverseString.reverse2(str);
        Assert.assertEquals("", reversed);
    }

    @Test
    public void testReverse2SingleChar() {
        String str = "a";
        String reversed = ReverseString.reverse2(str);
        Assert.assertEquals("a", reversed);
    }

    @Test
    public void testReverse2OddLength() {
        String str = "abcdefg";
        String reversed = ReverseString.reverse2(str);
        Assert.assertEquals("gfedcba", reversed);
    }

    @Test
    public void testReverse2EvenLength() {
        String str = "abcdefgh";
        String reversed = ReverseString.reverse2(str);
        Assert.assertEquals("hgfedcba", reversed);
    }
}