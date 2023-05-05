package maths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AmicableNumberTest {

    @Test
    void testRecursiveCalcOfDividerSum() {
        assertEquals(10, AmicableNumber.recursiveCalcOfDividerSum(14, 7));
        assertEquals(220, AmicableNumber.recursiveCalcOfDividerSum(284, 142));
        assertEquals(284, AmicableNumber.recursiveCalcOfDividerSum(220, 110));
        assertEquals(284, AmicableNumber.recursiveCalcOfDividerSum(284, 142));
    }

    @Test
    void testIsAmicableNumber() {
        assertTrue(AmicableNumber.isAmicableNumber(220, 284));
        assertTrue(AmicableNumber.isAmicableNumber(284, 220));
        assertFalse(AmicableNumber.isAmicableNumber(1184, 1211));
        assertFalse(AmicableNumber.isAmicableNumber(220, 220));
    }

    // Testing the findAllInRange method is trickier, but we can at least test that it
    // doesn't throw any exceptions when called with valid arguments
    @Test
    void testFindAllInRange() {
        assertDoesNotThrow(() -> AmicableNumber.findAllInRange(1, 3000));
    }

}