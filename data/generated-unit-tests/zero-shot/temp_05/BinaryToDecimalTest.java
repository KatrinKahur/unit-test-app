
import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryToDecimalTest {

    @Test
    public void testBinaryToDecimal() {
        long result = BinaryToDecimal.binaryToDecimal(101);
        assertEquals(5, result);
    }

    @Test
    public void testBinaryToDecimalWithZero() {
        long result = BinaryToDecimal.binaryToDecimal(0);
        assertEquals(0, result);
    }

    @Test
    public void testBinaryToDecimalWithLargeNumber() {
        long result = BinaryToDecimal.binaryToDecimal(1111111111111111L);
        assertEquals(65535, result);
    }

    @Test
    public void testBinaryToDecimalWithNegativeNumber() {
        long result = BinaryToDecimal.binaryToDecimal(-101);
        assertEquals(-5, result);
    }

    @Test
    public void testBinaryToDecimalWithInvalidInput() {
        long result = BinaryToDecimal.binaryToDecimal(12345);
        assertEquals(0, result);
    }
}