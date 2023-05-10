
import org.junit.Test;
import static org.junit.Assert.*;

public class HexToOctTest {

    @Test
    public void testHex2decimal() {
        assertEquals(10, HexToOct.hex2decimal("A"));
        assertEquals(255, HexToOct.hex2decimal("FF"));
        assertEquals(4095, HexToOct.hex2decimal("FFF"));
        assertEquals(0, HexToOct.hex2decimal("0"));
        assertEquals(16, HexToOct.hex2decimal("10"));
        assertEquals(65535, HexToOct.hex2decimal("FFFF"));
    }

    @Test
    public void testDecimal2octal() {
        assertEquals(12, HexToOct.decimal2octal(10));
        assertEquals(777, HexToOct.decimal2octal(511));
        assertEquals(0, HexToOct.decimal2octal(0));
        assertEquals(20, HexToOct.decimal2octal(16));
        assertEquals(177777, HexToOct.decimal2octal(65535));
    }

    @Test(expected = NumberFormatException.class)
    public void testHex2decimalInvalidInput() {
        HexToOct.hex2decimal("G");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDecimal2octalNegativeInput() {
        HexToOct.decimal2octal(-10);
    }
}