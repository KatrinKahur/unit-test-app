
import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryToHexadecimalTest {

    @Test
    public void testBinToHex() {
        // Test case 1: binary number 0 should return empty string
        assertEquals("", BinaryToHexadecimal.binToHex(0));
        
        // Test case 2: binary number 1010 should return "A"
        assertEquals("A", BinaryToHexadecimal.binToHex(1010));
        
        // Test case 3: binary number 11111111 should return "FF"
        assertEquals("FF", BinaryToHexadecimal.binToHex(11111111));
        
        // Test case 4: binary number 100000000 should return "100"
        assertEquals("100", BinaryToHexadecimal.binToHex(100000000));
        
        // Test case 5: binary number -1010 should return empty string
        assertEquals("", BinaryToHexadecimal.binToHex(-1010));
    }
}