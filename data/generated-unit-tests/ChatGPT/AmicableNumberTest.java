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
        assertFalse(AmicableNumber.isAmicableNumber(2620, 2621));     
        
    }      
    @Test     
    public void testRecursiveCalcOfDividerSum() {         
        assertEquals(284, AmicableNumber.recursiveCalcOfDividerSum(220, 220));         
        assertEquals(220, AmicableNumber.recursiveCalcOfDividerSum(284, 284));         
        assertEquals(1210, AmicableNumber.recursiveCalcOfDividerSum(1184, 1184));   
        assertEquals(1184, AmicableNumber.recursiveCalcOfDividerSum(1210, 1210));   
        assertEquals(2924, AmicableNumber.recursiveCalcOfDividerSum(2620, 2620));   
        assertEquals(2620, AmicableNumber.recursiveCalcOfDividerSum(2924, 2924));   
        assertEquals(0, AmicableNumber.recursiveCalcOfDividerSum(1, 1));     
    } 
}
