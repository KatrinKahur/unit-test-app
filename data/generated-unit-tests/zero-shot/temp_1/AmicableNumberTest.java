
import org.junit.Test;
import static org.junit.Assert.*;

public class AmicableNumberTest {
    
    @Test
    public void testIsAmicableNumber() {
        assertTrue(AmicableNumber.isAmicableNumber(220, 284));
        assertTrue(AmicableNumber.isAmicableNumber(1184, 1210));
        assertTrue(AmicableNumber.isAmicableNumber(2620, 2924));
        assertFalse(AmicableNumber.isAmicableNumber(220, 221));
        assertFalse(AmicableNumber.isAmicableNumber(1184, 1185));
    }
    
    @Test
    public void testRecursiveCalcOfDividerSum() {
        assertEquals(284, AmicableNumber.recursiveCalcOfDividerSum(220, 220));
        assertEquals(220, AmicableNumber.recursiveCalcOfDividerSum(284, 284));
        assertEquals(1210, AmicableNumber.recursiveCalcOfDividerSum(1184, 1184));
        assertEquals(1184, AmicableNumber.recursiveCalcOfDividerSum(1210, 1210));
        assertEquals(2924, AmicableNumber.recursiveCalcOfDividerSum(2620, 2620));
        assertEquals(2620, AmicableNumber.recursiveCalcOfDividerSum(2924, 2924));
    }
    
    @Test
    public void testFindAllInRange() {
        // check output format and content for a range of 1 to 3000
        String expectedOutput =
                "Int Range of 1 till 3000 there are 3 Amicable_numbers.These are \n" +
                " 1: = ( 220,284)\t" +
                "2: = ( 1184,1210)\t" +
                "3: = ( 2620,2924)\t";
        
        mockSystemOutput(expectedOutput, () -> AmicableNumber.findAllInRange(1, 3000));
    }
    
    // helper method to mock the System.out.println method and capture the output
    private void mockSystemOutput(String expected, Runnable block) {
        final String newline = System.lineSeparator();
        final java.io.ByteArrayOutputStream out
                = new java.io.ByteArrayOutputStream(1024);
        System.setOut(new java.io.PrintStream(out));
        block.run();
        final String actual = out.toString();
        assertEquals(
                expected.trim().replace("\t", "    "),
                actual.trim().replace("\t", "    "));
        System.setOut(null);
    }
}