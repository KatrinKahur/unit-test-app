
package searches;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinearSearchTest {

    @Test
    public void testFind() {
        Integer[] array = {1, 2, 3, 4, 5};
        LinearSearch linearSearch = new LinearSearch();
        int index = linearSearch.find(array, 3);
        assertEquals(2, index);
    }

    @Test
    public void testFindNotFound() {
        Integer[] array = {1, 2, 3, 4, 5};
        LinearSearch linearSearch = new LinearSearch();
        int index = linearSearch.find(array, 6);
        assertEquals(-1, index);
    }

    @Test
    public void testFindEmptyArray() {
        Integer[] array = {};
        LinearSearch linearSearch = new LinearSearch();
        int index = linearSearch.find(array, 1);
        assertEquals(-1, index);
    }

    @Test
    public void testFindNullArray() {
        Integer[] array = null;
        LinearSearch linearSearch = new LinearSearch();
        int index = linearSearch.find(array, 1);
        assertEquals(-1, index);
    }

    @Test
    public void testFindString() {
        String[] array = {"apple", "banana", "cherry", "date", "elderberry"};
        LinearSearch linearSearch = new LinearSearch();
        int index = linearSearch.find(array, "date");
        assertEquals(3, index);
    }

    @Test
    public void testFindStringNotFound() {
        String[] array = {"apple", "banana", "cherry", "date", "elderberry"};
        LinearSearch linearSearch = new LinearSearch();
        int index = linearSearch.find(array, "fig");
        assertEquals(-1, index);
    }
}