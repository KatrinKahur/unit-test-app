
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AmicableNumberTest {

    AmicableNumber amicableNumber;

    @Before
    public void setUp() {
        amicableNumber = new AmicableNumber();
    }

    // test recursiveCalcOfDividerSum function
    @Test
    public void testRecursiveCalcOfDividerSum() {
        assertEquals(0, amicableNumber.recursiveCalcOfDividerSum(0, 1));
        assertEquals(1, amicableNumber.recursiveCalcOfDividerSum(1, 1));
        assertEquals(3, amicableNumber.recursiveCalcOfDividerSum(2, 2));
        assertEquals(284, amicableNumber.recursiveCalcOfDividerSum(220, 220));
    }

    // test isAmicableNumber function
    @Test
    public void testIsAmicableNumber() {
        assertTrue(amicableNumber.isAmicableNumber(220, 284));
        assertFalse(amicableNumber.isAmicableNumber(1184, 1170));
    }

    // test findAllInRange function
    @Test
    public void testFindAllInRange() {
        // given
        String expected =
            "Int Range of 1 till 100 there are 1 Amicable_numbers.These are \n  1: = ( 220,284)	";
        // when
        amicableNumber.findAllInRange(1, 100);
        // then
        assertEquals(expected, outContent.toString().trim());
    }
}