import org.junit.Test; 
import static org.junit.Assert.assertEquals;  
public class BinaryToDecimalTest {      
    @Test     
    public void testBinaryToDecimal() {         
        assertEquals(0, BinaryToDecimal.binaryToDecimal(0));         
        assertEquals(1, BinaryToDecimal.binaryToDecimal(1));         
        assertEquals(2, BinaryToDecimal.binaryToDecimal(10));         
        assertEquals(3, BinaryToDecimal.binaryToDecimal(11));         
        assertEquals(4, BinaryToDecimal.binaryToDecimal(100));         
        assertEquals(5, BinaryToDecimal.binaryToDecimal(101));         
        assertEquals(6, BinaryToDecimal.binaryToDecimal(110));         
        assertEquals(7, BinaryToDecimal.binaryToDecimal(111));         
        assertEquals(8, BinaryToDecimal.binaryToDecimal(1000));         
        assertEquals(9, BinaryToDecimal.binaryToDecimal(1001));         
        assertEquals(10, BinaryToDecimal.binaryToDecimal(1010));         
        assertEquals(11, BinaryToDecimal.binaryToDecimal(1011));         
        assertEquals(12, BinaryToDecimal.binaryToDecimal(1100));         
        assertEquals(13, BinaryToDecimal.binaryToDecimal(1101));         
        assertEquals(14, BinaryToDecimal.binaryToDecimal(1110));         
        assertEquals(15, BinaryToDecimal.binaryToDecimal(1111));     
        
    } 
    
}
