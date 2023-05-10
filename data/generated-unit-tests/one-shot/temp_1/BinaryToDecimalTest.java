
public class BinaryToDecimalTest {

    @Test
    public void testBinaryToDecimal() {
        long result = BinaryToDecimal.binaryToDecimal(101010);
        Assert.assertEquals(42, result);
    }

    @Test
    public void testBinaryToDecimalWithZero() {
        long result = BinaryToDecimal.binaryToDecimal(0);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testBinaryToDecimalWithOne() {
        long result = BinaryToDecimal.binaryToDecimal(1);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testBinaryToDecimalWithLargeNumber() {
        long result = BinaryToDecimal.binaryToDecimal(1101010111100001101);
        Assert.assertEquals(357445, result);
    }
}