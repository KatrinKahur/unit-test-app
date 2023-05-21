
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HexToOctTest {

    @Test
    public void testHex2decimal() {
        assertEquals(15, HexToOct.hex2decimal("F"));
        assertEquals(255, HexToOct.hex2decimal("FF"));
        assertEquals(16, HexToOct.hex2decimal("10"));
        assertEquals(4096, HexToOct.hex2decimal("1000"));
    }

    @Test
    public void testDecimal2octal() {
        assertEquals(7, HexToOct.decimal2octal(7));
        assertEquals(16, HexToOct.decimal2octal(14));
        assertEquals(6006, HexToOct.decimal2octal(2046));
        assertEquals(1520, HexToOct.decimal2octal(800));
    }
}