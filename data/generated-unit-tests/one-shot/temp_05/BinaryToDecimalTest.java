
public class BinaryToDecimalTest {
@Test
public void testBinaryToDecimal() {
Assert.assertEquals(0, BinaryToDecimal.binaryToDecimal(0));
Assert.assertEquals(1, BinaryToDecimal.binaryToDecimal(1));
Assert.assertEquals(2, BinaryToDecimal.binaryToDecimal(10));
Assert.assertEquals(3, BinaryToDecimal.binaryToDecimal(11));
Assert.assertEquals(4, BinaryToDecimal.binaryToDecimal(100));
Assert.assertEquals(5, BinaryToDecimal.binaryToDecimal(101));
Assert.assertEquals(6, BinaryToDecimal.binaryToDecimal(110));
Assert.assertEquals(7, BinaryToDecimal.binaryToDecimal(111));
Assert.assertEquals(8, BinaryToDecimal.binaryToDecimal(1000));
Assert.assertEquals(9, BinaryToDecimal.binaryToDecimal(1001));
Assert.assertEquals(10, BinaryToDecimal.binaryToDecimal(1010));
Assert.assertEquals(11, BinaryToDecimal.binaryToDecimal(1011));
Assert.assertEquals(12, BinaryToDecimal.binaryToDecimal(1100));
Assert.assertEquals(13, BinaryToDecimal.binaryToDecimal(1101));
Assert.assertEquals(14, BinaryToDecimal.binaryToDecimal(1110));
Assert.assertEquals(15, BinaryToDecimal.binaryToDecimal(1111));
}
}