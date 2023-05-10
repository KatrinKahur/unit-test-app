
import org.junit.Test;
import static org.junit.Assert.*;

public class HexToOctTest {

    @Test
    public void testHex2decimal() {
        assertEquals(10, HexToOct.hex2decimal("A"));
        assertEquals(255, HexToOct.hex2decimal("FF"));
        assertEquals(4096, HexToOct.hex2decimal("1000"));
    }

    @Test
    public void testDecimal2octal() {
        assertEquals(12, HexToOct.decimal2octal(10));
        assertEquals(777, HexToOct.decimal2octal(511));
        assertEquals(10000, HexToOct.decimal2octal(4096));
    }
}