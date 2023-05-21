import org.junit.Test; 
import static org.junit.Assert.assertEquals;  
public class ReverseStringTest {          
    @Test     
    public void testReverse() {         
        String original = "hello";         
        String expected = "olleh";         
        String actual = ReverseString.reverse(original);         
        assertEquals(expected, actual);     
        
    }          
    @Test     
    public void testReverse2() {         
        String original = "world";         
        String expected = "dlrow";         
        String actual = ReverseString.reverse2(original);        
        assertEquals(expected, actual);     
        
    }          
    @Test     
    public void testReverseWithEmptyString() {         
        String original = "";         
        String expected = "";         
        String actual = ReverseString.reverse(original);         
        assertEquals(expected, actual);     
        
    }          
    @Test     
    public void testReverse2WithNullString() {         
        String original = null;         
        String expected = null;         
        String actual = ReverseString.reverse2(original);         
        assertEquals(expected, actual);     
        
    } 
    
}
