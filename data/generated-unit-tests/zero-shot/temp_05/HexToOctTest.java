
import org.junit.Test;
import static org.junit.Assert.*;

public class HexToOctTest {

    @Test
    public void testHex2Decimal() {
        assertEquals(10, HexToOct.hex2decimal("A"));
        assertEquals(255, HexToOct.hex2decimal("FF"));
        assertEquals(4095, HexToOct.hex2decimal("FFF"));
    }

    @Test
    public void testDecimal2Octal() {
        assertEquals(12, HexToOct.decimal2octal(10));
        assertEquals(777, HexToOct.decimal2octal(511));
        assertEquals(1000, HexToOct.decimal2octal(512));
    }

    @Test
    public void testHexToOct() {
        assertEquals(12, HexToOct.hexToOct("A"));
        assertEquals(777, HexToOct.hexToOct("1FF"));
        assertEquals(1000, HexToOct.hexToOct("200"));
    }
}