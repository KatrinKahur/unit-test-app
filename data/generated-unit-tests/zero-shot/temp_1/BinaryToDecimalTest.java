
import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryToDecimalTest {

    @Test
    public void testBinaryToDecimalZero() {
        long decimal = BinaryToDecimal.binaryToDecimal(0);
        assertEquals(0, decimal);
    }

    @Test
    public void testBinaryToDecimalOne() {
        long decimal = BinaryToDecimal.binaryToDecimal(1);
        assertEquals(1, decimal);
    }

    @Test
    public void testBinaryToDecimalBinary() {
        long decimal = BinaryToDecimal.binaryToDecimal(101101);
        assertEquals(45, decimal);
    }

    @Test
    public void testBinaryToDecimalMaxLong() {
        long decimal = BinaryToDecimal.binaryToDecimal(Long.MAX_VALUE);
        assertEquals(9223372036854775807L, decimal);
    }

    @Test
    public void testBinaryToDecimalNegative() {
        long decimal = BinaryToDecimal.binaryToDecimal(-101101);
        assertEquals(-45, decimal);
    }

}