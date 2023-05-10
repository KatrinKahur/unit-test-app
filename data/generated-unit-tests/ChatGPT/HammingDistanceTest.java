import org.junit.Test; 
import static org.junit.Assert.*;  
public class HammingDistanceTest {      
    @Test     
    public void testEqualStrings() throws Exception {         
        assertEquals(0, HammingDistance.calculateHammingDistance("abc", "abc"));     
        
    }     
    @Test     
    public void testDifferentStrings() throws Exception {         
        assertEquals(3, HammingDistance.calculateHammingDistance("abc", "def"));     
        
    }      
    @Test(expected = Exception.class)     
    public void testDifferentLengthStrings() throws Exception {         
        HammingDistance.calculateHammingDistance("abc", "abcd");     
        
    }      
    @Test     
    public void testSingleCharStrings() throws Exception {         
        assertEquals(1, HammingDistance.calculateHammingDistance("a", "b"));     
        
    }      
    @Test     
    public void testEmptyStrings() throws Exception {         
        assertEquals(0, HammingDistance.calculateHammingDistance("", ""));     
        
    } 
    
}
