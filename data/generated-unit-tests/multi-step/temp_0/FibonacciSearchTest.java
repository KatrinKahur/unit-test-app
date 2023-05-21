
package searches;

import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciSearchTest {

    @Test
    public void testFind() {
        // Test case 1: Empty array
        Integer[] arr1 = {};
        assertEquals(-1, new FibonacciSearch().find(arr1, 5));

        // Test case 2: Array with one element
        Integer[] arr2 = {5};
        assertEquals(0, new FibonacciSearch().find(arr2, 5));
        assertEquals(-1, new FibonacciSearch().find(arr2, 10));

        // Test case 3: Array with multiple elements
        Integer[] arr3 = {1, 3, 5, 7, 9, 11, 13};
        assertEquals(2, new FibonacciSearch().find(arr3, 5));
        assertEquals(6, new FibonacciSearch().find(arr3, 13));
        assertEquals(-1, new FibonacciSearch().find(arr3, 6));
        assertEquals(-1, new FibonacciSearch().find(arr3, 0));
        assertEquals(-1, new FibonacciSearch().find(arr3, 14));
    }
}