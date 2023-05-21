
import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryToDecimalTest {

    @Test
    public void testBinaryToDecimal() {
        long result = BinaryToDecimal.binaryToDecimal(1010);
        assertEquals(10, result);
    }

    @Test
    public void testBinaryToDecimalWithZero() {
        long result = BinaryToDecimal.binaryToDecimal(0);
        assertEquals(0, result);
    }

    @Test
    public void testBinaryToDecimalWithOne() {
        long result = BinaryToDecimal.binaryToDecimal(1);
        assertEquals(1, result);
    }

    @Test
    public void testBinaryToDecimalWithLargeNumber() {
        long result = BinaryToDecimal.binaryToDecimal(1111111111111111111L);
        assertEquals(1023, result);
    }

    @Test
    public void testBinaryToDecimalWithNegativeNumber() {
        long result = BinaryToDecimal.binaryToDecimal(-1010);
        assertEquals(-1, result);
    }
}