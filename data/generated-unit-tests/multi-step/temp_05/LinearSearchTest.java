
package searches;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinearSearchTest {
    
    @Test
    public void testFindValueInUnsortedArray() {
        Integer[] array = {5, 3, 2, 1, 4};
        LinearSearch search = new LinearSearch();
        int index = search.find(array, 2);
        assertEquals(2, index);
    }
    
    @Test
    public void testFindValueInSortedArray() {
        Integer[] array = {1, 2, 3, 4, 5};
        LinearSearch search = new LinearSearch();
        int index = search.find(array, 4);
        assertEquals(3, index);
    }
    
    @Test
    public void testFindValueNotInArray() {
        Integer[] array = {1, 2, 3, 4, 5};
        LinearSearch search = new LinearSearch();
        int index = search.find(array, 6);
        assertEquals(-1, index);
    }
    
    @Test
    public void testFindValueInArrayWithDuplicates() {
        Integer[] array = {1, 2, 3, 4, 4, 5};
        LinearSearch search = new LinearSearch();
        int index = search.find(array, 4);
        assertEquals(3, index);
    }
    
    @Test
    public void testFindValueInEmptyArray() {
        Integer[] array = {};
        LinearSearch search = new LinearSearch();
        int index = search.find(array, 1);
        assertEquals(-1, index);
    }
    
    @Test
    public void testFindValueInArrayWithOneElement() {
        Integer[] array = {1};
        LinearSearch search = new LinearSearch();
        int index = search.find(array, 1);
        assertEquals(0, index);
    }
}