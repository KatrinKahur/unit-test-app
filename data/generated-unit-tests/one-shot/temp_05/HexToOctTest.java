
public class HexToOctTest {
@Test
public void testHex2decimal() {
Assert.assertEquals(15, HexToOct.hex2decimal("F"));
Assert.assertEquals(255, HexToOct.hex2decimal("FF"));
Assert.assertEquals(4095, HexToOct.hex2decimal("FFF"));
}

@Test
public void testDecimal2octal() {
Assert.assertEquals(17, HexToOct.decimal2octal(15));
Assert.assertEquals(377, HexToOct.decimal2octal(255));
Assert.assertEquals(7777, HexToOct.decimal2octal(4095));
}
}