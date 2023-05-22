
public class ReverseStringTest {

    @Test
    public void testReverseWithNonNullInput() {
        String actual = ReverseString.reverse("hello");
        Assert.assertEquals("olleh", actual);
    }

    @Test
    public void testReverseWithEmptyInput() {
        String actual = ReverseString.reverse("");
        Assert.assertEquals("", actual);
    }

    @Test
    public void testReverse2WithNonNullInput() {
        String actual = ReverseString.reverse2("hello");
        Assert.assertEquals("olleh", actual);
    }

    @Test
    public void testReverse2WithEmptyInput() {
        String actual = ReverseString.reverse2("");
        Assert.assertEquals("", actual);
    }

    @Test
    public void testReverseWithSpecialCharacter() {
        String actual = ReverseString.reverse("@unit testing");
        Assert.assertEquals("gnitset tinu@", actual);
    }

    @Test
    public void testReverse2WithSpecialCharacter() {
        String actual = ReverseString.reverse2("#automation testing");
        Assert.assertEquals("gnitset noitamotua#", actual);
    }
}