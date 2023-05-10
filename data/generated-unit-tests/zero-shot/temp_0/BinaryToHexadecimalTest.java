
import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryToHexadecimalTest {

    @Test
    public void testBinToHex() {
        // Test case 1: binary number 0 should return hexadecimal number 0
        assertEquals("0", BinaryToHexadecimal.binToHex(0));

        // Test case 2: binary number 1010 should return hexadecimal number A
        assertEquals("A", BinaryToHexadecimal.binToHex(1010));

        // Test case 3: binary number 11111111 should return hexadecimal number FF
        assertEquals("FF", BinaryToHexadecimal.binToHex(11111111));

        // Test case 4: binary number 10000000 should return hexadecimal number 80
        assertEquals("80", BinaryToHexadecimal.binToHex(10000000));

        // Test case 5: binary number 11011010 should return hexadecimal number DA
        assertEquals("DA", BinaryToHexadecimal.binToHex(11011010));
    }
}