
public class HexToOctTest {
    @Test
    public void testHex2Decimal() {
        int expected = 9328;
        int actual = HexToOct.hex2decimal("24E0");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDecimal2Octal() {
        int expected = 45560;
        int actual = HexToOct.decimal2octal(9328);
        Assert.assertEquals(expected, actual);
    }
}