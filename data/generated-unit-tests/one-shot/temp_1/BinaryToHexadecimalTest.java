
public class BinaryToHexadecimalTest {
@Test
public void testBinToHex() {
String result = BinaryToHexadecimal.binToHex(10101);
Assert.assertEquals("15", result);
}

@Test
public void testBinToHex2() {
String result = BinaryToHexadecimal.binToHex(11110);
Assert.assertEquals("1E", result);
}

@Test
public void testBinToHex3() {
String result = BinaryToHexadecimal.binToHex(101010101);
Assert.assertEquals("155", result);
}

@Test
public void testBinToHex4() {
String result = BinaryToHexadecimal.binToHex(0);
Assert.assertEquals("", result);
}
}