
@RunWith(JUnit4.class)
public class AmicableNumberTest {
    
    @Test
    public void testIsAmicableNumber() {
        assertFalse(AmicableNumber.isAmicableNumber(220, 221));
        assertTrue(AmicableNumber.isAmicableNumber(220, 284));
    }

    @Test
    public void testRecursiveCalcOfDividerSum() {
        assertEquals(284, AmicableNumber.recursiveCalcOfDividerSum(220, 220));
        assertEquals(220, AmicableNumber.recursiveCalcOfDividerSum(284, 284));
        assertEquals(12, AmicableNumber.recursiveCalcOfDividerSum(16, 15));
        assertEquals(1, AmicableNumber.recursiveCalcOfDividerSum(19, 18));
    }
    
    @Test
    public void testFindAllInRange() {
        // Edge cases:
        AmicableNumber.findAllInRange(1, 1);
        AmicableNumber.findAllInRange(1, 220);
        AmicableNumber.findAllInRange(219, 221);
        AmicableNumber.findAllInRange(275, 3000);
        
        // Other tests:
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        AmicableNumber.findAllInRange(Integer.MAX_VALUE - 10, Integer.MAX_VALUE); // Endpoint Overflow test
        String output = out.toString().trim();
        assertTrue(output.startsWith("Int Range of " + (Integer.MAX_VALUE - 10) + " till " + 
                          Integer.MAX_VALUE + " there are 1 Amicable_numbers.These are"));
        assertTrue(output.endsWith("( " + Integer.MAX_VALUE + ",2147478364)"));
    }

}