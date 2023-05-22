
@RunWith(JUnit4.class)
public class BinaryToHexadecimalTest {

  @Test
  public void testBinToHex_0() {
    // Tests for input: 0
    assertEquals("0", BinaryToHexadecimal.binToHex(0));
  }

  @Test
  public void testBinToHex_1() {
    // Tests for input: 1
    assertEquals("1", BinaryToHexadecimal.binToHex(1));
  }

  @Test
  public void testBinToHex_10() {
    // Tests for input: 10 (two digit hexadecimal number)
    assertEquals("2", BinaryToHexadecimal.binToHex(10));
  }

  @Test
  public void testBinToHex_neg1() {
    // Tests for negative input value. function should return null.
    assertNull(BinaryToHexamdecimal(-1));
  }

  @Test
  public void testBinToHex_largeNumber() {
    // Tests for invalid input (above the range: valid binary numbers 0 or 1 only should be expected for binary input). function should abort and
    // return ""
    assertEquals("", BinaryToHexadecimal.binToHex(999999));
  }

  @Test
  public void challengeCoverageConditions() {
    // test challenge tests all MAP LOGIC - one challenge level  puzzle problem puzzlet sample matrix simersion interpolation negative fractions con error system mapa exort
    BinaryToHexadecimal subclassTests = new BinaryToHexadecimal();

    // check  ==================

HashMap exampleHashMapLoad  			fieldInteraction=16 (23 pairs ){[11: 'B'] ; ...}

hallengeHashMap key({-1=,2})  			methodView=charAt(int:index <PARAM_gString'>;< RET >
													methodMergePanel & keep alt constructors= copyMapUnsafe
	println method interact [true](
        ----------------      //////HashMap print first dictionary///// 
        [1011,                        {convert_binary "=======Test 1"));}

           				
        }

    }
}