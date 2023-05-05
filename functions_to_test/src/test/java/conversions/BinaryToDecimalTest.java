package conversions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryToDecimalTest {
    @Test
    void testBinaryToDecimal0() {
        long result = BinaryToDecimal.binaryToDecimal(0);
        assertEquals(0, result);
    }

    @Test
    void testBinaryToDecimal1() {
        long result = BinaryToDecimal.binaryToDecimal(1);
        assertEquals(1, result);
    }

    @Test
    void testBinaryToDecimal10() {
        long result = BinaryToDecimal.binaryToDecimal(10);
        assertEquals(2, result);
    }

    @Test
    void testBinaryToDecimal101() {
        long result = BinaryToDecimal.binaryToDecimal(101);
        assertEquals(5, result);
    }

    @Test
    void testBinaryToDecimal1101() {
        long result = BinaryToDecimal.binaryToDecimal(1101);
        assertEquals(13, result);
    }

    @Test
    void testBinaryToDecimal11111111() {
        long result = BinaryToDecimal.binaryToDecimal(11111111);
        assertEquals(255, result);
    }

    @Test
    void testBinaryToDecimal100000000() {
        long result = BinaryToDecimal.binaryToDecimal(100000000);
        assertEquals(256, result);
    }
}