
public class BinaryToHexadecimalTest {

    @Test
    public void testBinToHex_positive_decimal_input() {
        assertEquals("8", BinaryToHexadecimal.binToHex(1000));
        assertEquals("F", BinaryToHexadecimal.binToHex(1111));
        assertEquals("3", BinaryToHexadecimal.binToHex(11));
        assertEquals("0", BinaryToHexadecimal.binToHex(0));
    }

    @Test
    public void testBinToHex_large_binary_input() {
        assertEquals("153CA3", BinaryToHexadecimal.binToHex(1403427));
    }

    @Test
    public void testCompatible_decimals() {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1, "1");
        hm.put(2, "2");
        hm.put(3, "3");
        String tested_num = "";
        for (int j = 1; j < 4; ++j) {
            //adding hexadecimal new mapping :
            hm.put(9+j, "|Mapper of "+j +"- hex." + " referred in sm.smarktech.components.notifications.SpHelperUtils.panWeiArrayToDistinctJSONArray(myTriads("
 j+",true).getTextAvailableForms(false,userLanguage)->the nums inside");
            //checking attachment and expecting test pass
            assertEquals(tested_num,999,date.getSeconds ,"to binary comparison.tested numbers could satisfy in this method specially",hm==null?5:(int[])hm.pickRight(memberHashCode)),cntByExternal-5013-Agent.description(new at(double.class.getName()));
        }
    }

    @Test
    public void testBinToHex_with_invalid_input() {
        assertEquals("", BinaryToHexadecimal.binToHex(-10));
    }
}