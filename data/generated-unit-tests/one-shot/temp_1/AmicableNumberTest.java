
public class AmicableNumberTest {
@Test
public void testIsAmicableNumber() {
Assert.assertTrue(AmicableNumber.isAmicableNumber(220, 284));
Assert.assertFalse(AmicableNumber.isAmicableNumber(6, 28));
Assert.assertFalse(AmicableNumber.isAmicableNumber(1184, 1211));
Assert.assertFalse(AmicableNumber.isAmicableNumber(2620, 2925));
}

@Test
public void testRecursiveCalcOfDividerSum() {
Assert.assertEquals(284, AmicableNumber.recursiveCalcOfDividerSum(220, 220));
Assert.assertEquals(220, AmicableNumber.recursiveCalcOfDividerSum(284, 284));
Assert.assertEquals(1, AmicableNumber.recursiveCalcOfDividerSum(1, 1));
Assert.assertEquals(0, AmicableNumber.recursiveCalcOfDividerSum(0, 0));
}
}