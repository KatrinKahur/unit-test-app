import org.junit.Test; 
import static org.junit.Assert.assertEquals;  
public class PerfectBinarySearchTest {      
    @Test     
    public void testBinarySearch() {         
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};         
        assertEquals(4, PerfectBinarySearch.binarySearch(arr, 5));     
        
    }      
    @Test     
    public void testBinarySearchNotFound() {         
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};         
        assertEquals(-1, PerfectBinarySearch.binarySearch(arr, 11));     
        
    }      
    @Test     
    public void testBinarySearchEmptyArray() {         
        int[] arr = {};         
        assertEquals(-1, PerfectBinarySearch.binarySearch(arr, 5));     
        
    }      
    @Test     
    public void testBinarySearchSingleElementArray() {         
        int[] arr = {5};         
        assertEquals(0, PerfectBinarySearch.binarySearch(arr, 5));     
        
    }  
    
}
