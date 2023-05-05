package conversions;

import org.junit.Assert;
import org.junit.Test;

public class HexToOctTest {

    @Test
    public void testHex2Decimal() {
        Assert.assertEquals(15, HexToOct.hex2decimal("F"));
        Assert.assertEquals(256, HexToOct.hex2decimal("100"));
        Assert.assertEquals(175, HexToOct.hex2decimal("AF"));
        Assert.assertEquals(0, HexToOct.hex2decimal("0"));
    }

    @Test
    public void testDecimal2Octal() {
        Assert.assertEquals(17, HexToOct.decimal2octal(15));
        Assert.assertEquals(40, HexToOct.decimal2octal(32));
        Assert.assertEquals(25, HexToOct.decimal2octal(21));
        Assert.assertEquals(0, HexToOct.decimal2octal(0));
    }
}