
package searches;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinearSearchTest {

    @Test
    public void testFind() {
        Integer[] arr = {1, 2, 3, 4, 5};
        LinearSearch ls = new LinearSearch();
        assertEquals(2, ls.find(arr, 3));
        assertEquals(-1, ls.find(arr, 6));
    }

    @Test
    public void testFindEmptyArray() {
        Integer[] arr = {};
        LinearSearch ls = new LinearSearch();
        assertEquals(-1, ls.find(arr, 3));
    }

    @Test
    public void testFindString() {
        String[] arr = {"apple", "banana", "cherry", "date"};
        LinearSearch ls = new LinearSearch();
        assertEquals(1, ls.find(arr, "banana"));
        assertEquals(-1, ls.find(arr, "grape"));
    }

    @Test
    public void testFindNull() {
        Integer[] arr = {1, 2, 3, 4, 5};
        LinearSearch ls = new LinearSearch();
        assertEquals(-1, ls.find(arr, null));
    }
}