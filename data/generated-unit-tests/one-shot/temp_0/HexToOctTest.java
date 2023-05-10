
public class HexToOctTest {
    @Test
    public void testHex2Decimal() {
        Assert.assertEquals(10, HexToOct.hex2decimal("A"));
        Assert.assertEquals(255, HexToOct.hex2decimal("FF"));
        Assert.assertEquals(4096, HexToOct.hex2decimal("1000"));
    }

    @Test
    public void testDecimal2Octal() {
        Assert.assertEquals(12, HexToOct.decimal2octal(10));
        Assert.assertEquals(777, HexToOct.decimal2octal(511));
        Assert.assertEquals(10000, HexToOct.decimal2octal(4096));
    }
}