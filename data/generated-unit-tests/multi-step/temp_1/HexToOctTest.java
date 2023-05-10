
package conversions;

import org.junit.Test;

import static org.junit.Assert.*;

public class HexToOctTest {

    @Test
    public void testHex2Decimal() {
        assertEquals(10, HexToOct.hex2decimal("A"));
        assertEquals(255, HexToOct.hex2decimal("FF"));
        assertEquals(1000, HexToOct.hex2decimal("3E8"));
        assertEquals(65535, HexToOct.hex2decimal("FFFF"));
    }

    @Test
    public void testDecimal2Octal() {
        assertEquals(12, HexToOct.decimal2octal(10));
        assertEquals(377, HexToOct.decimal2octal(255));
        assertEquals(1750, HexToOct.decimal2octal(1000));
        assertEquals(177777, HexToOct.decimal2octal(65535));
    }

    @Test
    public void testHexToOct() {
        assertEquals(12, HexToOct.hexToOct("A"));
        assertEquals(377, HexToOct.hexToOct("FF"));
        assertEquals(1750, HexToOct.hexToOct("3E8"));
        assertEquals(177777, HexToOct.hexToOct("FFFF"));
    }

    @Test(expected = NumberFormatException.class)
    public void testHexToOctInvalidInput() {
        HexToOct.hexToOct("GGG");
    }

    @Test
    public void testHexToOctLargeInput() {
        assertEquals(3157755, HexToOct.hexToOct("7FFFFF"));
    }
}