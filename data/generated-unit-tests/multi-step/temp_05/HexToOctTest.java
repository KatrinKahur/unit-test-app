
import org.junit.Test;
import static org.junit.Assert.*;

public class HexToOctTest {
    
    @Test
    public void testHex2decimal() {
        // Test valid hexadecimal numbers
        assertEquals(10, HexToOct.hex2decimal("A"));
        assertEquals(255, HexToOct.hex2decimal("FF"));
        assertEquals(4095, HexToOct.hex2decimal("FFF"));
        assertEquals(65535, HexToOct.hex2decimal("FFFF"));
        
        // Test invalid hexadecimal numbers
        assertEquals(0, HexToOct.hex2decimal(""));
        assertEquals(0, HexToOct.hex2decimal(null));
        assertEquals(0, HexToOct.hex2decimal("G"));
        assertEquals(0, HexToOct.hex2decimal("123G"));
    }
    
    @Test
    public void testDecimal2octal() {
        // Test valid decimal numbers
        assertEquals(12, HexToOct.decimal2octal(10));
        assertEquals(777, HexToOct.decimal2octal(511));
        assertEquals(10000, HexToOct.decimal2octal(4096));
        
        // Test invalid decimal numbers
        assertEquals(0, HexToOct.decimal2octal(0));
        assertEquals(175770, HexToOct.decimal2octal(-1000));
        // This test will fail because the input is too large to be represented as an int
        assertEquals(0, HexToOct.decimal2octal(Integer.MAX_VALUE + 1));
    }
}