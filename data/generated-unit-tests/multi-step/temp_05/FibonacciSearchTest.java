
package searches;

import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciSearchTest {

    @Test
    public void testFindEmptyArray() {
        Integer[] array = {};
        FibonacciSearch search = new FibonacciSearch();
        assertEquals(-1, search.find(array, 5));
    }

    @Test
    public void testFindOneElementArray() {
        Integer[] array = {5};
        FibonacciSearch search = new FibonacciSearch();
        assertEquals(0, search.find(array, 5));
        assertEquals(-1, search.find(array, 6));
    }

    @Test
    public void testFindElementNotFound() {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        FibonacciSearch search = new FibonacciSearch();
        assertEquals(-1, search.find(array, 8));
    }

    @Test
    public void testFindElementFound() {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        FibonacciSearch search = new FibonacciSearch();
        assertEquals(2, search.find(array, 3));
        assertEquals(6, search.find(array, 7));
    }

    @Test
    public void testFindDuplicateElements() {
        Integer[] array = {1, 2, 3, 3, 4, 5, 5, 5, 6, 7};
        FibonacciSearch search = new FibonacciSearch();
        assertEquals(2, search.find(array, 3));
        assertEquals(4, search.find(array, 4));
        assertEquals(5, search.find(array, 5));
        assertEquals(8, search.find(array, 6));
        assertEquals(9, search.find(array, 7));
    }
}