package conversions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryToHexadecimalTest {

    @Test
    void testBinToHex_zero() {
        String actual = BinaryToHexadecimal.binToHex(0);
        assertEquals("0", actual);
    }

    @Test
    void testBinToHex_ones() {
        String actual = BinaryToHexadecimal.binToHex(1111);
        assertEquals("F", actual);
    }

    @Test
    void testBinToHex_alternating() {
        String actual = BinaryToHexadecimal.binToHex(10101010);
        assertEquals("AA", actual);
    }

    @Test
    void testBinToHex_random() {
        String actual = BinaryToHexadecimal.binToHex(110110);
        assertEquals("36", actual);
    }

    @Test
    void testBinToHex_max() {
        String actual = BinaryToHexadecimal.binToHex(Integer.MAX_VALUE);
        assertEquals("7FFFFFFF", actual);
    }

    @Test
    void testBinToHex_negative() {
        String actual = BinaryToHexadecimal.binToHex(-101010);
        assertEquals("FFFFFFFF", actual.toUpperCase());
    }
}