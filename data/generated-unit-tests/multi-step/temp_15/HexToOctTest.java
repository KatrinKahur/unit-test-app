
package conversions;

import org.junit.Test;
import static org.junit.Assert.*;

public class HexToOctTest {
    
    @Test
    public void testHex2decimalValidInput() {
        String hex = "A1F0";
        int expectedDecimal = 41328;
        int actualDecimal = HexToOct.hex2decimal(hex);
        assertEquals(expectedDecimal, actualDecimal);
    }
    
    @Test
    public void testHex2decimalInvalidInput() {
        String hex = "xyz";
        try {
            HexToOct.hex2decimal(hex);
        } catch (NumberFormatException e) {
            assertTrue(true);
        } 
    }
    
    @Test
    public void testDecimal2octalValidInput() {
        int decimal = 8862;
        int expectedOctal = 21156;
        int actualOctal = HexToOct.decimal2octal(decimal);
        assertEquals(expectedOctal, actualOctal);
    }
    
    @Test
    public void testDecimal2octalNegativeInput() {
       int decimal = -2445;
       try {
            HexToOct.decimal2octal(decimal);
        } catch (ArithmeticException e){
            assertTrue(true);
        }
    }
    
    @Test
    public void testDecimal2octalLeadingZeroes() {
        int decimal = 8919;
        int expectedOctal = 21347;
        int actualOctal= HexToOct.decimal2octal(decimal);
        assertEquals(expectedOctal, actualOctal);
    }
}