
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class BinaryToHexadecimalTest {

    @Test
    public void testBinToHex() {
        // Test for binary numbers 0-15
        assertEquals("0", BinaryToHexadecimal.binToHex(0));
        assertEquals("1", BinaryToHexadecimal.binToHex(1));
        assertEquals("2", BinaryToHexadecimal.binToHex(10));
        assertEquals("3", BinaryToHexadecimal.binToHex(11));
        assertEquals("4", BinaryToHexadecimal.binToHex(100));
        assertEquals("5", BinaryToHexadecimal.binToHex(101));
        assertEquals("6", BinaryToHexadecimal.binToHex(110));
        assertEquals("7", BinaryToHexadecimal.binToHex(111));
        assertEquals("8", BinaryToHexadecimal.binToHex(1000));
        assertEquals("9", BinaryToHexadecimal.binToHex(1001));
        assertEquals("A", BinaryToHexadecimal.binToHex(1010));
        assertEquals("B", BinaryToHexadecimal.binToHex(1011));
        assertEquals("C", BinaryToHexadecimal.binToHex(1100));
        assertEquals("D", BinaryToHexadecimal.binToHex(1101));
        assertEquals("E", BinaryToHexadecimal.binToHex(1110));
        assertEquals("F", BinaryToHexadecimal.binToHex(1111));

        // Test for binary numbers larger than 15
        assertEquals("1A", BinaryToHexadecimal.binToHex(11010));
        assertEquals("3F", BinaryToHexadecimal.binToHex(111111));
        assertEquals("5B", BinaryToHexadecimal.binToHex(1011011));
    }
}