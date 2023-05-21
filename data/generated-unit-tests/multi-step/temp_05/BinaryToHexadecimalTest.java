
package conversions;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinaryToHexadecimalTest {

    @Test
    public void testBinToHex() {
        // Test case 1: Test conversion of binary number 1010 to hexadecimal
        String hex1 = BinaryToHexadecimal.binToHex(1010);
        assertEquals("A", hex1);

        // Test case 2: Test conversion of binary number 1111 to hexadecimal
        String hex2 = BinaryToHexadecimal.binToHex(1111);
        assertEquals("F", hex2);

        // Test case 3: Test conversion of binary number 10000000 to hexadecimal
        String hex3 = BinaryToHexadecimal.binToHex(10000000);
        assertEquals("80", hex3);

        // Test case 4: Test conversion of binary number 0 to hexadecimal
        String hex4 = BinaryToHexadecimal.binToHex(0);
        assertEquals("0", hex4);

        // Test case 5: Test conversion of invalid binary number to hexadecimal
        String hex5 = BinaryToHexadecimal.binToHex(102);
        assertEquals("", hex5);
    }

}