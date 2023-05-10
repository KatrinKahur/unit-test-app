import org.junit.Test; 
import static org.junit.Assert.*;  
public class HexToOctTest {      
    @Test   
    public void testHex2decimal() {     
        assertEquals(10, HexToOct.hex2decimal("A"));     
        assertEquals(255, HexToOct.hex2decimal("FF"));     
        assertEquals(16711680, HexToOct.hex2decimal("FF0000"));     
        assertEquals(0, HexToOct.hex2decimal("0"));     
        assertEquals(16, HexToOct.hex2decimal("10"));     
        assertEquals(4357, HexToOct.hex2decimal("10ED"));   
        
    }      
    @Test   
    public void testDecimal2octal() {     
        assertEquals(7, HexToOct.decimal2octal(7));     
        assertEquals(10, HexToOct.decimal2octal(8));     
        assertEquals(777, HexToOct.decimal2octal(511));    
        assertEquals(0, HexToOct.decimal2octal(0));     
        assertEquals(12, HexToOct.decimal2octal(10));     
        assertEquals(16222, HexToOct.decimal2octal(5914));   
        
    } 
    
}
