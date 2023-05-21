
```
import static org.junit.Assert.*;

import org.junit.Test;

public class LinearSearchTest {

    private LinearSearch linearSearch = new LinearSearch();
    
    @Test
    public void testFindWhenArrayIsNull() {
        Integer[] array = null;
        int index = linearSearch.find(array, 1);
        assertEquals(-1, index);
    }
    
    @Test
    public void testFindWhenValueIsNull() {
        Integer[] array = {1, 2, 3};
        Integer value = null;
        int index = linearSearch.find(array, value);
        assertEquals(-1, index);
    }
    
    @Test
    public void testFindWhenValueIsNotPresentInArray() {
        Integer[] array = {1, 2, 3};
        int index = linearSearch.find(array, 4);
        assertEquals(-1, index);
    }
    
    @Test
    public void testFindWhenValueIsPresentAtFirstIndex() {
        Integer[] array = {1, 2, 3};
        int index = linearSearch.find(array, 1);
        assertEquals(0, index);
    }
    
    @Test
    public void testFindWhenValueIsPresentAtLastIndex() {
        Integer[] array = {1, 2, 3};
        int index = linearSearch.find(array, 3);
        assertEquals(2, index);
    }
    
    @Test
    public void testFindWhenValueIsPresentInMiddleOfArray() {
        Integer[] array = {1, 2, 3};
        int index = linearSearch.find(array, 2);
        assertEquals(1, index);
    }

}
```