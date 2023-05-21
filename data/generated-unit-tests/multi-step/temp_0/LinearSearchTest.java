
package searches;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinearSearchTest {

    @Test
    public void testFind() {
        // Test case with a non-empty array and a value that exists in the array
        Integer[] arr1 = {1, 2, 3, 4, 5};
        int index1 = new LinearSearch().find(arr1, 3);
        assertEquals(2, index1);

        // Test case with a non-empty array and a value that does not exist in the array
        Integer[] arr2 = {1, 2, 3, 4, 5};
        int index2 = new LinearSearch().find(arr2, 6);
        assertEquals(-1, index2);

        // Test case with an empty array
        Integer[] arr3 = {};
        int index3 = new LinearSearch().find(arr3, 1);
        assertEquals(-1, index3);

        // Test case with an array with multiple occurrences of the value
        Integer[] arr4 = {1, 2, 3, 3, 4, 5};
        int index4 = new LinearSearch().find(arr4, 3);
        assertEquals(2, index4);
    }
}