
public class AmicableNumberTest {
    @Test
    public void testRecursiveCalcOfDividerSum() {
        Assert.assertEquals(284, AmicableNumber.recursiveCalcOfDividerSum(220, 220));
        Assert.assertEquals(220, AmicableNumber.recursiveCalcOfDividerSum(284, 284));
        Assert.assertEquals(0, AmicableNumber.recursiveCalcOfDividerSum(1, 1));
    }

    @Test
    public void testIsAmicableNumber() {
        Assert.assertTrue(AmicableNumber.isAmicableNumber(220, 284));
        Assert.assertFalse(AmicableNumber.isAmicableNumber(1184, 1211));
    }

    @Test
    public void testFindAllInRange() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        AmicableNumber.findAllInRange(1, 3000);

        String expectedOutput =
            "Int Range of 1 till 3000 there are 3 Amicable_numbers.These are \n " +
            "1: = ( 220,284)\t2: = ( 1184,1210)\t3: = ( 2620,2924)\t";

        Assert.assertEquals(expectedOutput, outContent.toString());
    }
}