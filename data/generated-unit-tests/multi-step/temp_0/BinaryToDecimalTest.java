
import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryToDecimalTest {

    @Test
    public void testBinaryToDecimal() {
        // Test case 1: binary number is 0
        long binNum1 = 0;
        long expected1 = 0;
        long actual1 = BinaryToDecimal.binaryToDecimal(binNum1);
        assertEquals(expected1, actual1);

        // Test case 2: binary number is positive
        long binNum2 = 101010;
        long expected2 = 42;
        long actual2 = BinaryToDecimal.binaryToDecimal(binNum2);
        assertEquals(expected2, actual2);

        // Test case 3: binary number is negative
        long binNum3 = -1101;
        long expected3 = 13;
        long actual3 = BinaryToDecimal.binaryToDecimal(binNum3);
        assertEquals(expected3, actual3);

        // Test case 4: binary number is too large for long integer
        long binNum4 = 1111111111111111111111111111111111111111111111111111111111111111L;
        long expected4 = -1; // expected result is undefined
        long actual4 = BinaryToDecimal.binaryToDecimal(binNum4);
        assertEquals(expected4, actual4);
    }
}