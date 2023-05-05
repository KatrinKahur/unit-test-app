package conversions;
import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryToOctalTest {

    @Test
    public void testConvertBinaryToOctal() {
        // Test case 1
        String expected1 = "72";
        int input1 = 111010;
        String actual1 = BinaryToOctal.convertBinaryToOctal(input1);
        assertEquals(expected1, actual1);

        // Test case 2
        String expected2 = "5";
        int input2 = 101;
        String actual2 = BinaryToOctal.convertBinaryToOctal(input2);
        assertEquals(expected2, actual2);

        // Test case 3
        String expected3 = "0";
        int input3 = 0;
        String actual3 = BinaryToOctal.convertBinaryToOctal(input3);
        assertEquals(expected3, actual3);

        // Test case 4
        String expected4 = "777";
        int input4 = 111111111;
        String actual4 = BinaryToOctal.convertBinaryToOctal(input4);
        assertEquals(expected4, actual4);
    }

    @Test
    public void testConvertBinaryToOctalBoundary() {
        // Test case for the upper limit of binary range
        String expected = "17777777777";
        int input = Integer.MAX_VALUE;
        String actual = BinaryToOctal.convertBinaryToOctal(input);
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertBinaryToOctalException() {
        // Test case for the lower limit of binary range
        BinaryToOctal.convertBinaryToOctal(-2147483648);
    }
}