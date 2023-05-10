
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BinaryToHexadecimalTest {
    
    @Test
    public void testBinToHex1() {
        int binary = 100;
        String expectedHex = "4";
        String actualHex = BinaryToHexadecimal.binToHex(binary);
        assertEquals(expectedHex, actualHex);
    }
    
    @Test
    public void testBinToHex2() {
        int binary = 10101010;
        String expectedHex = "AA";
        String actualHex = BinaryToHexadecimal.binToHex(binary);
        assertEquals(expectedHex, actualHex);
    }
    
    @Test
    public void testBinToHex3() {
        int binary = 1111;
        String expectedHex = "F";
        String actualHex = BinaryToHexadecimal.binToHex(binary);
        assertEquals(expectedHex, actualHex);
    }
    
    @Test
    public void testBinToHex4() {
        int binary = 0;
        String expectedHex = "0";
        String actualHex = BinaryToHexadecimal.binToHex(binary);
        assertEquals(expectedHex, actualHex);
    }
    
    @Test
    public void testBinToHex5() {
        int binary = 100000000;
        String expectedHex = "20";
        String actualHex = BinaryToHexadecimal.binToHex(binary);
        assertEquals(expectedHex, actualHex);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testBinToHex6() {
        int binary = -101;
        BinaryToHexadecimal.binToHex(binary);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testBinToHex7() {
        int binary = 101.01;
        BinaryToHexadecimal.binToHex(binary);
    }
}