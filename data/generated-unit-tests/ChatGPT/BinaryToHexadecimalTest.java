import org.junit.Test; 
import static org.junit.Assert.*;  
public class BinaryToHexadecimalTest {      
    @Test   public void testBinToHex_1() {     
        String expected = "0";     
        String actual = BinaryToHexadecimal.binToHex(0);     
        assertEquals(expected, actual);   
        
    }      
     
    @Test   
    public void testBinToHex_2() {     
        String expected = "A";     
        String actual = BinaryToHexadecimal.binToHex(1010);     
        assertEquals(expected, actual);   
        
    }      
    @Test   
    public void testBinToHex_3() {     
        String expected = "FF";     
        String actual = BinaryToHexadecimal.binToHex(11111111);     
        assertEquals(expected, actual);   
        
    }      
    @Test   
    public void testBinToHex_4() {     
        String expected = "4";     
        String actual = BinaryToHexadecimal.binToHex(100);     
        assertEquals(expected, actual);   
        
    }    
    
}
