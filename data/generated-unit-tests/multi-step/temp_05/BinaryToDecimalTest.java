
import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryToDecimalTest {

    @Test
    public void testBinaryToDecimal_0() {
        assertEquals(0, BinaryToDecimal.binaryToDecimal(0));
    }

    @Test
    public void testBinaryToDecimal_1() {
        assertEquals(1, BinaryToDecimal.binaryToDecimal(1));
    }

    @Test
    public void testBinaryToDecimal_10() {
        assertEquals(2, BinaryToDecimal.binaryToDecimal(10));
    }

    @Test
    public void testBinaryToDecimal_11() {
        assertEquals(3, BinaryToDecimal.binaryToDecimal(11));
    }

    @Test
    public void testBinaryToDecimal_1010() {
        assertEquals(10, BinaryToDecimal.binaryToDecimal(1010));
    }

    @Test
    public void testBinaryToDecimal_1111() {
        assertEquals(15, BinaryToDecimal.binaryToDecimal(1111));
    }

    @Test(expected = NumberFormatException.class)
    public void testBinaryToDecimal_NonBinaryInput() {
        BinaryToDecimal.binaryToDecimal(1234);
    }

    @Test(expected = NumberFormatException.class)
    public void testBinaryToDecimal_NegativeInput() {
        BinaryToDecimal.binaryToDecimal(-1010);
    }

    @Test(expected = NumberFormatException.class)
    public void testBinaryToDecimal_DecimalInput() {
        BinaryToDecimal.binaryToDecimal(10.1);
    }

}