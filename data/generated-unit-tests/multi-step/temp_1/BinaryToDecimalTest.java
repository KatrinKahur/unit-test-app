
package conversions;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryToDecimalTest {

    @Test
    public void testBinaryToDecimal() {
        assertEquals(0, BinaryToDecimal.binaryToDecimal(0));
        assertEquals(1, BinaryToDecimal.binaryToDecimal(1));
        assertEquals(2, BinaryToDecimal.binaryToDecimal(10));
        assertEquals(3, BinaryToDecimal.binaryToDecimal(11));
        assertEquals(4, BinaryToDecimal.binaryToDecimal(100));
        assertEquals(5, BinaryToDecimal.binaryToDecimal(101));
        assertEquals(6, BinaryToDecimal.binaryToDecimal(110));
        assertEquals(7, BinaryToDecimal.binaryToDecimal(111));
        assertEquals(127, BinaryToDecimal.binaryToDecimal(1111111));
        assertEquals(1023, BinaryToDecimal.binaryToDecimal(1111111111));
        assertEquals(4294967295L, BinaryToDecimal.binaryToDecimal(11111111111111111111111111111111L));
    }

    @Test
    public void testBinaryToDecimalNonBinary() {
        try {
            BinaryToDecimal.binaryToDecimal(12345);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // pass
        }
    }

    @Test
    public void testBinaryToDecimalNegative() {
        try {
            BinaryToDecimal.binaryToDecimal(-101);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // pass
        }
    }

    @Test(timeout = 100)
    public void testBinaryToDecimalPerformance() {
        BinaryToDecimal.binaryToDecimal(10010111010110L); // larger binary number for performance testing
    }
}