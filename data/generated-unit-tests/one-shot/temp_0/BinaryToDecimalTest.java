
public class BinaryToDecimalTest {
    @Test
    public void testBinaryToDecimal() {
        long binNum = 101010;
        long expected = 42;
        long actual = BinaryToDecimal.binaryToDecimal(binNum);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBinaryToDecimalWithZero() {
        long binNum = 0;
        long expected = 0;
        long actual = BinaryToDecimal.binaryToDecimal(binNum);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBinaryToDecimalWithOne() {
        long binNum = 1;
        long expected = 1;
        long actual = BinaryToDecimal.binaryToDecimal(binNum);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBinaryToDecimalWithLargeNumber() {
        long binNum = 1111111111111111111L;
        long expected = 262143;
        long actual = BinaryToDecimal.binaryToDecimal(binNum);
        Assert.assertEquals(expected, actual);
    }
}