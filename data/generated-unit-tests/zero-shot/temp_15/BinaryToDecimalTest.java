
package conversions;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BinaryToDecimalTest {
    private final long binary;
    private final long decimal;

    public BinaryToDecimalTest(final long binary, final long decimal) {
        this.binary = binary;
        this.decimal = decimal;
    }

    @Parameterized.Parameters(name = "Unit test {index}")
    public static Object[][] data() {
        return new Object[][] {
            {0, 0},
            {1, 1},
            {101, 5},
            {1000000, 64}
        };
    }

    @Test
    public void verifyBinaryToDecimal() {
        assertEquals(decimal, BinaryToDecimal.binaryToDecimal(binary));
    }
}