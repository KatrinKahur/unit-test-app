
```
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FibonacciSearchTest {

    @Test
    public void testFind() {
        FibonacciSearch search = new FibonacciSearch();
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = search.find(array, 5);
        assertEquals(4, index);
    }

    @Test
    public void testFindNonExistent() {
        FibonacciSearch search = new FibonacciSearch();
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = search.find(array, 11);
        assertEquals(-1, index);
    }

    @Test
    public void testFindEmptyArray() {
        FibonacciSearch search = new FibonacciSearch();
        Integer[] array = {};
        int index = search.find(array, 5);
        assertEquals(-1, index);
    }

    @Test
    public void testFindSingleElement() {
        FibonacciSearch search = new FibonacciSearch();
        Integer[] array = {5};
        int index = search.find(array, 5);
        assertEquals(0, index);
    }

    @Test
    public void testFindNegativeNumbers() {
        FibonacciSearch search = new FibonacciSearch();
        Integer[] array = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        int index = search.find(array, -3);
        assertEquals(2, index);
    }

    @Test
    public void testFindRepeatedNumbers() {
        FibonacciSearch search = new FibonacciSearch();
        Integer[] array = {1, 2, 2, 3, 4, 4, 4, 5};
        int index = search.find(array, 4);
        assertTrue(index == 4 || index == 5 || index == 6);
    }
}
```