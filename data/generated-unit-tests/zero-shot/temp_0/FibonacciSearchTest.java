
import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciSearchTest {

    @Test
    public void testFind() {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        FibonacciSearch search = new FibonacciSearch();

        assertEquals(0, search.find(array, 1));
        assertEquals(4, search.find(array, 5));
        assertEquals(8, search.find(array, 9));
        assertEquals(-1, search.find(array, 10));
    }

    @Test
    public void testFindEmptyArray() {
        Integer[] array = {};
        FibonacciSearch search = new FibonacciSearch();

        assertEquals(-1, search.find(array, 1));
    }

    @Test
    public void testFindSingleElementArray() {
        Integer[] array = {1};
        FibonacciSearch search = new FibonacciSearch();

        assertEquals(0, search.find(array, 1));
        assertEquals(-1, search.find(array, 2));
    }

    @Test
    public void testFindDuplicateElements() {
        Integer[] array = {1, 2, 3, 3, 4, 5, 5, 5, 6, 7, 8, 9};
        FibonacciSearch search = new FibonacciSearch();

        assertEquals(2, search.find(array, 3));
        assertEquals(5, search.find(array, 5));
        assertEquals(10, search.find(array, 8));
        assertEquals(-1, search.find(array, 10));
    }

    @Test
    public void testFindStringArray() {
        String[] array = {"apple", "banana", "cherry", "date", "elderberry"};
        FibonacciSearch search = new FibonacciSearch();

        assertEquals(0, search.find(array, "apple"));
        assertEquals(2, search.find(array, "cherry"));
        assertEquals(4, search.find(array, "elderberry"));
        assertEquals(-1, search.find(array, "fig"));
    }
}