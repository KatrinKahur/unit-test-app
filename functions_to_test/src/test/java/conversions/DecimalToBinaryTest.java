package conversions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DecimalToBinaryTest {

    @Test
    void conventionalConversionTest() {
        DecimalToBinary.conventionalConversion();
        // Manually verify that output is correct
    }

    @Test
    void bitwiseConversionTest() {
        DecimalToBinary.bitwiseConversion();
        // Manually verify that output is correct
    }

    /**@Test
    void conventionalConversionPositiveInputTest() {
        int input = 10;
        int expectedOutput = 1010;
        int actualOutput = DecimalToBinary.conventionalConversion(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void conventionalConversionNegativeInputTest() {
        int input = -10;
        // Test should throw exception
        assertThrows(IllegalArgumentException.class, () -> DecimalToBinary.conventionalConversion(input));
    }

    @Test
    void bitwiseConversionPositiveInputTest() {
        int input = 10;
        int expectedOutput = 1010;
        int actualOutput = DecimalToBinary.bitwiseConversion(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void bitwiseConversionNegativeInputTest() {
        int input = -10;
        // Test should throw exception
        assertThrows(IllegalArgumentException.class, () -> DecimalToBinary.bitwiseConversion(input));
    }**/

}