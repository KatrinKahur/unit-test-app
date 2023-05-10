import org.junit.Test; 
import static org.junit.Assert.*; 
import static sorts.SortUtils.*;  
public class InsertionSortTest {      
    @Test     
    public void testSort() {         
        Integer[] array = {4, 2, 5, 1, 3};         
        Integer[] expected = {1, 2, 3, 4, 5};         
        assertArrayEquals(expected, new InsertionSort().sort(array));     
        
    }      
    @Test     
    public void testSortWithDuplicates() {         
        Integer[] array = {4, 2, 5, 2, 3};         
        Integer[] expected = {2, 2, 3, 4, 5};         
        assertArrayEquals(expected, new InsertionSort().sort(array));     
        
    }      
    @Test     
    public void testSortWithEmptyArray() {         
        Integer[] array = {};         
        Integer[] expected = {};         
        assertArrayEquals(expected, new InsertionSort().sort(array));     
        
    }      
    @Test     
    public void testSentinelSort() {         
        Integer[] array = {4, 2, 5, 1, 3};         
        Integer[] expected = {1, 2, 3, 4, 5};         
        assertArrayEquals(expected, new InsertionSort().sentinelSort(array));     
        
    }      
    @Test     
    public void testSentinelSortWithDuplicates() {         
        Integer[] array = {4, 2, 5, 2, 3};         
        Integer[] expected = {2, 2, 3, 4, 5};         
        assertArrayEquals(expected, new InsertionSort().sentinelSort(array));     
        
    }      
    @Test     
    public void testSentinelSortWithEmptyArray() {         
        Integer[] array = {};         
        Integer[] expected = {};         
        assertArrayEquals(expected, new InsertionSort().sentinelSort(array));     
        
    }      
    @Test     
    public void testMeasureApproxExecTime() {         
        Double[] array = {4.0, 2.0, 5.0, 1.0, 3.0};         
        double actual = InsertionSort.measureApproxExecTime(new InsertionSort()::sort, array);         
        assertTrue(actual >= 0.0);     
        
    }      
    @Test     
    public void testMeasureApproxExecTimeWithEmptyArray() {         
        Double[] array = {};         
        double actual = InsertionSort.measureApproxExecTime(new InsertionSort()::sort, array);         
        assertTrue(actual >= 0.0);     
        
    } 
    
}
