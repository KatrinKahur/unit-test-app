
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;

public class BinaryToHexadecimalTest {

    @Test
    public void testBinToHex() {
        // Test case 1: Binary number 0 should return hexadecimal number 0
        assertEquals("0", BinaryToHexadecimal.binToHex(0));

        // Test case 2: Binary number 1010 should return hexadecimal number A
        assertEquals("A", BinaryToHexadecimal.binToHex(1010));

        // Test case 3: Binary number 1111 should return hexadecimal number F
        assertEquals("F", BinaryToHexadecimal.binToHex(1111));

        // Test case 4: Binary number 1000001 should return hexadecimal number 41
        assertEquals("41", BinaryToHexadecimal.binToHex(1000001));

        // Test case 5: Binary number 11001110 should return hexadecimal number CE
        assertEquals("CE", BinaryToHexadecimal.binToHex(11001110));
    }

    @Test
    public void testBinToHexWithHashMap() {
        // Test case 1: Binary number 0 should return hexadecimal number 0
        assertEquals("0", BinaryToHexadecimal.binToHex(0));

        // Test case 2: Binary number 1010 should return hexadecimal number A
        assertEquals("A", BinaryToHexadecimal.binToHex(1010));

        // Test case 3: Binary number 1111 should return hexadecimal number F
        assertEquals("F", BinaryToHexadecimal.binToHex(1111));

        // Test case 4: Binary number 1000001 should return hexadecimal number 41
        assertEquals("41", BinaryToHexadecimal.binToHex(1000001));

        // Test case 5: Binary number 11001110 should return hexadecimal number CE
        assertEquals("CE", BinaryToHexadecimal.binToHex(11001110));

        // Test case 6: Binary number 1111 should return hexadecimal number F using hashmap
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(0, "0");
        hm.put(1, "1");
        hm.put(10, "A");
        hm.put(11, "B");
        hm.put(100, "4");
        hm.put(101, "5");
        hm.put(110, "6");
        hm.put(111, "7");
        hm.put(1000, "8");
        hm.put(1001, "9");
        hm.put(1010, "A");
        hm.put(1011, "B");
        hm.put(1100, "C");
        hm.put(1101, "D");
        hm.put(1110, "E");
        hm.put(1111, "F");
        assertEquals("F", BinaryToHexadecimal.binToHex(1111, hm));
    }
}