
public class BinaryToHexadecimalTest {
    @Test
    public void testBinToHex() {
        String result = BinaryToHexadecimal.binToHex(10101010);
        Assert.assertEquals("AA", result);
    }

    @Test
    public void testBinToHexWithZero() {
        String result = BinaryToHexadecimal.binToHex(0);
        Assert.assertEquals("0", result);
    }

    @Test
    public void testBinToHexWithMaxValue() {
        String result = BinaryToHexadecimal.binToHex(Integer.MAX_VALUE);
        Assert.assertEquals("7FFFFFFF", result);
    }

    @Test
    public void testBinToHexWithNegativeValue() {
        String result = BinaryToHexadecimal.binToHex(-10101010);
        Assert.assertEquals("FFFFFF56", result);
    }
}