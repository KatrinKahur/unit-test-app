
```
import static org.junit.Assert.*;
import org.junit.Test;

public class AmicableNumberTest {

   @Test
   public void testIsAmicableNumberTrue() {
      assertTrue(AmicableNumber.isAmicableNumber(220, 284)); 
   }

   @Test
   public void testIsAmicableNumberFalse(){
      assertFalse(AmicableNumber.isAmicableNumber(100, 500)); 
   }

   @Test
   public void testRecursiveCalcOfDividerSum(){
      assertEquals(284,AmicableNumber.recursiveCalcOfDividerSum(220,220));
      assertEquals(1184, AmicableNumber.recursiveCalcOfDividerSum(1210, 1210)); 
   } 
} 

```