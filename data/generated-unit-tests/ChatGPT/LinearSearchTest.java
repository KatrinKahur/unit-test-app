import org.junit.Test; 
import static org.junit.Assert.*;  
public class LinearSearchTest {     
    @Test     
    public void testFindValueInArray() {         
        Integer[] arr = {1, 2, 3, 4, 5};         
        LinearSearch search = new LinearSearch();         
        int result = search.find(arr, 3);         
        assertEquals(2, result);     
        
    }      
    @Test     
    public void testFindValueNotInArray() {         
        Integer[] arr = {1, 2, 3, 4, 5};         
        LinearSearch search = new LinearSearch();         
        int result = search.find(arr, 6);         
        assertEquals(-1, result);     
        
    }      
    @Test     
    public void testFindValueInEmptyArray() {         
        Integer[] arr = {};         
        LinearSearch search = new LinearSearch();         
        int result = search.find(arr, 1);         
        assertEquals(-1, result);     
        
    }      
    @Test     
    public void testFindValueInArrayOfLengthOne() {         
        Integer[] arr = {1};         
        LinearSearch search = new LinearSearch();         
        int result = search.find(arr, 1);         
        assertEquals(0, result);     
        
    } 
    
}
