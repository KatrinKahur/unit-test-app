import static org.junit.Assert.*;  
import org.junit.Test;  
public class BubbleSortTest {          
    private BubbleSort bubbleSort = new BubbleSort();          
    @Test     public void testSort() {         
        Integer[] array = {3, 5, 1, 4, 2};         
        Integer[] expected = {1, 2, 3, 4, 5};         
        assertArrayEquals(expected, bubbleSort.sort(array));     
        
    }          
    @Test     
    public void testSortWithDuplicates() {         
        Integer[] array = {3, 5, 1, 4, 2, 2, 4};         
        Integer[] expected = {1, 2, 2, 3, 4, 4, 5};         
        assertArrayEquals(expected, bubbleSort.sort(array));     
        
    }          
    @Test     
    public void testSortAlreadySorted() {         
        Integer[] array = {1, 2, 3, 4, 5};         
        Integer[] expected = {1, 2, 3, 4, 5};         
        assertArrayEquals(expected, bubbleSort.sort(array));     
        
    }          
    @Test     
    public void testSortEmptyArray() {         
        Integer[] array = {};         
        Integer[] expected = {};         
        assertArrayEquals(expected, bubbleSort.sort(array));     
        
    }          
    @Test     
    public void testSortSingleElementArray() {         
        Integer[] array = {5};         
        Integer[] expected = {5};         
        assertArrayEquals(expected, bubbleSort.sort(array));     
        
    } 
    
}
