import org.junit.Test; 
import static org.junit.Assert.*; 
public class QuickSortTest {     
    @Test     
    public void testSortInteger() {         
        Integer[] arr = { 3, 7, 1, 9, 5 };         
        Integer[] expectedArr = { 1, 3, 5, 7, 9 };         
        QuickSort qs = new QuickSort();         
        assertArrayEquals(expectedArr, qs.sort(arr));     
        
    }  
    
    @Test     
    public void testSortString() {         
        String[] arr = { "apple", "banana", "orange", "pear", "kiwi" };         
        String[] expectedArr = { "apple", "banana", "kiwi", "orange", "pear" };         
        QuickSort qs = new QuickSort();         
        assertArrayEquals(expectedArr, qs.sort(arr));     
        
    }   
    
    @Test     
    public void testSortEmpty() {         
        Integer[] arr = {};        
        Integer[] expectedArr = {};        
        QuickSort qs = new QuickSort();         
        assertArrayEquals(expectedArr, qs.sort(arr));    
    }
    
    @Test     
    public void testSortSingle() {         
        Integer[] arr = { 5 };         
        Integer[] expectedArr = { 5 };         
        QuickSort qs = new QuickSort();         
        assertArrayEquals(expectedArr, qs.sort(arr));     
            
    }  
    
}
