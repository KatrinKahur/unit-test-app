
public class AmicableNumberTest {
@Test
public void testIsAmicableNumberShouldReturnTrue() {
Assert.assertTrue(AmicableNumber.isAmicableNumber(220, 284));
}

@Test
public void testIsAmicableNumberShouldReturnFalse() {
Assert.assertFalse(AmicableNumber.isAmicableNumber(495, 3));
}

@Test
public void testRecursiveCalcOfDividerSum() {
int result = AmicableNumber.recursiveCalcOfDividerSum(220, 220);
Assert.assertEquals(284, result);
}

@Test
public void testFindAllInRange() {
ByteArrayOutputStream baos = new ByteArrayOutputStream();
System.setOut(new PrintStream(baos));
AmicableNumber.findAllInRange(1, 100);
String result = baos.toString();
String expectedResult =
    "Int Range of 1 till 100 there are 2 Amicable_numbers.These are \n 1: = ( 220,284)\t2: = ( 1184,1210)\t\n";

Assert.assertEquals(expectedResult, result);
}
}